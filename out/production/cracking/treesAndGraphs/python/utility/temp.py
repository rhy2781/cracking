from treesAndGraphs.python.utility.binary_tree_node import create_binary_tree_from_sorted_array
from treesAndGraphs.python.utility.view_binary_tree import level_order_traversal, padding_base_combo, print_tree


def main():
    init = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    root = create_binary_tree_from_sorted_array(init)
    # print(level_order_traversal(root))
    print_tree(root)



if __name__ == "__main__":
    main()
