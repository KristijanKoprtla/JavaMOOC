
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ana
 */
public class Points {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Points() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(int points) {
        this.points.add(points);
    }

    public void addGrades(int points) {
        this.grades.add(pointsToGrade(points));
    }

    public int pointsToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }

    public double avgPoints() {
        double sum = 0;
        for (Integer point : points) {
            sum += point;
        }
        return sum / this.points.size();
    }
    
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    
   
    
    

}
