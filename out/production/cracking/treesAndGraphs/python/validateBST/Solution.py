from treesAndGraphs.python.utility.binary_tree_node import node, create_binary_tree_from_sorted_array
from treesAndGraphs.python.utility.view_binary_tree import print_tree


def validate(root: node) -> bool:
    return validate_r(root, None, None)


def validate_r(root: node, low: any, high: any) -> bool:
    if not root:
        return True
    if (low is not None and low > root.value) or (high is not None and high < root.value):
        return False

    return validate_r(root.left, low, root.value) and validate_r(root.right, root.value, high)


def main():
    init = [i for i in range(16)]
    root = create_binary_tree_from_sorted_array(init)
    print_tree(root)
    print(validate(root))
    print()

    override = root.right
    override.value = 99
    print_tree(root)
    print(validate(root))


if __name__ == "__main__":
    main()
