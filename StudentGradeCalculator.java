import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[5];
    int total = 0;
    double percentage;
    char grade;

    // Method to input student details
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        percentage = total / 5.0;
        assignGrade();
	sc.close();
    }

    // Method to assign grade based on percentage
    public void assignGrade() {
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 80) grade = 'B';
        else if (percentage >= 70) grade = 'C';
        else if (percentage >= 60) grade = 'D';
        else grade = 'F';
    }

    // Method to display results
    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name       : " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
    }
}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.displayResult();
    }
}
