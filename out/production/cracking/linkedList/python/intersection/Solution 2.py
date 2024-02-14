from linkedList.python.helper import create_node_from_list, get_kth_node
from linkedList.python.linked_list_node import node


def intersection(one: node, two: node) -> node | None:
    def length(c: node) -> int:
        k = 1
        while c:
            k += 1
            c = c.next
        return k

    p1 = one
    p2 = two
    while p1.next:
        p1 = p1.next
    while p2.next:
        p2 = p2.next

    if p1 != p2:
        return None

    length1 = length(one)
    length2 = length(two)

    res = one if length1 < length2 else two
    return get_kth_node(res, abs(length1 - length2) + 1)


def main():
    init = [3, 1, 5, 9, 7, 2, 1]
    init2 = [4, 6]
    init3 = [1, 2, 3, 4, 5]

    longer = create_node_from_list(init)
    shorter = create_node_from_list(init2)
    unrelated = create_node_from_list(init3)

    print("longer node: " + repr(longer))
    print("shorter node: " + repr(shorter))
    print("unrelated node: " + repr(unrelated))
    print()

    add = get_kth_node(longer, 5)
    append_to = get_kth_node(shorter, 2)
    append_to.next = add

    print("Adding Intersection")
    print("Longer node: " + repr(longer))
    print("Shorter node: " + repr(shorter))
    print()

    print("Intersection of longer and shorter: " + repr(intersection(longer, shorter)))
    print("Intersection of longer and unrelated: " + repr(intersection(longer, unrelated)))


if __name__ == "__main__":
    main()
