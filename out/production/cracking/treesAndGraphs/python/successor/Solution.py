from treesAndGraphs.python.utility.binary_tree_node import node, create_binary_tree_from_dictionary, get_node_by_value
from treesAndGraphs.python.utility.view_binary_tree import print_tree


def successor(root: node) -> node | None:
    if root is None:
        return None

    if root.right:
        return left_most_node(root.right)
    else:
        curr = root
        parent = root.parent
        while parent is not None and parent.left != curr:
            curr = curr.parent
            parent = parent.parent
        return parent


def left_most_node(root: node) -> node | None:
    if root is None:
        return None
    while root.left is not None:
        root = root.left
    return root


def main():
    d = {
        1: [-1, -1],
        2: [1, -1],
        3: [2, 4],
        4: [-1, -1],
        5: [3, 7],
        7: [-1, 9],
        9: [10, 13],
        10: [-1, -1],
        13: [-1, -1]
    }
    b = create_binary_tree_from_dictionary(d, 5)
    print_tree(b)
    three = get_node_by_value(b, 3)
    one = get_node_by_value(b, 1)
    four = get_node_by_value(b, 4)

    print("Successor of 3 in node traversal")
    print("Expected: 4")
    print("Result: " + str(successor(three).value))
    print()

    print("Successor of 1 in node traversal")
    print("Expected: 2")
    print("Result: " + str(successor(one).value))
    print()

    print("Successor of 4 in node traversal")
    print("Expected: 5")
    print("Result: " + str(successor(four).value))


if __name__ == "__main__":
    main()
