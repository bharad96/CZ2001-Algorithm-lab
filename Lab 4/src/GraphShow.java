import java.util.HashMap;
import java.util.LinkedList;

public class GraphShow {
    public static void main(String[] args) {

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

//        System.out.println(graph.hasEdge(a,b));
//        System.out.println(graph.hasEdge(d,a));

        BFS bfs = new BFS();
        bfs.breadthFirstSearch(graph, a);
    }
}