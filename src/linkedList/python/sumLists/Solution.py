from linkedList.python.helper import create_node_from_list
from linkedList.python.linked_list_node import node


def sumList(m: node, n: node) -> node:
    res = node(0)
    carry = 0
    curr = res
    while m or n:
        val1 = m.val if m else 0
        val2 = n.val if n else 0
        s = val1 + val2 + carry
        curr.next = node(s % 10)
        carry = s // 10

        curr = curr.next
        m = m.next
        n = n.next
    if carry:
        curr.next = node(carry)
    return res.next


def main():
    init = [7, 1, 6]
    init2 = [5, 9, 3]
    n = create_node_from_list(init)
    m = create_node_from_list(init2)
    print(n)
    print(m)
    print()
    print(sumList(m, n))


if __name__ == "__main__":
    main()

