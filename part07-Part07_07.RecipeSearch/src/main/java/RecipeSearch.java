
import java.nio.file.Paths;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        try(Scanner scanFile = new Scanner(Paths.get("recipes.txt"))) {
            while(scanFile.hasNextLine()){
                System.out.println("File to read: ");
                String line = scanFile.nextLine();
                System.out.println("Commands:");
                System.out.println("list - lists the recipes");
                System.out.println("stop - stops the program");
                
            }
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
