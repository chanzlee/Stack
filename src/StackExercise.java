import java.util.Stack;

public class StackExercise {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        // Print
        System.out.println("LIFO");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("Size: "+ stack.size());    // Size

        System.out.println("---------------");

        // Push
        stack.push(5);
        stack.push(4);


        System.out.println(stack.size());    // Size
        System.out.println(stack.peek());    // Top
        System.out.println(stack.size());    // Size Recheck

    }
}
