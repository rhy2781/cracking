import runnerApproach
from typing import List
from linkedList.singlyLinkedList.node import node


def create_node_from_dictionary(l: List[List]) -> node:
    mapping = {}
    for index, pair in enumerate(l):
        mapping[index] = node(pair[0])
    for index, pair in enumerate(l):
        n = mapping[index]
        if pair[1]:
            n.next = mapping[pair[1]]
    return mapping[0]


def main():
    l = [
        [1, 1],
        [2, 2],
        [3, 3],
        [4, 4],
        [1, 5],
        [2, 6],
        [5, None]
    ]
    n = create_node_from_dictionary(l)
    ra = runnerApproach
    print(n)
    print(ra.kth(n, 3))
    print(ra.kth(n, 6))
    print(ra.kth(n, 7))




if __name__ == "__main__":
    main()