import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int median = 0;
        if(A > B && A > C) {
            if(B > C) {
                median = B;
            } else {
                median = C;
            }
        } else {
            if(B > C) {
                if(A > C) {
                    median = A;
                } else {
                    median = C;
                }
            } else {
                if(A > B) {
                    median = A;
                } else {
                    median = B;
                }
            }
        }
        System.out.println(median);
    }
}