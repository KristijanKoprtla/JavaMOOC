
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container container = new Container();
        Container secondContainer = new Container();
        Scanner scan = new Scanner(System.in);

        

        while (true) {
            System.out.println("First: " + container.contains() + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);

            if (input.equals("add")) {
                container.add(amount);
            }
            if (input.equals("move")) {
                if (amount > container.contains()) {
                    amount = container.contains();
                }
                container.remove(amount);
                secondContainer.add(amount);
                
            }
            
            if (input.equals("remove")) {
                secondContainer.remove(amount);
            }

        }
    }

}
