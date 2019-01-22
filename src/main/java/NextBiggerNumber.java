public class NextBiggerNumber {

    public static long nextBiggerNumber(long n) {
        String s = String.valueOf(n);

        for (int i = s.length() - 2; i >= 0; i --) {
            String sub = s.substring(i);
            String sorted = sub.chars().sorted()
                    .collect(StringBuilder::new,
                            StringBuilder::appendCodePoint,
                            StringBuilder::append)
                    .reverse().toString();

            if (Long.valueOf(sorted) > Long.valueOf(sub)) {
                String first = sub.substring(0, 1);
                int firstIndexSorted = sorted.indexOf(first);
                StringBuilder sb = new StringBuilder(sorted);
                sb.deleteCharAt(firstIndexSorted - 1).reverse();
                return Long.valueOf(s.substring(0, i) + sorted.charAt(firstIndexSorted - 1) + sb.toString());
            }

        }
        return -1;
    }
}
