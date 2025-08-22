import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        for(int i = 2; i < 10; i++) {
            int temp = arr[i-2] + arr[i-1];
            temp %= 10;
            arr[i] = temp;
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}