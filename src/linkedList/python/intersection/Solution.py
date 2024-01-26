from linkedList.python.helper import create_node_from_list, get_kth_node
import iterativeApproach


def main():
    init = [3, 1, 5, 9, 7, 2, 1]
    init2 = [4, 6]
    init3 = [1, 2, 3, 4, 5]

    longer = create_node_from_list(init)
    shorter = create_node_from_list(init2)
    intersection = get_kth_node(longer, 5)
    append = get_kth_node(shorter, 2)
    append.next = intersection

    ia = iterativeApproach
    print("Intersection fo two nodes")
    print(longer)
    print(shorter)
    print("Intersection at " + str(ia.intersection(longer, shorter)))
    print("------")

    unrelated = create_node_from_list(init3)
    print("Intersection of unrelated notes")
    print(longer)
    print(unrelated)
    print("Intersection at " + str(ia.intersection(longer, unrelated)))


if __name__ == "__main__":
    main()
