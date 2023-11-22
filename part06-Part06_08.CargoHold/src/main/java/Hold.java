
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold (int maxWeight){
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int sumWeight = 0;
        for(Suitcase currentSuitcase : suitcases) {
            sumWeight += currentSuitcase.totalWeight();
        }
        if(sumWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    public void printItems(){
        for(Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString(){
        int suitcaseCount = 0;
        int sumWeight = 0;
        
        for(Suitcase suitcase : suitcases) {
            if(sumWeight + suitcase.totalWeight() <= this.maxWeight) {
                sumWeight += suitcase.totalWeight();
                suitcaseCount++;
            }
        }
        return suitcaseCount + " suitcases (" + sumWeight + " kg)";
    }
    
    
}
