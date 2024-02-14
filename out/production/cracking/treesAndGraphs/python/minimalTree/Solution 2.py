from treesAndGraphs.python.utility.binary_tree_node import print_binary_tree, create_binary_tree_from_sorted_array


def main():
    source = [1, 2, 5, 7, 8, 13, 23, 34, 54, 68, 79, 100]
    node = create_binary_tree_from_sorted_array(source)
    print_binary_tree(node)


if __name__ == "__main__":
    main()
