from linkedList.python.helper import create_node_from_list, get_kth_node
from linkedList.python.linked_list_node import node


def deleteMiddleNode(curr: node) -> None:
    if not curr or not curr.next:
        return
    n = curr.next
    curr.val = n.val
    curr.next = n.next


def main():
    source = [1, 2, 3, 4, 5]
    n = create_node_from_list(source)

    deletion_node = get_kth_node(n, 3)

    print("Full Linked List: " + repr(n))
    print("Node to Delete: " + repr(deletion_node))
    print()
    deleteMiddleNode(deletion_node)
    print("Full Linked List After Deletion: " + repr(n))


if __name__ == "__main__":
    main()
