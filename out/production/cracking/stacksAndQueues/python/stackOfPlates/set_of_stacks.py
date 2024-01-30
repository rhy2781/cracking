from fixed_size_stack import fixed_stack


class set_stack:

    def __init__(self, size: int):
        self.stack = [fixed_stack(size)]
        self.stack_size = size

    def getLastStack(self) -> fixed_stack:
        if len(self.stack) == 0:
            self.stack.append(fixed_stack(self.stack_size))
        f = self.stack[-1]
        if f is None:
            raise Exception("Stack is Empty")
        return f

    def push(self, value) -> None:
        f = self.getLastStack()
        if f.isFull():
            t = fixed_stack(self.stack_size)
            t.push(value)
            self.stack.append(t)
        else:
            f.push(value)

    def pop(self):
        f = self.getLastStack()
        while f is None or f.isEmpty():
            self.stack.pop()
            f = self.getLastStack()
        return f.pop()

    def __repr__(self):
        s = ""
        for i in self.stack:
            s += repr(i)
            s += "\n"
        return s
