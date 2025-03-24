import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Graphs {


    static Graph<String> makeGraph(){
        Graph<String> graph = new AdjacencyGraph<>();
        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");
        graph.add("F");
        graph.add("G");
        graph.add("H");
        graph.add("I");
        graph.add("J");
        graph.add("K");

        graph.connectUndirected("A", "B");
        graph.connectDirected("A", "C");

        graph.connectUndirected("B", "A");
        graph.connectUndirected("B", "E");

        graph.connectUndirected("C", "D");
        graph.connectUndirected("C", "E");
        graph.connectUndirected("C", "H");

        graph.connectDirected("D", "B");
        graph.connectUndirected("D", "C");
        graph.connectUndirected("D", "F");

        graph.connectUndirected("E", "B");
        graph.connectUndirected("E", "C");
        graph.connectDirected("E", "F");

        graph.connectUndirected("F", "D");
        graph.connectUndirected("F", "G");

        graph.connectUndirected("I", "K");

        graph.connectDirected("J", "I");
        graph.connectUndirected("J", "K");

        graph.connectUndirected("K", "I");
        graph.connectUndirected("K", "J");
        return graph;
    }
    
}
