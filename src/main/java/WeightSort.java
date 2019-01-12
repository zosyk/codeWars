import java.util.Arrays;

public class WeightSort {

    public static String orderWeight(String input) {

        String[] array = input.split(" ");
        Arrays.sort(array, (a, b) -> {
            int aSum = a.chars().map(Character::getNumericValue).sum();
            int bSum = b.chars().map(Character::getNumericValue).sum();

            return aSum == bSum ? a.compareTo(b) : aSum - bSum;
        });

        return String.join(" ", array);
    }

}