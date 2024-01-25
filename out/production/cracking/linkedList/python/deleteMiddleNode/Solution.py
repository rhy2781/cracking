from linkedList.python.helper import create_node_from_dictionary, get_kth_node
import iterativeApproach


def main():
    l = [
        [1, 1],
        [2, 2],
        [3, 3],
        [4, 4],
        [5, None]
    ]
    n = create_node_from_dictionary(l)
    m = get_kth_node(n, 3)
    print(m)
    ia = iterativeApproach
    ia.deleteMiddleNode(m)
    print(n)


if __name__ == "__main__":
    main()
