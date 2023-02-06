import java.util.Scanner;
public class ExamGrader {
    public static void main (String[] args) {
        final int FAIL_THRESHOLD = 60;
        final int NUM_OF_TESTS = 3;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many students? ");
        int studentCount = keyboard.nextInt();

        for (int i = 0; i < studentCount; i++) {
            System.out.print("last name? ");
            String lastName = keyboard.next();
            System.out.print("first name? ");
            String firstName = keyboard.next();
            System.out.print("exam1? ");
            int exam1 = keyboard.nextInt();
            System.out.print("exam2? ");
            int exam2 = keyboard.nextInt();
            System.out.print("final? ");
            int exam3 = keyboard.nextInt();

            int average = (exam1 + exam2 + exam3) / NUM_OF_TESTS;

            System.out.println(firstName + " " + lastName + " scored " + exam1 + ", " + exam2
                    + ", and " + exam3 + " for an average of " + average);
            System.out.print(lastName + ", " + firstName + " ");

            if (average >= FAIL_THRESHOLD)
                System.out.println("passes");
            else
                System.out.println("fails");
        }

        keyboard.close();
    }
}