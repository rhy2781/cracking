package treesAndGraphs.java;

import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	public List<GraphNode> nodes;
	public Map<String, GraphNode> mappings;

	public Graph(){
		this.nodes = new ArrayList<>();
		this.mappings = new HashMap<>();
	}

	public void initFromAdjacencyList(Map<String, String[]> hm){
		for(String s: hm.keySet()){
			GraphNode n = new GraphNode(s);
			nodes.add(n);
			mappings.put(s, n);
		}
		for(Map.Entry<String, String[]> entry: hm.entrySet()){
			GraphNode n = mappings.get(entry.getKey());
			for(String s: entry.getValue()){
				if(!s.equals("")) {
					n.neighbors.add(mappings.get(s));
				}
			}
		}
	}

	public GraphNode getNode(String s){
		return this.mappings.get(s);
	}

	public String loadCssFromFile(String path){
		StringBuilder s = new StringBuilder();

		try{
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line;
			while((line = reader.readLine()) != null){
				s.append(line);
//				s.append("\n");
			}
			return s.toString();
		}
		catch (java.io.IOException e){
			System.out.println(e);
		}
		return s.toString();
	}

	// TODO: Come back to this
	public void visualize(){
		System.setProperty("org.graphstream.ui", "swing");
		org.graphstream.graph.Graph graph = new SingleGraph("name");
		graph.setAttribute(
				"ui.stylesheet",
				"graph{" +
							"fill-color: white;}" +
						"node {" +
							"text-size : 16px; "+
							"text-padding:1px; "+
							"text-alignment: center; " +
							"text-background-mode:rounded-box; " +
							"text-background-color: yellow; " +
							"text-color: #222;" +
							"size: 5px; "+
						"}" +
						"edge{ " +
							"text-size : 16px; "+
							"text-padding:1px; "+
							"text-alignment: center; " +
							"text-background-mode:rounded-box; " +
							"text-background-color: #EB2; " +
							"text-color: #222;" +
							"size : 2px; " +
						"}");

		for(GraphNode n: nodes){
			org.graphstream.graph.Node graphNode = graph.addNode(n.name);
			graphNode.setAttribute("ui.label", n.name);
		}
		for(GraphNode n: nodes){
			for(GraphNode neighbor: n.neighbors)
				graph.addEdge(n.name + neighbor.name, n.name, neighbor.name, true);
		}

		Viewer viewer = graph.display();
	}

	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append(("Graph: \n"));
		for(GraphNode n: nodes){
			s.append(n.name);
			s.append("->");
			for(GraphNode c: n.neighbors) {
				s.append(c.name);
				s.append("\n");
			}
		}
		return s.toString();
	}
}
