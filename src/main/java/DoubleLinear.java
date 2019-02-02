import java.util.HashMap;
import java.util.Map;

class DoubleLinear {

    public static int dblLinear(int n) {
        int[] arr = new int[n+1];
        Map<Integer, Integer> nums = new HashMap<>();

        arr[0] = 1;
        int insertIndex = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int y = 2 * x + 1;
            if(arr[n] > 0 && y > arr[n])
                break;

            if(nums.get(y) == null) {
                arr[insertIndex] = y;
                swapIfNotInOrder(arr, insertIndex);
                if(insertIndex < n) {
                    insertIndex++;
                }
            }

            int z = 3 * x + 1;
            if(insertIndex < n) {
                nums.put(z,z);
                arr[insertIndex++] = z;
            }
        }
        return arr[n];
    }

    private static void swapIfNotInOrder(int[] arr, int i) {
        for(; i > 0 && arr[i] < arr[i-1]; i--) {
            int tmp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = tmp;
        }
    }
}