package treesAndGraphs.java.buildOrder;

import java.util.*;

import treesAndGraphs.java.utility.GraphNode;

public class Solution {

	public static Map<String, GraphNode> makeGraphNodesInverted(String[] projects, String[][] dependencies){
		Map<String, GraphNode> nodes = new HashMap<>();
		for(String p : projects){
			nodes.put(p, new GraphNode(p));
		}
		for(String[] d : dependencies){
			GraphNode dependent = nodes.get(d[1]);
			GraphNode base = nodes.get(d[0]);
			dependent.neighbors.add(base);
		}
		return nodes;
	}

	public static String[] getOrderQueue(String[] projects, String[][] dependencies) throws Exception {
		Map<String, GraphNode> nodes = makeGraphNodesInverted(projects, dependencies);

		String[] res = new String[projects.length];
		int index = 0;
		Queue<GraphNode> q = new LinkedList<>();
		for(GraphNode n : nodes.values()){
			if(n.neighbors.size() == 0) {
				q.offer(n);
			}
		}

		while(!q.isEmpty()){
			GraphNode temp = q.poll();
			res[index++] = temp.name;
			for (GraphNode n : nodes.values()) {
				if(n.neighbors.contains(temp)) {
					n.neighbors.remove(temp);
					if(n.neighbors.size() == 0) {
						q.offer(n);
					}
				}
			}
		}

		if (res[res.length - 1].equals("")) {
			throw new Exception("No Valid Build Order");
		}
		else {
			return res;
		}
	}

	public static Map<String, GraphNode> makeGraphNodes(String[] projects, String[][] dependencies){
		Map<String, GraphNode> nodes = new HashMap<>();
		for(String p : projects){
			nodes.put(p, new GraphNode(p));
		}
		for(String[] d : dependencies){
			GraphNode base = nodes.get(d[0]);
			GraphNode dependent = nodes.get(d[1]);
			base.neighbors.add(dependent);
		}
		System.out.println(nodes);
		return nodes;
	}

	public static String[] getOrderDFS(String[] projects, String[][] dependencies) throws Exception {
		Map<String, GraphNode> nodes = makeGraphNodes(projects, dependencies);

		Stack<GraphNode> stack = new Stack<>();
		Map<GraphNode, Boolean> visited = new HashMap<>();

		for(GraphNode n : nodes.values()){
			if (!visited.getOrDefault(n, false)){
				dfs(n, visited, stack);
			}
		}

		if(stack.size() != projects.length){
			throw new Exception("No valid build Order");
		}
		else{
			String[] res = new String[projects.length];
			int index = 0;
			while(!stack.isEmpty()){
				res[index ++] = stack.pop().name;
			}
			return res;
		}
	}

	public static void dfs(GraphNode n, Map<GraphNode, Boolean> visited, Stack<GraphNode> stack){
		visited.put(n, true);
		for(GraphNode neighbor : n.neighbors){
			if(!visited.getOrDefault(neighbor, false)){
				dfs(neighbor, visited, stack);
			}
		}
		stack.push(n);
	}


	public static void main(String[] args){
		String[] projects = new String[]{"a","b","c","d","e","f"};
		String[][] dependencies = new String[][]{
				{"a", "d"},
				{"f","b"},
				{"b","d"},
				{"f","a"},
				{"d","c"},
				{"a","b"}
		};

		try {
			String[] res = getOrderQueue(projects, dependencies);
			System.out.println(Arrays.toString(res));

			String[] res1 = getOrderDFS(projects, dependencies);
			System.out.println(Arrays.toString(res1));

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
