package treesAndGraphs.java.utility;


import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	public String name;
	public List<GraphNode> neighbors;
	public State state;

	public GraphNode(String name){
		this.name = name;
		this.neighbors = new ArrayList<>();
		this.state = State.unvisited;
	}
	public GraphNode(Character name){
		this.name = String.valueOf(name);
		this.neighbors = new ArrayList<>();
		this.state = State.unvisited;
	}

	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append(this.name);
		s.append("->");
		for (GraphNode n: neighbors){
			s.append(n.name);
			s.append(", ");
		}
		return s.toString();
	}
}
