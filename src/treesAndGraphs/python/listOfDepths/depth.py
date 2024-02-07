from treesAndGraphs.python.minimalTree import minimalHeight
from treesAndGraphs.python.binary_tree_node import binary_tree_node
from treesAndGraphs.python.linked_list import linked_list
from typing import List


def createLinkedListsFromBinaryTree(root: binary_tree_node) -> List[linked_list]:
    return createLinkedListsFromBinaryTree_R(root, [], 1)


def createLinkedListsFromBinaryTree_R(root: binary_tree_node, res: List[linked_list], level: int) -> List[linked_list]:
    if len(res) < level:
        res.append(linked_list(root.value))
    else:
        temp = res[level - 1]

        while temp.next:
            temp = temp.next
        temp.next = linked_list(root.value)
    if root.left:
        createLinkedListsFromBinaryTree_R(root.left, res, level + 1)

    if root.right:
        createLinkedListsFromBinaryTree_R(root.right, res, level + 1)

    return res







