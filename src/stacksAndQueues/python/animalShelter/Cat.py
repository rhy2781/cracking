from Animal import Animal


class Cat(Animal):
    def __init__(self, name: str):
        super().__init__(name)

    def isOlder(self, a: Animal) -> bool:
        return super().isOlder(a)

    def __repr__(self):
        return super().__repr__()
