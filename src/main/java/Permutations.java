import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;
import static java.util.Arrays.asList;
import static java.util.Arrays.copyOfRange;

class Permutations {


    /**
     * 12 = 12 21
     * 123 = 123 132
     * 231 213
     * 312 321
     */
    public static List<String> singlePermutations(String s) {
        if (s.length() == 0) return new ArrayList<>();
        if (s.length() == 1) return asList(s);

        char[] arr = s.toCharArray();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            List<String> perms = singlePermutations(valueOf(copyOfRange(arr, 0, i)) + valueOf(copyOfRange(arr, i + 1, arr.length)));
            for (String p : perms) {
                if (!result.contains(c + p))
                    result.add(c + p);
            }
        }

        return result;

    }

}