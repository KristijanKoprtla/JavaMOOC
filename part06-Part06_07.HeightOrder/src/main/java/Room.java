
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
public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if(isEmpty()) {
            return null;
        }
        Person returnObj = this.persons.get(0);
        
        for(Person person : this.persons) {
            if(returnObj.getHeight() > person.getHeight()) {
                returnObj = person;
            }
        }
        return returnObj;
    }
    
    public Person take(){
        
        if(isEmpty()) {
            return null;
        }
        Person shortestPerson = shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;
    }

    
}
