from linkedList.python.helper import create_node_from_list
from linkedList.python.linked_list_node import node


def is_palindrome_reverse(curr: node) -> bool:
    def reverse(c: node) -> node:
        prev = None
        while c:
            n = node(c.val)
            n.next = prev
            prev = n
            c = c.next
        return prev

    def isEqual(one: node, two: node) -> bool:
        while one and two:
            if one.val != two.val:
                return False
            one = one.next
            two = two.next
        return True

    reverse = reverse(curr)
    return isEqual(curr, reverse)


def is_palindrome_stack(curr: node) -> bool:
    stack = []
    slow, fast = curr, curr
    while fast and fast.next:
        stack.append(slow.val)
        slow = slow.next
        fast = fast.next.next
    if fast:
        slow = slow.next
    while slow:
        if slow.val != stack.pop():
            return False
        slow = slow.next
    return True


def main():
    init = [1, 2, 3, 4, 5, 4, 3, 2, 1]
    init2 = [1, 2, 3, 4, 5]
    palindrome = create_node_from_list(init)
    not_palindrome = create_node_from_list(init2)

    print("Reverse Approach")
    print(is_palindrome_reverse(palindrome))
    print(is_palindrome_reverse(not_palindrome))
    print()

    print("Stack Approach")
    print(is_palindrome_stack(palindrome))
    print(is_palindrome_stack(not_palindrome))


if __name__ == "__main__":
    main()
