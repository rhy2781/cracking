from Animal import Animal


class Dog(Animal):

    def __init__(self, name: str):
        super().__init__(name)

    def isOlder(self, a: Animal) -> bool:
        return super().isOlder(a)
