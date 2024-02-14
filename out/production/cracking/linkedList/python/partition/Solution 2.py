from linkedList.python.linked_list_node import node
from linkedList.python.helper import create_node_from_list


def partition(n: node, k: int) -> node:
    parent_less, parent_greater = node(0), node(0)
    pointer_less, pointer_greater = parent_less, parent_greater

    while n:
        if n.val >= k:
            pointer_greater.next = n
            pointer_greater = n
        else:
            pointer_less.next = n
            pointer_less = n
        n = n.next

    pointer_less.next = parent_greater.next
    pointer_greater.next = None
    return parent_less.next


def main():
    init = [3, 5, 8, 5, 10, 2, 1]
    n = create_node_from_list(init)
    print(n)
    print()
    print(partition(n, 6))


if __name__ == "__main__":
    main()
