import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] words = {"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;
        char ch = sc.next().charAt(0);
        for(int i = 0; i < 5; i++) {
            for(int j = 2; j < 4; j++) {
                if(words[i].charAt(j) == ch) {
                    System.out.println(words[i]);
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}