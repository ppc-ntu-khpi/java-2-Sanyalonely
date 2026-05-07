//package domain;

public class Exercise {

    public static String Calculate(int n1, int n2) {
        StringBuilder result = new StringBuilder();

        int limit = Math.min(n1, n2);

        for (int i = 2; i <= limit; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                if (isPrime(i)) {
                    if (result.length() > 0) {
                        result.append(", ");
                    }
                    result.append(i);
                }
            }
        }

        return result.length() > 0 ? result.toString() : "спільних простих дільників немає";
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
