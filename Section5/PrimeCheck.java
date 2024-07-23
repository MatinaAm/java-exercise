package Section5;

public class PrimeCheck {

    public static void main(String[] args) {
        int number = 3; // عددی که می‌خواهیم بررسی کنیم
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }




    public static boolean isPrime(int num) {
        // اعداد کمتر از ۲ اول نیستند
        if (num <= 1) {
            return false;
        }

        // بررسی مقسوم علیه‌ها از ۲ تا رادیکال عدد
//        Math.sqrt برای کاهش عملیات لوپ
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // اگر عددی پیدا شود که مقسوم علیه باشد، عدد اول نیست
            }
        }

        return true; // اگر هیچ مقسوم علیه‌ای پیدا نشود، عدد اول است
    }
}
