public class Hello {
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("factorial of given number %d is %d",n, getFact(n));
    }

    public static int getFact(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }
}
