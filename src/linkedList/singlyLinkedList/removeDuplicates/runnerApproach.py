from linkedList.singlyLinkedList.node import node


def removeDuplicates(curr: node):
    while curr:
        runner = curr
        while runner.next:
            if runner.next.data == curr.data:
                runner.next = runner.next.next
            else:
                runner = runner.next
        curr = curr.next
