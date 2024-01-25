from linkedList.python.node import node
from linkedList.python.helper import create_node_from_dictionary
import iterativeApproach


def main():
    init = [
        [3, 1],
        [5, 2],
        [8, 3],
        [5, 4],
        [10, 5],
        [2, 6],
        [1, None]
    ]
    n = create_node_from_dictionary(init)
    print(n)
    res = iterativeApproach.partition(n, 5)
    print(res)


if __name__ == "__main__":
    main()