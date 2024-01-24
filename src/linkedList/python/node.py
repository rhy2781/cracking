from typing import List


class node:
    data = -1
    next = None

    def __init__(self, val):
        self.data = val

    def __repr__(self):
        curr = self
        s = ""
        while curr:
            s += str(curr.data)
            s += " -> "
            curr = curr.next
        return s


