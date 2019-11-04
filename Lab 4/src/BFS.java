import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

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
}
