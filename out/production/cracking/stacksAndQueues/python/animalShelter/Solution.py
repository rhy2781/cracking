from Cat import Cat
from Dog import Dog
from typing import List
from Animal import Animal
from AnimalQueue import AnimalQueue


def fillAnimals(names: List[List[str]], animals: List[Animal]) -> None:
    for pair in names:
        b = pair[0]
        n = pair[1]
        if b == "c":
            animals.append(Cat(n))
        else:
            animals.append(Dog(n))


def main():
    names = [
        ["c", "fleas"],
        ["d", "Cookie"],
        ["d", "Harper"],
        ["c", "Bumi"],
        ["c", "Sir. Meowington"],
        ["d", "Kaido"]
    ]
    animals = []
    fillAnimals(names, animals)

    aq = AnimalQueue()
    for animal in animals:
        aq.enqueue(animal)
    print(aq)
    print(aq.dequeueCat())
    print(aq.dequeueDog())
    print()
    print(aq)
    print(aq.dequeueAny())


if __name__ == "__main__":
    main()
