from treesAndGraphs.python.graph import graph
from treesAndGraphs.python.routeBetweenNodes.route import search


def main():
    hm = {
        "S": ["A", "B", "C"],
        "E": [],
        "A": ["D", "F"],
        "B": ["H", "I", "J"],
        "C": ["J", "M"],
        "D": ["G"],
        "F": ["G"],
        "G": [],
        "H": ["I", "K"],
        "I": ["K"],
        "J": ["K", "L"],
        "K": ["E"],
        "L": ["M"],
        "M": ["L", "N"],
        "N": ["O", "L"],
        "O": []
    }
    g = graph()
    g.createFromDict(hm)
    print(g)

    s = g.getNode("S")
    e = g.getNode("E")
    print(search(g, s, e))


if __name__ == "__main__":
    main()
