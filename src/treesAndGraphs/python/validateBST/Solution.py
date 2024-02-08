from treesAndGraphs.python.utility.binary_tree_node import node, create_binary_tree_from_sorted_array, print_binary_tree


def validate(root: node) -> bool:
    return validate_r(root, None, None)


def validate_r(root:node, low: any, high: any) -> bool:
    if not root:
        return True
    if (low is not None and low > root.value) or (high is not None and high < root.value):
        return False

    return validate_r(root.left, low, root.value) and validate_r(root.right, root.value, high)


def main():
    init = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
    root = create_binary_tree_from_sorted_array(init)
    print_binary_tree(root)
    print(validate(root))
    print()

    override = root.right
    override.value = 100
    print_binary_tree(root)
    print(validate(root))


if __name__ == "__main__":
    main()
