import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var numb = sc.nextLine();
        numb = new StringBuilder(numb).reverse().toString();
        System.out.println(Integer.parseInt(numb));
    }
}