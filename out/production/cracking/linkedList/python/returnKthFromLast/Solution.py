from linkedList.python.helper import create_node_from_list
from linkedList.python.linked_list_node import node


def kth(n: node, k: int) -> node | None:
    curr = n
    while k > 0:
        if curr is None:
            return None
        curr = curr.next
        k -= 1

    while curr:
        curr = curr.next
        n = n.next
    return n


def main():
    init = [1, 2, 3, 4, 1, 2, 5]
    n = create_node_from_list(init)
    print("Linked List: " + repr(n))
    print()

    print(kth(n, 3))
    print(kth(n, 6))
    print(kth(n, 7))
    print(kth(n, 10))


if __name__ == "__main__":
    main()
