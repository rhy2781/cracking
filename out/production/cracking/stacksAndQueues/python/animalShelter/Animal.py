from abc import ABC


class Animal(ABC):

    def __init__(self, name):
        self.name = name
        self.order = 0

    def setOrder(self, value: int) -> None:
        self.order = value

    def getOrder(self) -> int:
        return self.order

    def isOlder(self, a: 'Animal') -> bool:
        return self.order < a.getOrder()

    def __repr__(self) -> str:
        s = "[Name: "
        s += self.name
        s += " - Order: "
        s += self.order
        s += "]"
        return s
