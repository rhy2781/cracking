from linkedList.python.helper import create_node_from_list
from linkedList.python.linked_list_node import node


def remove_duplicates_set(n: node) -> None:
    s = set()
    prev = None
    while n:
        if n.val in s:
            prev.next = n.next
        else:
            s.add(n.val)
            prev = n
        n = n.next


def remove_duplicates_runner(curr: node) -> None:
    while curr:
        runner = curr
        while runner.next:
            if runner.next.val == curr.val:
                runner.next = runner.next.next
            else:
                runner = runner.next
        curr = curr.next


def main():
    init = [1, 2, 3, 4, 1, 2, 5]
    n = create_node_from_list(init)
    print("Full Linked List: " + repr(n))
    print()
    print("Runner Approach")
    remove_duplicates_runner(n)
    print(n)

    n = create_node_from_list(init)
    print("Set Approach")
    remove_duplicates_set(n)
    print(n)


if __name__ == "__main__":
    main()
