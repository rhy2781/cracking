class binary_tree_node:

    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


def print_binary_tree(root: binary_tree_node) -> None:
    print_binary_tree_r(root, 0)


def print_binary_tree_r(root: binary_tree_node, level: int) -> None:
    if root.left:
        print_binary_tree_r(root.left, level + 1)

    for i in range(level):
        print("\t", end="")
    print(root.value)

    if root.right:
        print_binary_tree_r(root.right, level + 1)

