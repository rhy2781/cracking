from collections import deque
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
