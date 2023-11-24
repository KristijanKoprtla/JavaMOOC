/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Container {
    private int first = 0;

    public Container() {
    }
    
    public int contains() {
        return this.first;
        
    }
    
    public void add(int amount){
        if(amount < 0) {
            this.first = first;
        } else if(amount + this.first > 100){
            this.first = 100;
        } else {
            this.first += amount;
        }
    }
    
    public void remove(int amount) {
        if(amount < 0) {
            this.first = first;
        } else if( amount > first) {
            this.first = 0;
        } else {
            this.first -= amount;
        }
        
    }
    
    @Override
    public String toString() {
        return this.first + "/100";
    }
}
