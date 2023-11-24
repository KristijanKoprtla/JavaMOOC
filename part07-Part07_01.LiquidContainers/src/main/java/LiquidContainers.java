
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int firstMax = 100;
        int second = 0;
        int secondMax = 100;

        while (true) {
            System.out.println("First: " + first + "/" + firstMax);
            System.out.println("Second " + second + "/" + secondMax);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount < 0) {
                    first = first;
                } else if (amount + first > firstMax) {
                    first = 100;
                } else {
                    first += amount;
                }

            } else if (command.equals("move")) {

                if (amount < 0) {
                    second = second;
                } else if (amount > first) {
                    second += first;
                    first = 0;
                } else if (second + amount > secondMax) {
                    second = 100;
                } else {
                    second += amount;
                    first -= amount;
                }
            } else if(command.equals("remove")) {
                if(amount > second) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }

        }

    }

}
