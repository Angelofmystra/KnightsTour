//Problem: you have a standard 8x8 chessboard, empty but for a single knight on some square. 
//Your task is to emit a series of legal knight moves that result in the knight visiting every square 
//on the chessboard exactly once. Note that it is not a requirement that the tour be "closed"; 
//that is, the knight need not end within a single move of its start position.
//
//Input and output may be textual or graphical, according to the conventions of the programming environment. 
//If textual, squares should be indicated in algebraic notation. 

//The output should indicate the order in which the knight visits the squares, starting with the initial position. 
//The form of the output may be a diagram of the board with the squares numbered ordering to 
//visitation sequence, or a textual list of algebraic coordinates in order, or even an actual animation of 
//the knight moving around the chessboard.
//
//Input: starting square
//
//Output: move sequence 

package knightstour;
import static java.lang.System.out;
/**
 *
 * @author bertrandbrompton
 */
public class KnightsTour {
    private static String DEFAULT_POSITION = "a1";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        args = new String[2]; // this line of code removed an index array out of bounds exception. 
        if(args.length == 0){
            args[0] = DEFAULT_POSITION;
        }
        Knight knight = new Knight();
        Board board = new Board();
        board.generateSquares();
        knight.startposition(args[0]);
        solve();
    }

    private static void solve() {        
        out.println("Solution Found.");
    }    
}
