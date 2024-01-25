from linkedList.python.node import node


def deleteMiddleNode(n: node) -> None:
    curr = n
    prev = None
    while curr.next:
        curr.data = curr.next.data
        prev = curr
        curr = curr.next
    prev.next = None
