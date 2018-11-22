import java.util.Scanner;
import java.util.Stack;

public class StackExercise {
    public static void main(String[] args) {
//        ValidParethesisString();
//        LaserPipe();
        Editor();
    }

//9012
    public static void ValidParethesisString() {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        for (int n = 0; n < testCase; n++) {
            String ps = sc.next();
            System.out.println(valid(ps));
        }
        sc.close();
    }

    public static String valid (String ps) {
        int cnt = 0;
        for (int i = 0; i < ps.length(); i++) {
            if (ps.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
                if (cnt < 0) {
                    return "NO";
                }
            }
        }
        if (cnt == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    //10799
    public static void LaserPipe () {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        String ps = sc.next();
        for (int i = 0; i < ps.length(); i++) {
            if (ps.charAt(i) == '(') {
                stack.push(i);
            } else {
                if ( i - stack.peek() == 1 ) {
                    stack.pop();
                    answer += stack.size();
                } else {
                    stack.pop();
                    answer ++;
                }

            }
        }

        System.out.println(answer);
    }

    public static void Editor() {
        Scanner sc = new Scanner(System.in);
        String givenString = sc.next();
        Stack<Character> rightStack = new Stack<>();
        Stack<Character> leftStack = new Stack<>();
        String answer = "";
        for (int i = 0; i < givenString.length(); i++) {
            leftStack.push(givenString.charAt(i));
        }
        int iteration = sc.nextInt();

        while (true) {
            iteration--;
            String cmd = sc.next();
            if (cmd.equals("L")) {
                if (!leftStack.empty()) {
                    rightStack.push(leftStack.peek());
                    leftStack.pop();
                }
            } else if (cmd.equals("D")) {
                if (!rightStack.empty()) {
                    leftStack.push(rightStack.peek());
                    rightStack.pop();
                }
            } else if (cmd.equals("B")) {
                if (!leftStack.empty()) {
                    leftStack.pop();
                }
            } else if (cmd.equals("P")) {
                char input = sc.next().charAt(0);
                leftStack.push(input);
            }
            System.out.println(leftStack);
            System.out.println(rightStack);

            if(iteration< 1) {
                break;
            }
        }

        for (int j = 0; !leftStack.empty(); j++) {
            System.out.println(leftStack.peek());
            rightStack.push(leftStack.peek());
            leftStack.pop();
        }


        for (int k = 0; !rightStack.empty(); k++) {
            answer+= rightStack.pop();
        }

        System.out.println(answer);
    }
}



