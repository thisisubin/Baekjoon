import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i : a) {
            int result = N * (i);
            System.out.println(N + " * " + (i) + " = " + result);
        }
    }
}