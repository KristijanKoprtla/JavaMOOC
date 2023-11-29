
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDatabase birdDatabase = new BirdDatabase();
        
        while(true){
            System.out.println("?");
            String scanner = scan.nextLine();
            
            if(scanner.equals("Quit")) {
                break;
            }
            if(scanner.equals("Add")){
                System.out.println("Name: ");
                String birdName = scan.nextLine();
                System.out.println("Name in Latin: ");
                String birdNameLatin = scan.nextLine();
                birdDatabase.Add(birdName, birdNameLatin);
                
                
            } else if(scanner.equals("All")) {
                birdDatabase.printBirds();
                
            } else if(scanner.equals("Observation")) {
                System.out.println("Bird? ");
                String birdObservation = scan.nextLine();
                birdDatabase.addObservation(birdObservation);
                
            } else if(scanner.equals("One")) {
                System.out.println("Bird? ");
                String bird = scan.nextLine();
                System.out.println(birdDatabase.getBird(bird));
            }
        }

    }

}
