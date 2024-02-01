package treesAndGraphs.java.routeBetweenNodes;


import treesAndGraphs.java.Graph;
import treesAndGraphs.java.Node;

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
		Graph g = new Graph();
		g.initFromAdjacencyList(hm);
		System.out.println(g);

		route r = new route();
		Node s = g.getNode("S");
		Node e = g.getNode("E");
		System.out.println(r.search(g, s, e));

	}
}
