from linkedList.singlyLinkedList.node import create_node_from_dictionary
import iterativeApproach


def main():
    # node values -> enumerate index
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
    print(n)

    ia = iterativeApproach
    ia.removeDuplicate(n)
    print(n)


if __name__ == "__main__":
    main()
