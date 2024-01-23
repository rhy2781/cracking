from typing import List, Dict


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


# d contains value -> index of next pointer
def create_node_from_dictionary(l: List[List]) -> node:
    mapping = {}
    for index, pair in enumerate(l):
        mapping[index] = node(pair[0])
    for index, pair in enumerate(l):
        n = mapping[index]
        if pair[1]:
            n.next = mapping[pair[1]]
    return mapping[0]

