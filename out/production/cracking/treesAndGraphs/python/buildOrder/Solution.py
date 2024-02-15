from typing import List, Dict

from _collections import deque

from treesAndGraphs.python.utility.graph import node


def orderQueue(projects: List[chr], dependencies: List[List[chr]]):
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


def orderDFS(projects: List[chr], dependencies: List[List[chr]]):
    def dfs(n: node, visited: Dict[node, bool], stack: List[chr]):
        visited[n] = True
        for neighbor in n.neighbors:
            if not visited[neighbor]:
                dfs(neighbor, visited, stack)
        stack.append(n.name)

    nodes = {p: node(p) for p in projects}

    for n, outgoing in dependencies:
        base = nodes[n]
        base.neighbors.append(nodes[outgoing])
    print(nodes.values())

    stack = []
    visited = {n: False for n in nodes.values()}
    for n in nodes.values():
        if not visited[n]:
            dfs(n, visited, stack)
    if len(stack) != len(projects):
        raise Exception("No valid build order")
    else:
        return stack[::-1]


def main():

    projects = ['a', 'b', 'c', 'd', 'f', 'e']
    dependencies = [['a', 'd'], ['f', 'b'], ['b', 'd'], ['f', 'a'], ['d', 'c']]
    try:
        print(orderQueue(projects, dependencies))
    except Exception as e:
        print(e)

    try:
        print(orderDFS(projects, dependencies))
    except Exception as e:
        print(e)


    print()

    projects = ['a', 'b', 'c', 'd', 'f', 'e']
    dependencies1 = [['a', 'd'], ['f', 'b'], ['b', 'd'], ['f', 'a'], ['d', 'c'], ['d','a']]
    try:
        print(orderQueue(projects, dependencies1))
    except Exception as e:
        print(e)

    try:
        print(orderDFS(projects, dependencies1))
    except Exception as e:
        print(e)


if __name__ == "__main__":
    main()
