from linkedList.singlyLinkedList.node import node


def kth(n: node, k: int) -> node:
    curr = node
    while k > 0:
        if not curr:
            return None
        curr = curr.next
        k -= 1

    while curr:
        curr = curr.next
        n = n.next
    return n