
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int nameLength = 0;
        String name = "";
 
        
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String parts[] = input.split(",");
            
            int age = Integer.parseInt(parts[1]);
            String currentName = parts[0];
            int length = currentName.length();
            
            if(length > nameLength) {
                nameLength = length;
                name = currentName;
                
            }
            
            
            
            sum += age;
            count++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years " + (sum / (double) count));


    }
}
