from typing import List
from node import node


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

