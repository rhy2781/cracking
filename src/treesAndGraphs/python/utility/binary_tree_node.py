import random
from typing import List


class node:

    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


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
