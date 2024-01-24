from typing import Any

from linkedList.node import node


def kth(n: node, k: int) -> node | None | Any:
    curr = n
    while k > 0:
        if curr is None:
            return None
        curr = curr.next
        k -= 1

    while curr:
        curr = curr.next
        n = n.next
    return n
