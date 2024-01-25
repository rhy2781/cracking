from linkedList.python.node import node


def sumList(m: node, n: node) -> node:
    res = node(0)
    carry = 0
    curr = res
    while m or n:
        val1 = m.data if m else 0
        val2 = n.data if n else 0
        s = val1 + val2 + carry
        curr.next = node(s % 10)
        carry = s // 10

        curr = curr.next
        m = m.next
        n = n.next
    if carry:
        curr.next = node(carry)
    return res.next


