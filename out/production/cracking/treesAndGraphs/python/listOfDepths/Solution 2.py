from treesAndGraphs.python.utility.binary_tree_node import node, create_binary_tree_from_sorted_array, print_binary_tree
from linkedList.python.linked_list_node import node as linked_list
from typing import List


def create_linked_list_from_binary_tree(root: node) -> List[linked_list]:
    return create_linked_list_from_binary_tree_recursive(root, [], 1)


def create_linked_list_from_binary_tree_recursive(root: node, res: List[linked_list], level: int) -> List[linked_list]:
    if len(res) < level:
        res.append(linked_list(root.value))
    else:
        temp = res[level - 1]

        while temp.next:
            temp = temp.next
        temp.next = linked_list(root.value)
    if root.left:
        create_linked_list_from_binary_tree_recursive(root.left, res, level + 1)

    if root.right:
        create_linked_list_from_binary_tree_recursive(root.right, res, level + 1)

    return res


def main():
    source = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    root = create_binary_tree_from_sorted_array(source)
    res = create_linked_list_from_binary_tree(root)

    print_binary_tree(root)
    print()

    print("[")
    for i in res:
        print("\t", end="")
        print(repr(i))
    print("]")


if __name__ == "__main__":
    main()
