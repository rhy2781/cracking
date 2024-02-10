from treesAndGraphs.python.utility.binary_tree_node import create_binary_tree_from_sorted_array
from treesAndGraphs.python.utility.view_binary_tree import print_tree


def main():
    source = [1, 2, 5, 7, 8, 13, 23, 34, 54, 68, 79, 99]
    node = create_binary_tree_from_sorted_array(source)
    print_tree(node)


if __name__ == "__main__":
    main()
