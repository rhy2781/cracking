package treesAndGraphs.java;


import java.util.ArrayList;
import java.util.List;

public class Node {
	public String name;
	public List<Node> neighbors;
	public State state;

	public Node(String name){
		this.name = name;
		this.neighbors = new ArrayList<>();
		this.state = State.unvisited;
	}

}
