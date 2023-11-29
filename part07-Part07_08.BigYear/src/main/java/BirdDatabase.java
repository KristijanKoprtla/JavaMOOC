
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
public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void Add(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }
    
    public void printBirds(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }
    public Bird getBird(String name){
        for(Bird bird : birds){
            if(bird.getName().equals(name)){
                return bird;
            }
        }
        return null;
    }
    
    public void addObservation(String name){
        Bird bird = getBird(name);
        if(bird != null){
            bird.addObservation();
        } else {
            System.out.println("Not a bird!");
        }
    }
}
