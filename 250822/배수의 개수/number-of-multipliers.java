import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt3 = 0;
        int cnt5 = 0;
        for(int i = 0; i < 10; i++) {
            int temp = sc.nextInt();
            if(temp%3==0) {
                cnt3++;
            }
            if(temp%5==0) {
                cnt5++;
            }
        }
        System.out.println(cnt3 + " " + cnt5);
    }
}