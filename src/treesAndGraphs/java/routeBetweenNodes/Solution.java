package treesAndGraphs.java.routeBetweenNodes;


import treesAndGraphs.java.Graph;
import treesAndGraphs.java.GraphNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void main(String[] args){
		Map<String, String[]> hm = new HashMap<>(){{
			put("S", new String[]{"A", "B", "C"});
			put("E", new String[]{""});

			put("A", new String[]{"D","F"});
			put("B", new String[]{"H","I","J"});
			put("C", new String[]{"J","M"});
			put("D", new String[]{"G"});
			put("F", new String[]{"G","K"});
			put("G", new String[]{""});
			put("H", new String[]{"I","K"});
			put("I", new String[]{"K"});
			put("J", new String[]{"K","L"});
			put("K", new String[]{"E"});
			put("L", new String[]{""});
			put("M", new String[]{"L","N"});
			put("N", new String[]{"O","L"});
			put("O", new String[]{""});
		}};

		Map<String, String[]> noConnection = new HashMap<>(){{
			put("S", new String[]{"B", "C", "D"});
			put("B", new String[] {"C"});
			put("C", new String[] {});
			put("D", new String[]{});
			put("E", new String[]{});
		}};

		Graph g = new Graph();
		g.initFromAdjacencyList(hm);
//		g.visualize();

		route r = new route();
		GraphNode s = g.getNode("S");
		GraphNode e = g.getNode("E");
		System.out.println(r.search(g, s, e));


		Graph g2 = new Graph();
		g2.initFromAdjacencyList(noConnection);
		g2.visualize();

		GraphNode s2 =  g2.getNode("S");
		GraphNode e2 = g2.getNode("E");
		System.out.println(r.search(g2, s2, e2));
	}
}
