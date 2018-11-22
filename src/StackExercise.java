import java.util.Scanner;
import java.util.Stack;

public class StackExercise {
    public static void main(String[] args) {
//        ValidParethesisString();
        LaserPipe();
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


}



