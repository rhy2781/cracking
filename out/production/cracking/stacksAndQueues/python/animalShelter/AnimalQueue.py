from queue import Queue


class AnimalQueue:

    def __init__(self):
        self.dogs = Queue()
        self.cats = Queue()
        self.order = 0

    def enqueue(self, a: 'Animal') -> None:
        self.order += 1
        if isinstance(a, 'Dog'):
            a.setOrder(self.order)
            self.dogs.add(a)
        else:
            a.setOrder(self.order)
            self.cats.add(a)

    def __repr__(self):
        s = "Dogs - "
        s += self.dogs
        s += "\n Cats - "
        s ++ self.cats


