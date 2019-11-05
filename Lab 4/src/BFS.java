import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

//import com.sun.org.apache.xpath.internal.axes.NodeSequence;

public class BFS {

    public BFS(){};

    void breadthFirstSearch(Graph g, Node startingNode){
        LinkedList<Node> queue = new LinkedList<Node>();
        HashSet<Node> visited = new HashSet<Node>();
        queue.add(startingNode);
        
        HashMap<Node, LinkedList<Node>> adjacencyList = g.getAdjacencyList();
        
        while(!queue.isEmpty()) {
            Node node = queue.remove();
            visited.add(node);
            System.out.println("Visited: " + node.name);
            for (Node neighbor : adjacencyList.get(node)) {
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
    
    void shortestRoute(Graph g, Node startingNode, Node destinationNode) {
    	 LinkedList<Node> queue = new LinkedList<Node>();
         HashSet<Node> visited = new HashSet<Node>();
         queue.add(startingNode);
         
         HashMap<Node, LinkedList<Node>> adjacencyList = g.getAdjacencyList();
         
         int distance = -1;//Count Number of Stops
         boolean destinationFound = false; //Condition to break out of while loop
         HashMap<Node,Node> predecesor = new HashMap<Node,Node>();//Storing predecesors to get the path
         
         while(!queue.isEmpty() && !destinationFound) {
             Node node = queue.remove();
             visited.add(node);
             //System.out.println("Visited: " + node.name);
             for (Node neighbor : adjacencyList.get(node)) {
                 if(!visited.contains(neighbor)){
                     visited.add(neighbor);
                     queue.add(neighbor);
                     predecesor.put(neighbor,node); //Set node as the predecesor of all neighboring nodes
                 }
                 if(neighbor == destinationNode) {
                	 destinationFound = true;
                	 break;
                 }  
             }
         }
         
         String shortestPath = "";
         Node node = destinationNode;
         //Loop to get the predecesors
         while (node != startingNode) {
        	 shortestPath = " --> " + node.name + shortestPath;
        	 node = predecesor.get(node);
        	 distance += 1;
         }
         
         shortestPath = startingNode.name + shortestPath;
         
         if(distance != 0) {
		     System.out.println("Shortest Flight Path: " + shortestPath);
		     System.out.println("Number of stops = " + distance);
         }
         else {
        	 System.out.println("Departure: " + startingNode.name);
        	 System.out.println("Arrival: " + destinationNode.name);
         }
    }
}
