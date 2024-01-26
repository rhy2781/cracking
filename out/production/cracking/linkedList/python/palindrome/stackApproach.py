from linkedList.python.node import node

def is_palindrome(curr: node) -> bool:
    stack = []
    slow, fast = curr, curr
    while fast and fast.next:
        stack.append(slow.data)
        slow = slow.next
        fast = fast.next.next
    if fast:
        slow = slow.next
    while slow:
        if slow.data != stack.pop():
            return False
        slow = slow.next
    return True
