from treesAndGraphs.python.binary_tree_node import binary_tree_node
from typing import List


def create_binary_tree_from_sorted_array(source: List[int]) -> binary_tree_node:
    return create_binary_tree_from_sorted_array_r(source, 0, len(source) - 1)


def create_binary_tree_from_sorted_array_r(source: List[int], start: int, end: int) \
        -> binary_tree_node | None:
    if end < start:
        return None
    mid = (start + end) // 2

    parent = binary_tree_node(source[mid])

    parent.left = create_binary_tree_from_sorted_array_r(source, start, mid - 1)
    parent.right = create_binary_tree_from_sorted_array_r(source, mid + 1, end)
    return parent
