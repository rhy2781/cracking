from linkedList.python.node import node


def partition(n: node, k: int) -> node:
    parent_less, parent_greater = node(0), node(0)
    pointer_less, pointer_greater = parent_less, parent_greater

    while n:
        if n.data >= k:
            pointer_greater.next = n
            pointer_greater = n
        else:
            pointer_less.next = n
            pointer_less = n
        n = n.next

    pointer_less.next = parent_greater.next
    return parent_less.next
