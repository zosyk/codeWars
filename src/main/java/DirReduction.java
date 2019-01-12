import java.util.*;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        LinkedList<String> steps = new LinkedList<>();
        for(String current: arr) {
            if(!steps.isEmpty()) {
                String last = steps.getLast();
                if(     current.equals("NORTH") && last.equals("SOUTH") ||
                        current.equals("SOUTH") && last.equals("NORTH") ||
                        current.equals("EAST") && last.equals("WEST") ||
                        current.equals("WEST") && last.equals("EAST")) {
                    steps.removeLast();
                    continue;
                }
            }
            steps.add(current);
        }
        return steps.toArray(new String[0]);
    }
}
