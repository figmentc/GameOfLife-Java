/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;
import java.awt.Point;

/**
 *
 * @author austin
 */
public class GameOfLife {
    
    static final int BOARDSIZE = 20;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Initial: ");

        GOLBoard board = new GOLBoard(BOARDSIZE);
        Point[] initialState = {new Point(1,3), new Point(2,3), new Point(3,3), new Point(3, 2), new Point(2,1)};
        board.setState(initialState);
        board.traceOn(true);
        board.printBoard();
        
        for (int i = 0; i < 30; i ++){
            board.checkNeighbors();
            board.printBoard();
        }
        
       
    
    
    }
    
}
