import java.util.Scanner;

public class PracticeProblem {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Test evenOrOdd
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("evenOrOdd: " + evenOrOdd(num));

        // Test teacherOrStudent
        scanner.nextLine(); // clear buffer
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("teacherOrStudent: " + teacherOrStudent(name));

        // Test fartherFromZero
        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();
        System.out.println("fartherFromZero: " + fartherFromZero(num2));
    }

    public static String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static String teacherOrStudent(String word) {
        if (word.equals("Kalisz")) {
            return "Teacher";
        } else {
            return "Student";
        }
    }

    public static int fartherFromZero(int num) {
        if (num > 0) {
            return num + 5;
        } else if (num < 0) {
            return num - 5;
        } else {
            return 0;
        }
    }
}
