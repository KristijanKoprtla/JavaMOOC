/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Film {
    private String name;
    private int filmAgeRating;

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.filmAgeRating = filmAgeRating;
    }
    
    public String name(){
        return this.name;
    }
    
    public int ageRating(){
        return this.filmAgeRating;
    }
    
    
}
