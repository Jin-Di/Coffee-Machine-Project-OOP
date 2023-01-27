import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPairEqual20 = false;
        int[] numb = new int[3];
        for(int i = 0; i < numb.length; i++){
            numb[i] = scanner.nextInt();
        }
        if(numb[0] + numb[1] == 20 || numb[1] + numb[2] == 20 || numb[0] + numb[2] == 20){
            isPairEqual20 = true;
        }
        System.out.print(isPairEqual20);
    }
}