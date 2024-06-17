package Section4;

public class Factorial {

    public static void main(String[] args) {
        int number = 7;
        int result = factorialFunc(number);
        System.out.println("value of factorial function with input " + number + " is: " + result);
    }
        public static int factorialFunc(int x) {
            if (x <= 1) {
                return 1;
            } else {
                return x * factorialFunc(x- 1);
            }
        }

    }


