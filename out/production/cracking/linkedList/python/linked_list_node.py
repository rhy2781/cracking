class node:
    def __init__(self, val):
        self.val = val
        self.next = None

    def __repr__(self):
        curr = self
        seen = set()
        s = ""
        while curr:
            if curr in seen:
                s += " loop at: "
                s += str(curr.val)
                return s
            seen.add(curr)
            s += str(curr.val)
            s += " -> "
            curr = curr.next
        return s
