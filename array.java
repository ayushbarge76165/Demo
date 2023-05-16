import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number of Records:-");
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 7, 8, 9, 1, 4 };
        int c1 = a.length + b.length;

        int c[] = new int[c1];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            c[a.length + j] = b[j];
        }

        System.out.println();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

    }
}
