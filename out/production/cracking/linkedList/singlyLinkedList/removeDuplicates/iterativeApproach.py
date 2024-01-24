from linkedList.singlyLinkedList.node import node


def removeDuplicate(n: node):
    s = set()
    prev = None
    while n:
        if n.data in s:
            prev.next = n.next
        else:
            s.add(n.data)
            prev = n
        n = n.next

