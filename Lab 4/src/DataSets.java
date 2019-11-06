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
	
	
	public static void createSet30(Graph graph, ArrayList<Node> nodes) {
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
        Node u = new Node(20, "Sochi"); //AER
        Node v = new Node(21, "Astrakhan"); //ASF
        Node w = new Node(22, "Chelyabinsk"); //CEK
        Node x = new Node(23, "Domodedovo"); //DME
        Node y = new Node(24, "Belgorod"); //EGO
        Node z = new Node(25, "Baku"); //GYD
        Node z1 = new Node(26, "Khrabrovo"); //KGD
        Node z2 = new Node(27, "Kazan"); //KZN
        Node z3 = new Node(28, "St. Petersburg"); //LED
        Node z4 = new Node(29, "Stavropol Krai"); //MRV


        Collections.addAll(nodes, a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,w,x,y,z,z2,z3,z4);

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
        graph.addEdge(u, z2);
        graph.addEdge(u, a);
        graph.addEdge(u, s);
        graph.addEdge(v, z2);
        graph.addEdge(v, b);
        graph.addEdge(v, y);
        graph.addEdge(v,z4);
        graph.addEdge(w, z2);
        graph.addEdge(w, c);
        graph.addEdge(w, k);
        graph.addEdge(x, z2);
        graph.addEdge(x, n);
        graph.addEdge(x, b);
        graph.addEdge(x, z5);
        graph.addEdge(x, p);
        graph.addEdge(y, z1);
        graph.addEdge(y, m);
        graph.addEdge(y, z2);
        graph.addEdge(y, n);
        graph.addEdge(y, o);
        graph.addEdge(z, d);
        graph.addEdge(z1, g);
        graph.addEdge(z1, f);
        graph.addEdge(z2, l);
        graph.addEdge(z2, z3);
        graph.addEdge(z2, e);
        graph.addEdge(z3, v);
        graph.addEdge(z3, b);
        graph.addEdge(z4, j);
        graph.addEdge(z4, r);
        graph.addEdge(z4, h);
}

	
	public static void createSet40(Graph graph, ArrayList<Node> nodes) {
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
        Node u = new Node(20, "Sochi"); //AER
        Node v = new Node(21, "Astrakhan"); //ASF
        Node w = new Node(22, "Chelyabinsk"); //CEK
        Node x = new Node(23, "Domodedovo"); //DME
        Node y = new Node(24, "Belgorod"); //EGO
        Node z = new Node(25, "Baku"); //GYD
        Node z1 = new Node(26, "Khrabrovo"); //KGD
        Node z2 = new Node(27, "Kazan"); //KZN
        Node z3 = new Node(28, "St. Petersburg"); //LED
        Node z4 = new Node(29, "Stavropol Krai"); //MRV
        Node z5 = new Node(30, "Tatarstan"); //NBC
        Node z6 = new Node(31, "Nizhnevartovsk"); //NJC z6z9z11
        Node z7 = new Node(32, "Yamalo-Nenets Autonomous Okrug"); //NUX
        Node z8 = new Node(33, "Ob"); //OVB
        Node z9 = new Node(34, "Yekaterinburg"); //SVX
        Node z10 = new Node(35, "Taganorg"); //TGK
        Node z11 = new Node(36, "Bugulma"); //UUA
        Node z12 = new Node(37, "Irkutsk Oblast"); //BTK
        Node z13 = new Node(38, "Chelyabinsk"); //CEK
        Node z14 = new Node(39, "Chita"); //HTA


        Collections.addAll(nodes, a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,w,x,y,z,z2,z3,z4,z5,z6,z7,z8,z9,z10,z11,z12,z13,z14);

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
        graph.addEdge(u, z2);
        graph.addEdge(u, a);
        graph.addEdge(u, s);
        graph.addEdge(v, z2);
        graph.addEdge(v, b);
        graph.addEdge(v, y);
        graph.addEdge(v,z4);
        graph.addEdge(w, z2);
        graph.addEdge(w, c);
        graph.addEdge(w, k);
        graph.addEdge(x, z2);
        graph.addEdge(x, n);
        graph.addEdge(x, b);
        graph.addEdge(x, z5);
        graph.addEdge(x, p);
        graph.addEdge(y, z1);
        graph.addEdge(y, m);
        graph.addEdge(y, z2);
        graph.addEdge(y, n);
        graph.addEdge(y, o);
        graph.addEdge(z, z5);
        graph.addEdge(z, d);
        graph.addEdge(z1, g);
        graph.addEdge(z1, f);
        graph.addEdge(z2, l);
        graph.addEdge(z2, z3);
        graph.addEdge(z2, e);
        graph.addEdge(z3, z5);
        graph.addEdge(z3, v);
        graph.addEdge(z3, b);
        graph.addEdge(z4, j);
        graph.addEdge(z4, r);
        graph.addEdge(z4, h);
        graph.addEdge(z5, i);
        graph.addEdge(z5, t);
        graph.addEdge(z5, a);
        graph.addEdge(z6,z9);
        graph.addEdge(z6,z11);
        graph.addEdge(z6,u);
        graph.addEdge(z7, z9);
        graph.addEdge(z8,z13);
        graph.addEdge(z8,z9);
        graph.addEdge(z9,z2);
        graph.addEdge(z9,z13);
        graph.addEdge(z9,z6);
        graph.addEdge(z10,x);
        graph.addEdge(z11,x);
        graph.addEdge(z11,z3);
        graph.addEdge(z11,z6);
        graph.addEdge(z12,m);
        graph.addEdge(z8,z12);
        graph.addEdge(z8,z13);
        graph.addEdge(p,z13);
        graph.addEdge(z9,i);
        graph.addEdge(z7,k);
        graph.addEdge(z14,w);
        graph.addEdge(z3,s);
        graph.addEdge(z8,g);
        graph.addEdge(z13,o);
        graph.addEdge(z5,j);
        graph.addEdge(z6,q);
}		
}
