
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNums = 0;
        int numOfNums = 0;
        int numOfPositiv = 0; 
        
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            
            if(num > 0){
                numOfNums++;
                numOfPositiv++;
                sumOfNums += num;
            } 
        }
        if(numOfPositiv <= 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumOfNums / numOfNums);
        }
    }
}
