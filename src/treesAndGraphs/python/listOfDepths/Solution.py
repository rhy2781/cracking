from treesAndGraphs.python.minimalTree.minimalHeight import create_binary_tree_from_sorted_array
from treesAndGraphs.python.listOfDepths import depth
from treesAndGraphs.python.binary_tree_node import print_binary_tree


def main():
    source = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    root = create_binary_tree_from_sorted_array(source)
    res = depth.createLinkedListsFromBinaryTree(root)

    print_binary_tree(root)
    print()

    print("[")
    for i in res:
        print("\t", end="")
        print(repr(i))
    print("]")


if __name__ == "__main__":
    main()
