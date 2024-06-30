package Section5;

public class PalindromeCheck {

    public static void main(String[] args) {
        int number = 12321; // عددی که می‌خواهیم بررسی کنیم
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        // اعداد منفی متقارن نیستند
        if (num < 0) {
            return false;
        }

        // تبدیل عدد به رشته
        String str = Integer.toString(num);
        int len = str.length();

        //   بررسی کاراکترهای رشته از دو طرف تا وسط رشته برای متقارن بودن دو به دو از اول و اخر متغیر

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false; // اگر کاراکترهای متقابل با هم برابر نباشند، عدد متقارن نیست
            }
        }

        return true; // اگر همه کاراکترهای متقابل با هم برابر باشند، عدد متقارن است
    }

}
