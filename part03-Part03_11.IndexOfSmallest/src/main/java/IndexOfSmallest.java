
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999) {
                break;
            }
            list.add(input);
        }
        int smallest = list.get(0);
        int numIndex = 0;
        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            if(smallest > number) {
                smallest = number;
                
                if(smallest == number){
                    numIndex = i;
                }
            }
            
        }
        
        for(int lis : list){
            System.out.println("For each loop number is " + lis);
        }
        
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index " + (numIndex));
        
        

        
    }
}
