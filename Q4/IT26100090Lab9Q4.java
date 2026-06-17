import java.util.Scanner;

public class IT26100090Lab9Q4 {

    
    public static double calcFinalMark(double assMark, double examMark) {
        double finalMark = (assMark * 0.30) + (examMark * 0.70);
        return finalMark;
    }

    
    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60 && mark < 75) {
            return 'B';
        } else if (mark >= 50 && mark < 60) {
            return 'C';
        } else {
            return 'F';
        }
    }

    
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + "\t\t" + finalMark + "\t\t" + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            
            System.out.print("Assignment Mark (out of 100): ");
            double assMark = scanner.nextDouble();
            
            System.out.print("Exam Paper Mark (out of 100): ");
            double examMark = scanner.nextDouble();
            scanner.nextLine();
            
            
            finalMarks[i] = calcFinalMark(assMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
            
            System.out.println(); 
        }

        
        System.out.println("Name\t\tFinal Mark\tGrade");
        System.out.println("-------------------------------------");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}