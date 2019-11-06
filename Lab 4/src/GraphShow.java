import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class GraphShow {
    public static void main(String[] args) {

    	long startTime, endTime;
    	
        Graph graph = new Graph(false);
        Node a = new Node(0, "Beijing");
        Node b = new Node(1, "Hong Kong");
        Node c = new Node(2, "Singapore");
        Node d = new Node(3, "Shanghai");
        Node e = new Node(4, "Tokyo");
        Node f = new Node(5, "Seoul");
        Node g = new Node(6, "Los Angeles");
        Node h = new Node(7, "Sydney");

        graph.addEdge(a,b);
        graph.addEdge(a,c);
        graph.addEdge(a,d);
        graph.addEdge(a,e);
        graph.addEdge(b,c);
        graph.addEdge(b,d);
        graph.addEdge(c,d);
        graph.addEdge(c,e);
        graph.addEdge(c,f);
        graph.addEdge(c,h);
        graph.addEdge(d,e);
        graph.addEdge(d,f);
        graph.addEdge(e,f);
        graph.addEdge(e,g);
        graph.addEdge(f,g);
        
        graph.printEdges();

//      System.out.println(graph.hasEdge(a,b));
//      System.out.println(graph.hasEdge(d,a));
        
        BFS bfs = new BFS();
		bfs.breadthFirstSearch(graph, a);
	
		
//---------------Simple Menu---------------------
		//time = System.nanoTime();
		//time2 = System.nanoTime();
		
        int choice, departure, arrival;
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Node> nodes = new ArrayList<Node>();//used for printing out choices for user

		System.out.println("+========= Welcome to Flight BFS =========+");
		System.out.print("Enter Flight Network Size(8/15/20/30/40): ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 8:
			DataSets.createSet8(graph,nodes);
			break;
		case 15:
			DataSets.createSet15(graph,nodes);
			break;
		case 20:
			DataSets.createSet20(graph,nodes);
			break;
		case 30:
			DataSets.createSet30(graph,nodes);
			break;
		case 40:
			DataSets.createSet40(graph, nodes);
		}
		
		//To create edge from 1 node to all nodes.
		//for (Node i : nodes) {
		//	for (Node j : nodes) {
			//	 if(!graph.hasEdge(i, j) && i != j) {
				//	 graph.addEdge(i, j);
				 //}
			//}
			
		//}
		System.out.println("These are the Cities Available:");
		for (Node node : nodes) {
			System.out.println(node.id+1 + ". " + node.name);
		}
		System.out.print("Enter Departure City: ");
		departure = sc.nextInt();
		System.out.print("Enter Arrival City: ");
		arrival = sc.nextInt();
		
		//To display the calculate and display shortest path
		startTime = System.nanoTime();
		bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
		endTime = System.nanoTime();
		System.out.println("Time taken = " + ((endTime-startTime)/1000) + "ms");
    }
}