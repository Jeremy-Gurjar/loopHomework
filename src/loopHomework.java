import java.util.Scanner;
;
public class loopHomework {

    public static void main(String[] args) {
        Q4();
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
        int n = 34;
        int a = 1;
        int b = 0;
        for (int i = 0; i <= n-a; i++) {
            i = a + b;
            a = b;
            b = i;
            System.out.println(i);
        }
    }

    static boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void Q3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println("This number is prime.");
        }
        else {
            System.out.println("This number is not prime.");
        }
    }

    static void Q4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number to reverse:52");
        int num = scanner.nextInt();
        int reversedNum = 0;

        for (;num != 0; num /= 10) {
            int digit = num%10;
            reversedNum = reversedNum*10+digit;
        }
        System.out.println(reversedNum);
    }

    static void Q5() {

    }
}
