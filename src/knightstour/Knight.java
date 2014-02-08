
package knightstour;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author bertrandbrompton
 */
public class Knight {
    HashMap<String,IntPair> hashmap;
    private static int DEFAULT_X = 0; // The DEFAULT_X and DEFAULT_Y represent a1
    private static int DEFAULT_Y = 0;
    IntPair currentPosition = new IntPair(DEFAULT_X,DEFAULT_Y);
    
    public Knight() {
        this.hashmap = new HashMap<>();
        this.populateMap();
    }
    void startposition(String string) { // I could probably do this better. Im not 100% sure if I will use algebraic notation or i,j behind the scenes fully.
        setPos(hashmap.get(string));    
    }
    private void setPos(IntPair intpair){
        currentPosition = intpair;
    }
    private void populateMap() {
        String[] arrX = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] arrY = {"1", "2", "3", "4", "5", "6", "7", "8"};
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                hashmap.put(arrX[0]+arrY[0],new IntPair(i,j));
            }
        }
    }
    /*
        Source code for IntPair borrowed without permission (and unmodified) from: http://stackoverflow.com/questions/10234487/storing-number-pairs-in-java
    */
    class IntPair {
    // Ideally, name the class after whatever you're actually using 
    // the int pairs *for.*
    final int x;
    final int y;
    IntPair(int x, int y) {this.x=x;this.y=y;}
    // depending on your use case, equals? hashCode?  More methods?
    }    
}
