from typing import List


class node:
    data = -1
    next = None

    def __init__(self, val):
        self.data = val

    def __repr__(self):
        curr = self
        seen = set()
        s = ""
        while curr:
            if curr in seen:
                s += " loop"
                break
            seen.add(curr)

            s += str(curr.data)
            s += " -> "
            curr = curr.next
        return s


