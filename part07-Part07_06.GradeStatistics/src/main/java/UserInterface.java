
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ana
 */
public class UserInterface {

    private Points points;
    private Scanner scanner;

    public UserInterface(Points points, Scanner scanner) {
        this.points = points;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops: ");
        int avgPassed = 0;
        int counter = 0;
        int participants = 0;
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            } else if ((point < 0) || (point > 100)) {
                continue;
            }
            if (point <= 100 && point >= 50) {
                avgPassed += point;
                counter++;
            }
            participants++;
            points.addPoints(point);
            points.addGrades(point);
        }
        System.out.println("Point average (all): " + points.avgPoints());
        if (avgPassed > 0) {
            System.out.println("Point average (passing): " + (double) avgPassed / counter);
        } else {
            System.out.println("Point average (passing): -");
        }
        if (counter > 0) {
            System.out.println("Pass percentage: " + 100 * counter / (double) participants);
        } else {
            System.out.println("Pass percentage: 0.0");
        }
        printGradeDistribution();
    }

    public void printGradeDistribution() {
        
        System.out.println("Grade distribution: ");
        for(int grade = 5; grade >= 0; grade--){
            int count = calculateGradeCount(grade);
            System.out.println(grade + ": " + printStars(count));
        }
    }

    private int calculateGradeCount(int grade) {
        int count = 0;
        for (Integer g : points.getGrades()) {
            if (g == grade) {
                count++;
            }
        }
        return count;
    }
    
    private String printStars(int count) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stars.append("*");
        }
        return stars.toString();
    }

}
