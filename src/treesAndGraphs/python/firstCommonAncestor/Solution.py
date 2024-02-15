
from treesAndGraphs.python.utility.binary_tree_node import node, create_binary_tree_from_dictionary, get_node_by_value
from treesAndGraphs.python.utility.view_binary_tree import print_tree

def height(root: node) -> int:
    if not root:
        return 0
    return max(height(root.left), height(root.right)) + 1

def goUp(root: node, h: int) -> node:
    while h != 0:
        root = root.parent
        h -= 1
    return root

def ancestor(q: node, p: node):
    if p == q:
        return p
    q_height = height(q)
    p_height = height(p)

    delta = abs(q_height - p_height)

    taller = q if q_height > p_height else p
    shorter = p if q_height > p_height else q

    shorter = goUp(shorter, delta)

    while taller != shorter:
        taller = taller.parent
        shorter = shorter.parent

    return shorter


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

    one = get_node_by_value(b, 1)
    seven = get_node_by_value(b, 7)
    nine = get_node_by_value(b, 9)

    print("Finding Ancestor of 9 and 1")
    print_tree(ancestor(one, nine))

    print("Finding Ancestor of 7 and 9")
    print_tree(ancestor(seven, nine))


if __name__ == "__main__":
    main()
