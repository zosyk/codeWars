import java.util.*;

public class Calculator {
    private static final List<String> OPERATIONS = Arrays.asList("+", "-", "*", "/");

    public static Double evaluate(String expression) {
        Deque<String> numberStack = new ArrayDeque<>();
        Deque<String> operationStack = new ArrayDeque<>();

        for(String l: expression.split(" ")) {
            if(OPERATIONS.contains(l)) {
                operationStack.push(l);
            } else {
                String op = operationStack.peek();
                if("*".equals(op)) {
                    numberStack.push((Double.valueOf(numberStack.pop()) * Double.valueOf(l)) + "");
                    operationStack.pop();
                } else if("/".equals(op)) {
                    numberStack.push((Double.valueOf(numberStack.pop()) / Double.valueOf(l)) + "");
                    operationStack.pop();
                } else numberStack.push(l);
            }
        }

        while (!operationStack.isEmpty()) {
            String op = operationStack.pollLast();
            if(op.equals("+")) {
                numberStack.addLast((Double.valueOf(numberStack.pollLast()) + Double.valueOf(numberStack.pollLast()) + ""));
            } else numberStack.addLast((Double.valueOf(numberStack.pollLast()) - Double.valueOf(numberStack.pollLast()) + ""));
        }

        return Double.valueOf(numberStack.pop());
    }
}