from queue import Queue

from Dog import Dog
from Cat import Cat
from Animal import Animal


class AnimalQueue:

    def __init__(self):
        self.dogs = Queue()
        self.cats = Queue()
        self.order = 0

    def enqueue(self, a: Animal) -> None:
        self.order += 1
        if isinstance(a, Dog):
            a.setOrder(self.order)
            self.dogs.put(a)
        else:
            a.setOrder(self.order)
            self.cats.put(a)

    def dequeueAny(self):
        if self.cats.qsize() == 0:
            return self.dequeueDog()
        elif self.dogs.qsize() == 0:
            return self.dequeueCat()

        d = self.dogs.get()
        c = self.cats.get()
        if d.isOlder(c):
            self.dogs.put(d)
            return c
        self.cats.put(c)
        return d

    def dequeueCat(self):
        return self.cats.get()

    def dequeueDog(self):
        return self.dogs.get()

    def __repr__(self):
        s = "Dogs - ["
        s += str(list(self.dogs.queue))
        s += "]"
        s += "\nCats - "
        s += str(list(self.cats.queue))
        return s
