class node:
    def __init__(self, name: str):
        self.name = name
        self.neighbors = []

    def __repr__(self) -> str:
        s = '\t'
        s += self.name
        s += ' -> '

        for n in self.neighbors:
            s += n.name
            s += ', '
        s += '\n'
        return s
