/*
@ASSESSME.USERID: bd9794
@ASSESSME.AUTHOR: BesnikDacaj
@ASSESSME.DESCRIPTION: 
@ASSESSME.ANALYZE: YES
*/

import java.util.HashSet;
import java.util.Set;

public class Vertex<E> {

    private E value;
    private Set<Vertex<E>> neighbors = null;
    
    public Vertex(E value){
        this.value = value;
        this.neighbors = new HashSet<>();

    }

    public E getValue(){
        return this.value;
    }

    public void connect(Vertex<E> neighbors ){

        this.neighbors.add(neighbors);


    }

    public boolean connected(Vertex<E> neighbors){
        return this.neighbors.contains(neighbors);
    }

    public Set<Vertex<E>> getNeighbors(){
        return this.neighbors;
    }

    public static void main(String[] args) {
        Vertex<String> vA = new Vertex<String>("A");
        
        Vertex<String> vB = new Vertex<String>("B");
        
        Vertex<String> vC = new Vertex<String>("C");

        vA.connect(vB);
        vA.connect(vC);
        vB.connect(vC);
        vC.connect(vA);
        vC.connect(vB);

        
    }
    
}
