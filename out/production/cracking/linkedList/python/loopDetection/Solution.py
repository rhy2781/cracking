from linkedList.python.helper import create_node_from_list, get_kth_node
from linkedList.python.linked_list_node import node


def loopDetection(curr: node) -> node | None:
    slow = curr
    fast = curr
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            break

    if not fast or not fast.next:
        return None

    slow = curr
    while slow != fast:
        slow = slow.next
        fast = fast.next
    return slow


def main():
    init = [1, 2, 3, 4, 5]
    n = create_node_from_list(init)
    loop_start = get_kth_node(n, 3)
    end = get_kth_node(n, 5)
    print("Full Linked List: " + repr(n))
    print("Loop Start: " + repr(loop_start))
    print("End of LinkedList: " + repr(end))
    print()

    end.next = loop_start

    print("Loop encountered at " + repr(loopDetection(n)))


if __name__ == "__main__":
    main()
