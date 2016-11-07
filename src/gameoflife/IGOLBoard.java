/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Point;
import java.util.HashMap;

/**
 *
 * @author austin
 */

public interface IGOLBoard {
    
    public enum Rules{
        UnderPopRule, OverPopRule, ReproductionRule
    }
    
    public void checkNeighbors();
    public void enforceUnderPop(Organism org);
    public void enforceOverPop(Organism org);
    public void enforceRepro(Organism org);
    public void setState(Point[] cellLocations);
    public void enforceRules(HashMap<Organism, Rules> enforcements);
}
