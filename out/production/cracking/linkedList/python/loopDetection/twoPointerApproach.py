from linkedList.python.node import node


def loopDetection(curr: node) -> node | None:
    slow = curr
    fast = curr
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            break

    if not fast or not fast.next:
        return None

    slow = curr
    while slow != fast:
        slow = slow.next
        fast = fast.next
    return slow

