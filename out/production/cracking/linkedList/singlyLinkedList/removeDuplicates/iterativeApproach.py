from linkedList.singlyLinkedList.node import Node


def removeDuplicate(n: Node):
    s = set()
    prev = None
    while n:
        if n.data in s:
            prev.next = n.next
        else:
            s.add(n.data)
            prev = n
        n = n.next

