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
public class GOLBoard implements IGOLBoard{

    private Organism [][] board_array;
    private int board_size;
    boolean trace = false;
    
    public GOLBoard(int size){
        this.board_size = size;
        this.board_array = new Organism[size][size];
        for (int i = 0; i < size; i ++){
            for (int k = 0; k <size; k++){
                board_array[i][k] = new Organism(new Point(i,k), false);
            }
        }
    }
    
    @Override
    public void checkNeighbors() {
        for (int i = 0; i < board_size; i ++){
            for (int k = 0 ; k < board_size; k++){
                int neighbour_count = 0;
                
                
                for (int j = i - 1; j <= i+1; j++){
                    for (int n = k - 1; n <= k+1; n++){
                        if (j < board_size && j >= 0 && n < board_size && n >= 0 &&
                                board_array[j][n].isAlive() && !(j == i && n == k) ){
                            if (trace){
                                System.out.println("Neighbour Found");
                                System.out.println(i + "," + k + " : " + j+ " " + n);

                            }
                           
                            neighbour_count++;
                           
                        }
                    } 
                }
               
                
                if (neighbour_count > 3 && board_array[i][k].isAlive()){
                    if (trace)
                        System.out.println("Enforcing Overpopuation " + i + "," + k);
                    enforceOverPop(board_array[i][k]);
                    
                }
                else if (neighbour_count < 2 && board_array[i][k].isAlive()){
                    if (trace)
                        System.out.println("Enforcing Under popuation " + i + "," + k);

                    enforceUnderPop(board_array[i][k]);
                }
                else if (neighbour_count > 3 && !board_array[i][k].isAlive()){
                    if (trace)
                        System.out.println("Enforcing Under popuation " + i + "," + k);

                    

                    enforceRepro(board_array[i][k]);
                }
            }
        }
    }
    

    @Override
    public void enforceUnderPop(Organism org) {
        org.die();
    }

    @Override
    public void enforceOverPop(Organism org) {
        org.die();
    }

    @Override
    public void enforceRepro(Organism org) {
        org.reproduce();
    }
    
    public void printBoard(){
        for (int i =0; i < board_size; i ++){
            for (int k = 0; k < board_size; k ++){
                System.out.print(board_array[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
    }
    public void setState(Point[] cellLocations){
        for (Point cell: cellLocations){
            this.board_array[cell.x][cell.y].birth();
        }
    }
    public void traceOn(boolean on){
        this.trace = on;
    }


    
}
