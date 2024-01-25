from typing import List
from linkedList.python.node import node


# create a linked list from a list containing pairs of numbers
# the pair specifies the [node value, index of next node]
def create_node_from_dictionary(l: List[List]) -> node:
    mapping = {}
    for index, pair in enumerate(l):
        mapping[index] = node(pair[0])
    for index, pair in enumerate(l):
        n = mapping[index]
        if pair[1]:
            n.next = mapping[pair[1]]
    return mapping[0]


# returns the kth node from the head where k = 1 represents the head of the list
def get_kth_node(n: node, k: int) -> node | None:
    k -= 1
    while k > 0:
        if not n:
            return None
        k -= 1
        n = n.next
    return n


# create a linked list from a single list representing the numbers
# the linked list that is created will be simply pointing each element to the next until the end
def create_node_from_list(l:List[int]) -> node:
    mapping = {}
    for index, value in enumerate(l):
        mapping[index] = node(value)

    for i in mapping:
        if i + 1 in mapping:
            n = mapping[i]
            n.next = mapping[i + 1]
    return mapping[0]
