import java.util.Scanner;

public class StudentGradeCalculater{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject:");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Please enter the valid number of subject. ");
            return;

        }
        int totalMarks = 0;
        int MaxMarksPerSubjext = 100;

        for(int i = 1; i <= n; i++){
            System.out.print("Enter marks obtained in subject " + i +"(out of 100):");
            int marks = sc.nextInt();

            if(marks < 0 || marks > MaxMarksPerSubjext){
                System.out.println("Marks range of 0 to 100.");
                i--;
            }
            else{
                totalMarks += marks;
            }
        }
        double avgPercentage = (double) totalMarks / (n * MaxMarksPerSubjext)*100;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Avg Percentage: " +avgPercentage+ "%");

        String grade;

        if(avgPercentage >= 90){
            grade = "A+";
        }
        else if(avgPercentage >= 80){
            grade = "A";
        }
        else if(avgPercentage >= 70){
            grade = "B";
        }
        else if(avgPercentage >= 60){
            grade = "C";
        }
        else if(avgPercentage >= 50){
            grade = "D";
        }
        else{
            grade = "F";
        }
     System.out.println("Grade: " + grade );    
         
    }
}    