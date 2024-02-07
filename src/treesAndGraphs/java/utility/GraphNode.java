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

}
