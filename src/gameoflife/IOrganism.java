/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author austin
 */

public interface IOrganism {
    public Point getPointLocation();
    public boolean isAlive();
    public void die();
    public void reproduce();
    public void birth();

}
