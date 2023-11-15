
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner fileName = new Scanner(Paths.get(file))) {
            while (fileName.hasNext()) {
                String line = fileName.nextLine();
                String[] parts = line.split(",");
                
                
                String name = parts[0];
                int num = Integer.valueOf(parts[1]);
                
                System.out.println(name + ", age: " + num + (num == 1 ? " year" : " years"));
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
