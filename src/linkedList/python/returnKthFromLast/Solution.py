from linkedList.python.returnKthFromLast import runnerApproach
from linkedList.python.helper import create_node_from_dictionary


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
