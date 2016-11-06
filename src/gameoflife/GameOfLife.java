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
    
    static final int BOARDSIZE = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Initial: ");

        GOLBoard board = new GOLBoard(BOARDSIZE);
        Point[] initialState = {new Point(5,5), new Point(5,6), new Point(6,6), new Point(6,5)};
        board.setState(initialState);
        board.printBoard();
        
        for (int i = 0; i < 5; i ++){
            board.checkNeighbors();
            board.printBoard();
        }
        
       
    
    
    }
    
}
