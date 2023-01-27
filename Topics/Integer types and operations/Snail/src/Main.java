import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int H = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((H - B - 1) / (A - B) + 1);
    }
}