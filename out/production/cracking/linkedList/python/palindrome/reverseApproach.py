from linkedList.python.node import node


def is_palindrome(curr: node) -> bool:
    def reverse(c: node) -> node:
        prev = None
        while c:
            n = node(c.data)
            n.next = prev
            prev = n
            c = c.next
        return prev

    def isEqual(one: node, two: node) -> bool:
        while one and two:
            if one.data != two.data:
                return False
        return True

    reverse = reverse(curr)
    return isEqual(curr, reverse)
    