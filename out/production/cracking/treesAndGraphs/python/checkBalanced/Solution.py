from treesAndGraphs.python.utility.binary_tree_node import create_binary_tree_from_sorted_array, node
from treesAndGraphs.python.utility.view_binary_tree import print_tree

def checkBalanced(root: node) -> bool:
    if not root:
        return True
    left = height(root.left)
    right = height(root.right)

    if abs(right - left) > 1:
        return False
    return checkBalanced(root.right) and checkBalanced(root.left)


def height(root: node) -> int:
    if not root:
        return 0
    return max(height(root.right), height(root.left)) + 1


def main():
    root = node(10)
    root.right = node(15)
    root.left = node(3)

    left = root.left
    left.right = node(4)
    left.right.right = node(5)
    left.right.right.right = node(9)

    print_tree(root)
    print(checkBalanced(root))
    print()

    init = [i for i in range(14)]
    root1 = create_binary_tree_from_sorted_array(init)
    print_tree(root1)
    print(checkBalanced(root1))


if __name__ == "__main__":
    main()
