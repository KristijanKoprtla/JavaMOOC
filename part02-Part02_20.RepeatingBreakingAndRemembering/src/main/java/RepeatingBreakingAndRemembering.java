
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfNumbers = 0;
        int evenNum = 0;
        int oddNum = 0;

        System.out.println("Give numbers:");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num < 0){
                System.out.println("Thx Bye!");
                break;
            }
            if(num % 2 == 0){
                evenNum++;
            } else if(num % 2 != 0){
                oddNum++;
            }
                    
            sum += num;
            numberOfNumbers++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + (sum / (double) numberOfNumbers));
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + oddNum);

    }
}
