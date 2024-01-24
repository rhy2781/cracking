from linkedList.node import create_node_from_dictionary
import iterativeApproach
import runnerApproach


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

    print()

    m = create_node_from_dictionary(l)
    print(m)
    ra = runnerApproach
    ra.removeDuplicates(m)
    print(m)


if __name__ == "__main__":
    main()
