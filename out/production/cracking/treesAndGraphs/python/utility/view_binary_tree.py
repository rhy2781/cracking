from _collections import deque

from treesAndGraphs.python.utility.binary_tree_node import node
from typing import List


def print_tree(root: node) -> None:
    combo = padding_base_combo(root)
    duplicate = duplicate_tree(root)
    fill_tree_with_zeroes(duplicate)
    level_order = level_order_traversal(duplicate)

    res = ['' for i in range(len(combo))]
    for i in range(len(combo)):
        padding = combo[i][0]
        spacing = combo[i][1]
        line = res[i]
        level = level_order[i]

        line += ' ' * padding
        for j in range(len(level)):
            value = level[j]
            if value != -1:
                line += '{:2}'.format(value)
            else:
                line += ' ' * 2
            if j != len(level) - 1:
                line += ' ' * spacing
        line += ' ' * padding
        res[i] = line

    total_length = len(res[0])
    print("|" + '=' * total_length + "|")
    for i in range(len(res)):
        print("|", end="")
        print(res[i], end="")
        print("|")
        if i != len(res) - 1:
            print("|" + ' ' * total_length + "|")
    print("|" + '=' * total_length + "|")










def padding_base_combo(root: node) -> List[List[int]]:
    space_value = 8
    increment = 5

    h = height(root)
    combo = [[0, 0] for _ in range(h)]
    combo[h - 1][1] = space_value

    bottom_nodes = 2**(h - 1)
    bottom_space = (bottom_nodes - 1) * space_value+ (bottom_nodes * 2)

    for i in range(h - 2, -1, -1):
        nodes_in_level = 2**i
        padding = combo[i + 1][0] + increment
        space_in_level = bottom_space - (nodes_in_level * 2)

        combo[i][0] = padding
        if i != 0:
            combo[i][1] = int((space_in_level - (2 * padding)) / (nodes_in_level - 1))
        increment *= 2
    return combo


def fill_tree_with_zeroes(root: node) -> None:
    h = height(root)
    fill_tree_with_zeroes_r(root, h - 1)


def fill_tree_with_zeroes_r(root: node, h: int) -> None:
    if h == 0:
        return
    if root.right is None:
        root.right = node(-1)
    if root.left is None:
        root.left = node(-1)
    fill_tree_with_zeroes_r(root.left, h - 1)
    fill_tree_with_zeroes_r(root.right, h - 1)


def level_order_traversal(root: node) -> List[List[int]]:
    res = [[] for _ in range(height(root))]
    q = deque()
    q.append((0, root))
    while q:
        k, curr = q.popleft()
        res[k].append(curr.value)
        if curr.left is not None:
            q.append((k + 1, curr.left))
        if curr.right is not None:
            q.append((k + 1, curr.right))
    return res


def height(root: node) -> int:
    if not root:
        return 0
    return max(height(root.left), height(root.right)) + 1


def duplicate_tree(root: node) -> node | None:
    if root is None:
        return None
    parent = node(root.value)
    parent.left = duplicate_tree(root.left)
    parent.right = duplicate_tree(root.right)
    return parent


