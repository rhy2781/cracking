from linkedList.python.node import node


def deleteMiddleNode(curr: node) -> None:
    if not curr or not curr.next:
        return
    n = curr.next
    curr.data = n.data
    curr.next = n.next
