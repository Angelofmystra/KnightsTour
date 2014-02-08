/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package knightstour;

import java.util.LinkedList;

/**
 *
 * @author bertrandbrompton
 */
public class Board {
    LinkedList<LinkedList<Square>> listi;
    
    void generateSquares() {
        listi = new LinkedList<>();
        for(int i = 0; i < 8 ; i++){           
            LinkedList listj = new LinkedList<Square>();
            for(int j = 0; j < 8 ; j++){
                Square square = new Square();
                square.setx(i);
                square.sety(j);
                listj.add(square);
            }
            listi.add(listj);
        }
    }
}
