
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String name = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String parts[] = input.split(",");
            
            int age = Integer.parseInt(parts[1]);
            String currentName = parts[0];
            if(age > maxAge){
                maxAge = age;
                name = currentName;
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
