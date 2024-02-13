import random
from typing import List, Dict


class node:

    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
        self.parent = None


def create_binary_tree_from_sorted_array(source: List[int]) -> node:
    return create_binary_tree_from_sorted_array_r(source, 0, len(source) - 1)


def create_binary_tree_from_sorted_array_r(source: List[int], start: int, end: int) -> node | None:
    if end < start:
        return None
    mid = (start + end) // 2

    parent = node(source[mid])

    parent.left = create_binary_tree_from_sorted_array_r(source, start, mid - 1)
    parent.right = create_binary_tree_from_sorted_array_r(source, mid + 1, end)
    return parent


def create_binary_tree_from_dictionary(d: Dict[int, List[int]], parent: int) -> node:
    mappings = {
        -1: None
    }
    for k in d:
        mappings[k] = node(k)

    for k, v in d.items():
        n = mappings[k]
        left_child = mappings[d[k][0]]
        right_child = mappings[d[k][1]]

        n.left = left_child
        if n.left is not None:
            n.left.parent = n

        n.right = right_child
        if n.right is not None:
            n.right.parent = n

    return mappings.get(parent)


def get_node_by_value(root: node, value: int) -> node:
    if root is None:
        return None
    if root.value == value:
        return root

    # root value is smaller
    # we look to greater values a.k.a. to the right
    if root.value < value:
        return get_node_by_value(root.right, value)
    else:
        return get_node_by_value(root.left, value)