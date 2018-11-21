import java.util.Scanner;

public class StackExercise {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.size());
        ValidParenthesisString();

    }

    public static void ValidParenthesisString() {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int testCase = sc.nextInt();
        for (int n = 0; n < testCase; n++) {
            String ps = sc.next();
            for (int i = 0; i < ps.length(); i++) {
                if (ps.charAt(i) == '(') {
                    cnt++;
                } else {
                    cnt--;
                    if (cnt < 0) {
                        System.out.println("No");
                    }
                }
            }

            if (cnt == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }




}
//2
//        ()
//        ())