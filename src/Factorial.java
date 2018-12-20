
public class Factorial {

    public static void main(String[] args) {
        int n = 7;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("The factorial of 7 is " + result);
        result = factorial(n);
        System.out.println("The factorial of 7 is " + result);        
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
