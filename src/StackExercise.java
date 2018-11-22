import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class StackExercise {
    public static void main(String[] args) throws NumberFormatException, IOException {
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

    public static void Editor() throws NumberFormatException, IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String givenString = sc.next();
        String givenString = br.readLine();
        Stack<Character> rightStack = new Stack<>();
        Stack<Character> leftStack = new Stack<>();
//
//
        for (int i = 0; i < givenString.length(); i++) {
            leftStack.push(givenString.charAt(i));
        }

//        int iteration = sc.nextInt();
        int iteration = Integer.parseInt(br.readLine());

        while (iteration-- > 0) {
            String[] line = br.readLine().split(" ");
//            String cmd = sc.next();
            String cmd = line[0];
            if (cmd.equals("L")) {
                if (!leftStack.empty()) {
                    rightStack.push(leftStack.pop());

                }
            } else if (cmd.equals("D")) {
                if (!rightStack.empty()) {
                    leftStack.push(rightStack.pop());

                }
            } else if (cmd.equals("B")) {
                if (!leftStack.empty()) {
                    leftStack.pop();
                }
            } else if (cmd.equals("P")) {
                char input = line[1].charAt(0);
                leftStack.push(input);
            }

        }

        while (!leftStack.empty()) {
            rightStack.push(leftStack.pop());
        }

        StringBuffer answer = new StringBuffer();

        while (!rightStack.empty()) {
            answer.append(rightStack.pop());
        }

        System.out.println(answer);
    }
}



