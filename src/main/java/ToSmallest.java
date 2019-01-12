public class ToSmallest {

    public static long[] smallest(long n) {
        String str = String.valueOf(n);
        long smallest = n, firstIndex = str.length(), secondIndex = str.length();
        for (int i = 0; i < str.length(); i++)
            for (int j = 0; j < str.length(); j++) {
                StringBuilder sb = new StringBuilder(str).deleteCharAt(i);
                sb.insert(j, str.charAt(i));

                Long l = Long.valueOf(sb.toString());
                if (l < smallest) {
                    smallest = l;
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        return new long[]{smallest, firstIndex, secondIndex};
    }
}