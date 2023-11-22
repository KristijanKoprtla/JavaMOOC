
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int sumWeight = 0;
        for (Item currentItem : items) {
            sumWeight += currentItem.getWeight();
        }

        if (sumWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems(){
        for(Item item : items){
            String itemString = item.toString().substring(0, 1).toUpperCase() 
                    + item.toString().substring(1);
            System.out.println(itemString);
        }
    }
    public Item heaviestItem(){
        if(this.items.isEmpty()) {
            return null;
        }
        Item objRef = this.items.get(0);
        for (Item item : items) {
            if(objRef.getWeight() < item.getWeight()) {
                objRef = item;
            }
        }
        return objRef;
    }
    
    public int totalWeight(){
        int sumWeight = 0;
        for (Item item : items) {

            if (sumWeight + item.getWeight() <= this.maxWeight) {
                sumWeight += item.getWeight();
                
            }
        }
        return sumWeight;
    }
    
    

    @Override
    public String toString() {
        int sumWeight = 0;
        int itemCount = 0;
        for (Item item : items) {

            if (sumWeight + item.getWeight() <= this.maxWeight) {
                sumWeight += item.getWeight();
                itemCount++;
            }
        }
        String itemCounter = itemCount == 1 ? " item" : " items";
        return itemCount < 1 ? "no items (0 kg)" : itemCount 
                + itemCounter + " (" + sumWeight + " kg)";
    }

}
