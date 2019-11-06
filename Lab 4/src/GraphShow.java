import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class GraphShow {
    public static void main(String[] args) {

    	long startTime, endTime;
    	
        Graph graph = new Graph(false);
        BFS bfs = new BFS();
//---------------Simple Menu---------------------		
        int choice, departure, arrival, connectivity;
        
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
		

		System.out.println("These are the Cities Available:");
		for (Node node : nodes) {
			System.out.println(node.id+1 + ". " + node.name);
		}
		System.out.print("Enter Departure City: ");
		departure = sc.nextInt();
		System.out.print("Enter Arrival City: ");
		arrival = sc.nextInt();
		
		//To display the calculate and display shortest path - Original		
		long totaltime = 0;
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: Original");
        
	    
		//To create edge from 1 node to all nodes.
	    connectivity = graph.getAdjacencyList().size()/100*10;
      	for (Node i : nodes) {
      		if (connectivity!=0) {
	      		connectivity--;
				for (Node j : nodes) {
					 if(!graph.hasEdge(i, j) && i != j) {
						 graph.addEdge(i, j);
					 }
				}
      		}
		}
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: 10%");
	    
	    connectivity = graph.getAdjacencyList().size()/100*20;
      	for (Node i : nodes) {
      		if (connectivity!=0) {
	      		connectivity--;
				for (Node j : nodes) {
					 if(!graph.hasEdge(i, j) && i != j) {
						 graph.addEdge(i, j);
					 }
				}
      		}
		}
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: 20%");
	    
	    
	    connectivity = graph.getAdjacencyList().size()/100*30;
      	for (Node i : nodes) {
      		if (connectivity!=0) {
	      		connectivity--;
				for (Node j : nodes) {
					 if(!graph.hasEdge(i, j) && i != j) {
						 graph.addEdge(i, j);
					 }
				}
      		}
		}
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: 30%");
	    
	    connectivity = graph.getAdjacencyList().size()/100*40;
      	for (Node i : nodes) {
      		if (connectivity!=0) {
	      		connectivity--;
				for (Node j : nodes) {
					 if(!graph.hasEdge(i, j) && i != j) {
						 graph.addEdge(i, j);
					 }
				}
      		}
		}
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: 40%");
	    
	    connectivity = graph.getAdjacencyList().size()/100*50;
      	for (Node i : nodes) {
      		if (connectivity!=0) {
	      		connectivity--;
				for (Node j : nodes) {
					 if(!graph.hasEdge(i, j) && i != j) {
						 graph.addEdge(i, j);
					 }
				}
      		}
		}
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: 50%");
	    
	    connectivity = graph.getAdjacencyList().size()/100*60;
      	for (Node i : nodes) {
      		if (connectivity!=0) {
	      		connectivity--;
				for (Node j : nodes) {
					 if(!graph.hasEdge(i, j) && i != j) {
						 graph.addEdge(i, j);
					 }
				}
      		}
		}
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: 60%");
	    
	    connectivity = graph.getAdjacencyList().size()/100*70;
      	for (Node i : nodes) {
      		if (connectivity!=0) {
	      		connectivity--;
				for (Node j : nodes) {
					 if(!graph.hasEdge(i, j) && i != j) {
						 graph.addEdge(i, j);
					 }
				}
      		}
		}
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: 70%");
	    
	    connectivity = graph.getAdjacencyList().size()/100*80;
      	for (Node i : nodes) {
      		if (connectivity!=0) {
	      		connectivity--;
				for (Node j : nodes) {
					 if(!graph.hasEdge(i, j) && i != j) {
						 graph.addEdge(i, j);
					 }
				}
      		}
		}
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: 80%");
	    
	    connectivity = graph.getAdjacencyList().size()/100*90;
      	for (Node i : nodes) {
      		if (connectivity!=0) {
	      		connectivity--;
				for (Node j : nodes) {
					 if(!graph.hasEdge(i, j) && i != j) {
						 graph.addEdge(i, j);
					 }
				}
      		}
		}
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: 90%");
	    

      	for (Node i : nodes) {
				for (Node j : nodes) {
					 if(!graph.hasEdge(i, j) && i != j) {
						 graph.addEdge(i, j);
					 }
				}
		}
	    for(int i = 0 ;i<5;i++){
	        startTime = System.nanoTime();
	        bfs.shortestRoute(graph, nodes.get(departure-1), nodes.get(arrival-1));
	        endTime = System.nanoTime();
	        if(i==0)
	            totaltime=endTime-startTime;
	        else
	            totaltime=endTime-startTime + totaltime;
	    }
	    System.out.println("Time taken = " + ((totaltime/5)/1000) + "ms");
	    System.out.println("Connectivity: 100%");
    }
}