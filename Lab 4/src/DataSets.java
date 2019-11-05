import java.util.Collections;
import java.util.ArrayList;


public class DataSets {
	public DataSets(){};
	
	public static void createSet8(Graph graph, ArrayList<Node> nodes) {
        Node a = new Node(0, "Beijing");
        Node b = new Node(1, "Hong Kong");
        Node c = new Node(2, "Singapore");
        Node d = new Node(3, "Shanghai");
        Node e = new Node(4, "Tokyo");
        Node f = new Node(5, "Seoul");
        Node g = new Node(6, "Los Angeles");
        Node h = new Node(7, "Sydney");

        Collections.addAll(nodes, a,b,c,d,e,f,g,h);
        
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
	}
	
	public static void createSet15(Graph graph, ArrayList<Node> nodes) {
		Node a = new Node(0, "Beijing");
        Node b = new Node(1, "Hong Kong");
        Node c = new Node(2, "Singapore");
        Node d = new Node(3, "Shanghai");
        Node e = new Node(4, "Tokyo");
        Node f = new Node(5, "Seoul");
        Node g = new Node(6, "Los Angeles");
        Node h = new Node(7, "Sydney");
        Node i = new Node(8, "Osaka");
        Node j = new Node(9, "Narita");
        Node k = new Node(10, "San Francisco");
        Node l = new Node(11, "Manila");
        Node m = new Node(12, "Kuala Lumpar");
        Node n = new Node(13, "Ho Chi Minh");
        Node o = new Node(14, "Bangkok");
        
        Collections.addAll(nodes, a,b,c,d,e,f,g,h,i,j,k,l,m,n,o);
        
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
        graph.addEdge(i,e);
        graph.addEdge(i,j);
        graph.addEdge(i,a);
        graph.addEdge(i,o);
        graph.addEdge(j,e);
        graph.addEdge(j,g);
        graph.addEdge(k,c);
        graph.addEdge(k,m);
        graph.addEdge(k,l);
        graph.addEdge(l,m);
        graph.addEdge(m,o);
        graph.addEdge(m,h);
        graph.addEdge(m,c);
        graph.addEdge(m,n);
        graph.addEdge(n,c);
        graph.addEdge(n,a);
        graph.addEdge(n,b);
        graph.addEdge(o,c);
	}
	
	public static void createSet20(Graph graph, ArrayList<Node> nodes) {
		Node a = new Node(0, "Beijing");
        Node b = new Node(1, "Hong Kong");
        Node c = new Node(2, "Singapore");
        Node d = new Node(3, "Shanghai");
        Node e = new Node(4, "Tokyo");
        Node f = new Node(5, "Seoul");
        Node g = new Node(6, "Los Angeles");
        Node h = new Node(7, "Sydney");
        Node i = new Node(8, "Osaka");
        Node j = new Node(9, "Narita");
        Node k = new Node(10, "San Francisco");
        Node l = new Node(11, "Manila");
        Node m = new Node(12, "Kuala Lumpar");
        Node n = new Node(13, "Ho Chi Minh");
        Node o = new Node(14, "Bangkok");
        Node p = new Node(15, "Vancouver");
        Node q = new Node(16, "Da Nang");
        Node r = new Node(17, "Las Vegas");
        Node s = new Node(18, "Cacun");
        Node t = new Node(19, "Mexico");
        
        Collections.addAll(nodes, a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t);
        
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
        graph.addEdge(i,e);
        graph.addEdge(i,j);
        graph.addEdge(i,a);
        graph.addEdge(i,o);
        graph.addEdge(j,e);
        graph.addEdge(j,g);
        graph.addEdge(k,c);
        graph.addEdge(k,m);
        graph.addEdge(k,l);
        graph.addEdge(l,m);
        graph.addEdge(m,o);
        graph.addEdge(m,h);
        graph.addEdge(m,c);
        graph.addEdge(m,n);
        graph.addEdge(n,c);
        graph.addEdge(n,a);
        graph.addEdge(n,b);
        graph.addEdge(o,c);
        graph.addEdge(p,o);
        graph.addEdge(p,b);
        graph.addEdge(p,r);
        graph.addEdge(q,n);
        graph.addEdge(q,i);
        graph.addEdge(r,g);
        graph.addEdge(r,k);
        graph.addEdge(r,t);
        graph.addEdge(s,k);
        graph.addEdge(s,t);
        graph.addEdge(s,e);
        graph.addEdge(t,k);	
	}
	
}
