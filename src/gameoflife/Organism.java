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
public class Organism implements IOrganism{
    
    Point pointLocation;
    boolean alive = false;
    
    public Organism(Point point, boolean alive){
        this.pointLocation = point;
        this.alive = alive;
    }
   
    public Point getPointLocation() {
        return pointLocation;
    }

    public boolean isAlive() {
        return this.alive;
    }
    public void die(){
        this.alive = false;
    }
    
    public void reproduce(){
        this.birth();
    }
    public void birth(){
        this.alive = true;
    }
    
    public String toString(){
        if (this.alive){
            return "X";
        }
        else{
            return "o";
        }
    }

    
}
