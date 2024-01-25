from linkedList.python.helper import create_node_from_list
import iterativeApproach


def main():
    init = [7, 1, 6]
    init2 = [5, 9, 3]
    n = create_node_from_list(init)
    m = create_node_from_list(init2)
    print(n)
    print(m)

    print(iterativeApproach.sumList(m, n))


if __name__ == "__main__":
    main()

