from typing import Dict
from typing import List

from treesAndGraphs.python.node import node
from treesAndGraphs.python.state import state


class graph:
    def __init__(self):
        self.nodes = []
        self.mappings = {}
        self.state = state.unvisited

    def __repr__(self) -> str:
        s = 'Graph: [ \n'
        for n in self.nodes:
            s += n.__repr__()
        s += ']'
        return s

    def createFromDict(self, d: Dict[str, List[str]]) -> None:
        for k in d.keys():
            n = node(k)
            self.nodes.append(n)
            self.mappings[k] = n

        for k, v in d.items():
            n = self.mappings[k]
            for j in v:
                n.neighbors.append(self.mappings[j])

    def getNode(self, s: str):
        return self.mappings[s]
