import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0;  i < num; i++) {
            for (int j = 0; j < num - i -1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (num - i - 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
