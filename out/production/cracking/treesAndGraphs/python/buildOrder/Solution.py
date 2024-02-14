from typing import List

from _collections import deque

from treesAndGraphs.python.utility.graph import node


def order(projects: List[chr], dependencies: List[List[chr]]):
    nodes = {p: node(p) for p in projects}

    for n, outgoing in dependencies:
        base = nodes[outgoing]
        base.neighbors.append(nodes[n])

    res = []
    q = deque()
    for n in nodes.values():
        if len(n.neighbors) == 0:
            q.append(n)

    while q:
        temp = q.popleft()
        res.append(temp)
        for n in nodes.values():
            if temp in n.neighbors:
                n.neighbors.remove(temp)
                if len(n.neighbors) == 0:
                    q.append(n)

    if len(res) == len(projects):
        return res
    else:
        raise Exception('No Valid Build Order')


def main():
    projects = ['a', 'b', 'c', 'd', 'f', 'e']
    dependencies = [['a', 'd'], ['f', 'b'], ['b', 'd'], ['f', 'a'], ['d', 'c']]
    print(order(projects, dependencies))

    projects = ['a', 'b', 'c', 'd', 'f', 'e']
    dependencies1 = [['a', 'd'], ['f', 'b'], ['b', 'd'], ['f', 'a'], ['d', 'c'], ['d','a']]
    print(order(projects, dependencies1))


if __name__ == "__main__":
    main()
