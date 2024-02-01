package treesAndGraphs.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	public List<Node> nodes;
	public Map<String, Node> mappings;

	public Graph(){
		this.nodes = new ArrayList<>();
		this.mappings = new HashMap<>();
	}

	public void initFromAdjacencyList(Map<String, String[]> hm){
		for(String s: hm.keySet()){
			Node n = new Node(s);
			nodes.add(n);
			mappings.put(s, n);
		}
		for(Map.Entry<String, String[]> entry: hm.entrySet()){
			Node n = mappings.get(entry.getKey());
			for(String s: entry.getValue()){
				if(!s.equals("")) {
					n.neighbors.add(mappings.get(s));
				}
			}
		}
	}

	public Node getNode(String s){
		return this.mappings.get(s);
	}

	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append(("Graph: \n"));
		for(Node n: nodes){
			s.append(n.name);
			s.append("->");
			for(Node c: n.neighbors) {
				s.append(c.name);
				s.append("\n");
			}
		}
		return s.toString();
	}
}
