class linked_list:
    def __init__(self, value):
        self.value = value
        self.next = None

    def __str__(self):
        return str(self.value) + "-> " + str(self.next)

    def __repr__(self):
        return str(self.value) + "-> " + str(self.next)