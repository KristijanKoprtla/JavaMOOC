
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
public class MessagingService {
    private ArrayList<Message> message;  
    
    public MessagingService(){
        this.message = new ArrayList<>();
        
    }
    
    public void add(Message message) {
        if(message.getContent().length() <= 280) {
            this.message.add(message);
        } else {
            System.out.println("Message is too long!");
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.message;
    }
}
