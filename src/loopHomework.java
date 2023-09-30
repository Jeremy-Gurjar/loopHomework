import java.util.Scanner;
;
public class loopHomework {

    public static void main(String[] args) {

    }

    static void Q1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = Integer.parseInt(scanner.next());
        System.out.println("Numbers from " + num + " to " + (num + 10));

        for (int i = num; i <= num + 10; i++) {
            System.out.println(i);
        }
    }

    static void Q2() {

    }
}
