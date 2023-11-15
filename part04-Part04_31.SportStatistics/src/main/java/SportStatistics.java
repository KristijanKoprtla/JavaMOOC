
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
  
        
        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNext()) {
                String line = fileReader.nextLine();
                String parts[] = line.split(",");
                
                String teamHome = parts[0];
                String teamGuests = parts[1];
                
                int scoreHome = Integer.valueOf(parts[2]);
                int scoreGuest = Integer.valueOf(parts[3]);
                
                if((teamName.equals(teamHome) || teamName.equals(teamGuests))) {
                    games++;
                    if(teamName.equals(teamHome) && scoreHome > scoreGuest){
                        wins++;
                    } else if(teamName.equals(teamGuests) && scoreGuest > scoreHome) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
            }
            
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        

    }

}
