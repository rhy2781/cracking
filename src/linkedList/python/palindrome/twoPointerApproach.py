from linkedList.python.node import node


def is_palindrome(curr: node) -> bool:
    contents = []
    while curr:
        contents.append(curr.data)
        curr = curr.next

    left = 0
    right = len(contents) - 1
    while left < right:
        if contents[left] != contents[right]:
            return False
        left += 1
        right -= 1
    return True
