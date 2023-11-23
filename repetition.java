import java.util.Scanner;

public class repetition {
    private String courseName;
    public void Gradebook( String name ){
        courseName = name;
    }
    public void setCourseName( String name ){
        courseName = name;
    }
    public String getCourseName(){
        return courseName;
    }
    public void displayMessage(){
        System.out.printf("welcome to the gradebook for \n%s!\n\n",getCourseName());
    }
    public void determineClassAverage(){
        Scanner input = new Scanner(System.in);

        int total;
        int gradeCounter;
        int grade;
        int average;

        total = 0;
        gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.println("Enter grade");
            grade = input.nextInt();
            total = total+grade;
            gradeCounter = gradeCounter + 1;
        }

        average = total / 10;

        System.out.println("Total is all 10 grade is "+total);
        System.out.println("Class average is "+average);
    }
}