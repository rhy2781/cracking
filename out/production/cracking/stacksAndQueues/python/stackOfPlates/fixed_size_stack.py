class fixed_stack:

    def __init__(self, size: int) -> None:
        self.data = []
        self.capacity = size
        self.size = 0

    def isFull(self) -> bool:
        return self.size == self.capacity

    def isEmpty(self) -> bool:
        return self.size == 0

    def pop(self) -> int:
        if self.isEmpty():
            raise Exception("Stack is empty")
        self.size -= 1
        return self.data.pop()

    def push(self, value: int) -> None:
        if self.isFull():
            raise Exception("Stack is full")
        self.size += 1
        self.data.append(value)

    def __repr__(self):
        return str(self.data)
