class MyQueue:

    def __init__(self):
        self.stack = []
        self.temp = []

    def push(self, x: int) -> None:
        while self.stack:
            self.temp.append(self.stack.pop())
        self.stack.append(x)
        while self.temp:
            self.stack.append(self.temp.pop())

    def pop(self) -> int:
        return self.stack.pop()

    def peek(self) -> int:
        return self.stack[-1]

    def empty(self) -> bool:
        return len(self.stack) == 0

    def __repr__(self):
        return str(self.stack) + " <- top of queue"
