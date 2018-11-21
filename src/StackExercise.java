import java.util.Scanner;
public class StackExercise {
    public static void main(String[] args) {
        ValidParethesisString();
    }


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
}



