import sys


class minStack:
    def __init__(self):
        self.m = []
        self.stack = []

    def min(self) -> int:
        if len(self.m) == 0:
            return sys.maxsize
        return self.m[-1]

    def push(self, value) -> None:
        temp = self.min()
        if value < temp:
            self.m.append(value)
        self.stack.append(value)

    def pop(self) -> int:
        self.m.pop()
        return self.stack.pop()

    def peek(self) -> int:
        return self.stack[-1]
