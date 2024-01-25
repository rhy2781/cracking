import collections

from linkedList.python.node import node


def is_palindrome(curr: node) -> bool:
    contents = collections.defaultdict(int)
    while curr:
        contents[curr.data] += 1
        curr = curr.next

    one_diff = False
    for v in contents.values():
        if v % 2 == 1:
            if one_diff:
                return False
            one_diff = True
    return True
