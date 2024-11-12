package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int num) {
        int original = Math.abs(num) ;
        int reversed = 0;
        int temp = original;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;


        }

        return  original == reversed;

    }
    public static boolean isPerfectNumber(int num) {

        if (num < 1) {
            return false;
        }

        int sum = 0;


        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }


        return sum == num;
    }
    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }

        StringBuilder result = new StringBuilder();
        int reversedNumber = reverse(num);
        int digitCount = getDigitCount(num);

        for (int i = 0; i < digitCount; i++) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0: result.append("Zero "); break;
                case 1: result.append("One "); break;
                case 2: result.append("Two "); break;
                case 3: result.append("Three "); break;
                case 4: result.append("Four "); break;
                case 5: result.append("Five "); break;
                case 6: result.append("Six "); break;
                case 7: result.append("Seven "); break;
                case 8: result.append("Eight "); break;
                case 9: result.append("Nine "); break;
            }
            reversedNumber /= 10;
        }

        return result.toString().trim();
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            return -1; // Negatif sayılar için özel durum
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}

