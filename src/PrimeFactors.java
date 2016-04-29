import java.util.ArrayList;

/**
 * Created by shion on 29/4/16.
 */
public class PrimeFactors {

    public static void main(String[] args) {
        System.out.println(generate(1));
        System.out.println(generate(30));
    }

    public static ArrayList<Integer> generate(int n) {
        ArrayList<Integer> primeList = new ArrayList<Integer>();

        if (n == 1) return primeList;

        for (int currentNumber = 2 ; currentNumber <= n ; currentNumber++) {
            if (isDivisible(currentNumber, n) && isPrime(currentNumber, primeList)) {
                primeList.add(currentNumber);
            }
        }

        return primeList;
    }

    private static boolean isDivisible(int divisor, int dividend) {
        return dividend % divisor == 0;
    }

    private static boolean isPrime(int number, ArrayList<Integer> primeList) {
        for (int prime : primeList) {
            if (isDivisible(prime, number)) return false;
        }
        return true;
    }
}
