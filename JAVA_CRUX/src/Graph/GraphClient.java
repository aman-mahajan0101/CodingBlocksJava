package Graph;

public class GraphClient {
	public static void main(String[] args) throws Exception {
		Graph graph = new Graph();
		graph.addvertex("A");
		graph.addvertex("B");
		graph.addvertex("C");
		graph.addvertex("D");
		graph.addvertex("E");
		graph.addvertex("F");
		graph.addvertex("G");
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 3);
		graph.addEdge("B", "C", 1);
		graph.addEdge("C", "D", 8);
		graph.addEdge("D", "E", 10);
		graph.addEdge("E", "F", 45);
		graph.addEdge("E", "G", 7);
		graph.addEdge("F", "G", 8);

		// for prims and dijkstra
//		graph.addEdge("A", "B", 2);
//		graph.addEdge("A", "D", 6);
//		graph.addEdge("B", "C", 3);
//		graph.addEdge("C", "D", 1);
//		graph.addEdge("D", "E", 8);
//		graph.addEdge("E", "F", 5);
//		graph.addEdge("E", "G", 6);
//		graph.addEdge("F", "G", 4);
		// end prims and dijkstra

		graph.display();
//		System.out.println(graph.numvertex());
//		System.out.println(graph.numEdges());
//		System.out.println(graph.containsEdge("A", "C"));
//		System.out.println(graph.containsEdge("E", "F"));
//		graph.removeEdge("A", "B");
//		graph.display();
//		graph.removevertex("F");
//		graph.display();
//		graph.addvertex("F");
//		graph.display();
//		graph.addEdge("F", "A", 10);
//		graph.display();
//      graph.removeEdge("D", "E");
// 		System.out.println(graph.haspath("A", "F", new HashMap<>()));
// 		System.out.println(graph.bfs("A", "F"));
//		System.out.println(graph.dfs("A", "F"));
//		graph.bft();
//		graph.dft();
//		System.out.println(graph.iscyclic());
//		System.out.println(graph.isconnected());
//		System.out.println(graph.istree());
//      graph.addvertex("H");
//		System.out.println(graph.getCC());

//		graph.prims().display();
//		System.out.println(graph.Dijkstra("A"));

//		 graph.kruskal();

		System.out.println(graph.bellmanFord("A"));

	}
}
