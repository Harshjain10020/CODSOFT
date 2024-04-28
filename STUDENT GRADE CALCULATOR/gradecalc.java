import java.util.Scanner;

public class gradecalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num of subjects :");
        int NumSub = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1 ; i <= NumSub; i++){
            System.out.println("Enter the marks sub no."+ i+":");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        double avgPercent = (totalMarks/NumSub);
        System.out.println("Your percentage is :"+ avgPercent);
        char grade ;
        if (avgPercent >= 90){
            grade = 'A';
        } else if (avgPercent >= 80) {
            grade = 'B';
        } else if (avgPercent>=70) {
            grade = 'c';
        }else if (avgPercent >= 60) {
            grade = 'D';
        }else {
            grade = 'f';
        }
        System.out.println("total marks:" + totalMarks);
        System.out.println("your grade is :" + grade);
        System.out.println("Percentage :"+ avgPercent);
        scanner.close();

    }
}