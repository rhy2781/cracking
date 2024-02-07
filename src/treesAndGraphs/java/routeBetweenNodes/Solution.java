package treesAndGraphs.java.routeBetweenNodes;

import treesAndGraphs.java.utility.Graph;
import treesAndGraphs.java.utility.GraphNode;
import treesAndGraphs.java.utility.State;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		Map<String, String[]> hm = new HashMap<>(){{
			put("S", new String[]{"A", "B", "C"});
			put("A", new String[]{"B"});
			put("B", new String[]{});
			put("C", new String[]{"E"});
			put("E", new String[]{""});
		}};
		Graph g = new Graph("First Graph");
		g.initFromAdjacencyList(hm);
		g.visualize();

		GraphNode s = g.getNode("S");
		GraphNode e = g.getNode("E");
		out.println("Searching First Graph");
		out.println(search(g, s, e));


		Map<String, String[]> hm1 = new HashMap<>(){{
			put("S", new String[]{"A", "B", "C"});
			put("A", new String[]{"B"});
			put("B", new String[]{});
			put("C", new String[]{""});
			put("E", new String[]{""});
		}};
		Graph g1 = new Graph("Second Graph");
		g1.initFromAdjacencyList(hm1);
		g1.visualize();

		GraphNode s1 = g.getNode("S");
		GraphNode e1 = g.getNode("E");
		out.println("Searching Second Graph");
		out.println(search(g1, s1, e1));
	}

	public static boolean search(Graph g, GraphNode s, GraphNode e){
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
