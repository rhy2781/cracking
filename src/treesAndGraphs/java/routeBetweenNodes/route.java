package treesAndGraphs.java.routeBetweenNodes;

import treesAndGraphs.java.GraphNode;
import treesAndGraphs.java.Graph;
import treesAndGraphs.java.State;

import java.util.LinkedList;
import java.util.Queue;

public class route {
	public boolean search(Graph g, GraphNode s, GraphNode e){
		if(s == e) return true;
		for(GraphNode n: g.nodes){
			n.state = State.unvisited;
		}

		Queue<GraphNode> q = new LinkedList<>();
		q.add(s);
		s.state = State.visited;
		while(!q.isEmpty()){
			GraphNode look = q.poll();
			for(GraphNode n: look.neighbors){
				if(n.state == State.unvisited){
					if(n == e) return true;
					n.state = State.visiting;
					q.add(n);
				}
			}
			look.state = State.visited;
		}
		return false;
	}
}
