public class FizzBuzz {
    public static void main(String[] args) {

        int n = 15;
        for (int i = 0; i <= n; i++) {
            System.out.println(getFizzBuzzRes(i));
        }
    }

    public static String getFizzBuzzRes(int i) {

        if (i % 15 == 0) {
            return "Fizz Buzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);

    }
}
