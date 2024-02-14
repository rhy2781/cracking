from _collections import deque

from treesAndGraphs.python.utility.binary_tree_node import node
from typing import List


def level_order_traversal(root: node) -> List[List[int]]:
    res = [[] * height(root)]
    q = deque((0, root))
    while q:
        k, curr = q.popleft()
        res[k].append(curr.value)

        if curr.left:
            q.append((k + 1, root.left))
        if curr.right:
            q.append(k + 1, root.right)
    return res


def height(root: node) -> int:
    if not root:
        return 0
    return max(height(root.left), height(root.right)) + 1


def duplicate_tree(root: node) -> node | None:
    if not root:
        return None
    parent = node(root.value)
    root.left = duplicate_tree(root.left)
    root.right = duplicate_tree(root.right)
    return parent


