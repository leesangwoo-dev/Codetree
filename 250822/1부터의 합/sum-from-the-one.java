import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < 101; i++) {
            sum += i;
            if(sum >= N) {
                System.out.println(i);
                break;
            }
        }
    }
}