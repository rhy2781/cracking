

class fixed:
    number_of_stacks = 3

    def __init__(self, size):
        self.stack_capacity = size
        self.values = [0] * (self.number_of_stacks * size)
        self.sizes = [0 for _ in range(self.number_of_stacks)]

    def __repr__(self):
        s = ""
        s += "sizes of each " + str(self.sizes)
        s += "\n"
        for i in range(len(self.values)):
            if i % self.stack_capacity == 0:
                s += '\n'
            s += '{:2d},'.format(self.values[i])
        return s

    def isEmpty(self, stack: int) -> bool:
        return self.sizes[stack] == 0

    def isFull(self, stack: int) -> bool:
        return self.sizes[stack] == self.stack_capacity

    def index(self, stack: int) -> int:
        offset = stack * self.stack_capacity
        size = self.sizes[stack]
        return offset + size - 1

    def push(self, stack: int, value: int) -> None:
        if self.isFull(stack):
            raise Exception("Stack is full")
        self.sizes[stack] += 1
        self.values[self.index(stack)] = value

    def pop(self, stack: int) -> int:
        if self.isEmpty(stack):
            raise Exception("Stack is Empty")
        index = self.index(stack)
        value = self.values[index]
        self.values[index] = 0
        self.sizes[stack] -= 1
        return value

    def peek(self, stack: int) -> int:
        if self.isEmpty(stack):
            raise Exception("Stack is Empty")
        return self.values[self.index(stack)]
