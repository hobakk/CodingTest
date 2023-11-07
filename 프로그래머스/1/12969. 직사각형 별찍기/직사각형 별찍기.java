import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int max = 0;
        max += a < b ? b : a;

        String star = "";
        for (int x=0; x < max; x++) {
            star += "*";
        }

        for (int i=0; i < b; i++) {
            System.out.println(star.substring(0, a));
        }
    }
}