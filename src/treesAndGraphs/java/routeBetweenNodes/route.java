package treesAndGraphs.java.routeBetweenNodes;

import treesAndGraphs.java.Node;
import treesAndGraphs.java.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class route {
	public enum State {unvisited, visiting, visited};

	public boolean search(Graph g, Node s, Node e){
		if(s == e) return true;
		for(Node n: g.nodes){
			n.state = State.unvisited;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(s);
		s.state = State.visited;
		while(!q.isEmpty()){
			Node look = q.poll();
			for(Node n: look.neighbors){
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
