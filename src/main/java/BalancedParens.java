import java.util.*;
import static java.util.Arrays.asList;

public class BalancedParens {
    public static List <String> balancedParens (int n) {
        if(n == 0) return asList("");
        return balancedParensHelper("", n, 0);
    }

    private static List<String> balancedParensHelper(String str, int openedLeft, int closedLeft) {
        if(openedLeft == 0) {
            if(closedLeft > 0) return balancedParensHelper(str + ")", openedLeft, closedLeft- 1);
            return new ArrayList<>(asList(str));
        } else if(closedLeft == 0) {
            return balancedParensHelper(str + "(", openedLeft - 1, closedLeft+1);
        } else {
            List<String> list = balancedParensHelper(str + "(", openedLeft - 1, closedLeft+1);
            list.addAll(balancedParensHelper(str + ")", openedLeft, closedLeft- 1));
            return list;
        }
    }
}