from linkedList.python.node import node
from linkedList.python.helper import get_kth_node


def intersection(one: node, two: node) -> node | None:
    def length(c: node) -> int:
        k = 1
        while c:
            k += 1
            c = c.next
        return k

    p1 = one
    p2 = two
    while p1.next:
        p1 = p1.next
        p2 = p2.next

    if p1 != p2:
        return None

    length1 = length(one)
    length2 = length(two)

    res = one if length1 < length2 else two
    return get_kth_node(res, abs(length1 - length2) + 1)










