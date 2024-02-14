from _collections import deque

from treesAndGraphs.python.utility.graph import graph
from treesAndGraphs.python.utility.graph_node import node
from treesAndGraphs.python.utility.state import state


def search(g: graph, s: node, e: node) -> bool:
    if s == e:
        return True

    for n in g.nodes:
        n.state = state.unvisited

    s.state = state.visited
    q = deque()
    q.append(s)
    while q:
        look = q.popleft()

        for n in look.neighbors:
            if n.state == state.unvisited:
                if n == e:
                    return True
                n.state = state.visiting
                q.append(n)
        look.state = state.visited
    return False


def main():
    hm = {
        "S": ["A", "B", "C"],
        "A": ["B"],
        "B": [],
        "C": ["E"],
        "E": []
    }
    g = graph()
    g.populate_graph_from_dictionary(hm)

    s = g.getNode("S")
    e = g.getNode("E")
    print("First Graph")
    print(search(g, s, e))
    print()

    hm1 = {
        "S": ["A", "B", "C"],
        "A": ["B"],
        "B": [],
        "C": [],
        "E": []
    }
    g1 = graph()
    g1.populate_graph_from_dictionary(hm1)
    s1 = g1.getNode("S")
    e1 = g1.getNode("E")
    print("Second Graph")
    print(search(g1, s1, e1))


if __name__ == "__main__":
    main()
