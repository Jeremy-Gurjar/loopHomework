import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
;
public class loopHomework {

    public static void main(String[] args) {
        Q6();
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
        System.out.println("Enter a whole number to reverse:");
        int num = scanner.nextInt();
        int reversedNum = 0;

        for (;num != 0; num /= 10) {
            int digit = num%10;
            reversedNum = reversedNum*10+digit;
        }
        System.out.println(reversedNum);
    }

    static void Q5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial of:");
        int num = scanner.nextInt();
        int factNum = 1;
        for (int i = 1; i <= num; i++) {
            factNum = factNum*i;
        }
        System.out.println(factNum);
    }

    static void Q6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }

    static void Q7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter a second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter an operator (*,+,-,/):");
        String op = scanner.next();

        switch (op) {
            case "*":
                System.out.println(num1*num2);
                break;
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
        }
    }

    static void Q8() {
        int x = 2;
        for (int i = 1; i <= 20; i++) {
            System.out.println(x*i);
        }
    }

    static void Q9() {
        for (int i = 1; i <= 100; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
             System.out.println(i);
         }
        }
    }

    static void Q10() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i <= 12; i++) {
            System.out.println(num*i);
        }
    }

    static void Q11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = scanner.next();
        int numOfA = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A') {
                numOfA++;
            }
        }
        System.out.println("The number of A's are: " + numOfA);
    }

    static void Q12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        int total = 0;
        for (; a <= b; a++) {
            if (a % 9 == 0) {
                total += a;
            }
        }
        System.out.println(total);
    }

    static void Q13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three different numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            System.out.println("This is the order from lowest to highest:");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
        else if (num1 <= num3 && num3 <= num2) {
            System.out.println("This is the order from lowest to highest:");
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        }
        else if (num2 <= num3 && num3 <= num1) {
            System.out.println("This is the order from lowest to highest:");
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        }
        else if (num2 <= num3) {
            System.out.println("This is the order from lowest to highest:");
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }
        else if (num1 >= num2) {
            System.out.println("This is the order from lowest to highest:");
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }
        else {
            System.out.println("This is the order from lowest to highest:");
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        }
    }

    static void Q14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to find the sum and average of:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a+b;
        System.out.println("The sum is: " + sum);
        int average = sum/2;
        System.out.println("The average is: " + average);
    }

    static void Q15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("*".repeat(a+i-a+1));
        }
    }
}
