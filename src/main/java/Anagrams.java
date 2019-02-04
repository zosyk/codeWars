import java.math.BigInteger;
import java.util.Arrays;

public class Anagrams {

    public BigInteger listPosition(String word) {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String sorted = String.valueOf(arr);

        return listPosition(word, sorted, BigInteger.ONE);
    }

    private BigInteger listPosition(String word, String sorted, BigInteger position) {
        if (word.isEmpty() || word.equals(sorted)) return position;

        BigInteger offset = BigInteger.ZERO;
        char c = '.';
        for (int i = 0; i < sorted.length(); i++) {
            if (sorted.charAt(i) == c) continue;

            if (sorted.charAt(i) == word.charAt(0)) {
                sorted = sorted.substring(0, i) + sorted.substring(i + 1);
                break;
            } else {
                offset = offset.add(stringFactorialWithDuplicates(sorted.substring(0, i) + sorted.substring(i + 1)));
                c = sorted.charAt(i);
            }
        }

        return position.add(listPosition(word.substring(1), sorted, offset));
    }

    private BigInteger stringFactorialWithDuplicates(String s) {
        BigInteger n = factorial(s.length());

        int count = 1;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (c == s.charAt(i))
                count++;
            else {
                n = n.divide(factorial(count));
                c = s.charAt(i);
                count = 1;
            }
        }
        n = n.divide(factorial(count));
        return n;
    }

    private BigInteger factorial(int n) {
        if (n < 2) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}