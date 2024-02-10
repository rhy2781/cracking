from treesAndGraphs.python.utility.binary_tree_node import create_binary_tree_from_sorted_array
from treesAndGraphs.python.utility.view_binary_tree import print_tree


def main():
    init = [i for i in range(28)]
    root = create_binary_tree_from_sorted_array(init)
    print_tree(root)


if __name__ == "__main__":
    main()
