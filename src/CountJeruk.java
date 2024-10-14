import java.util.Scanner;

/**
 * jeruk
 */
public class CountJeruk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total, harga = 0, totalFirst;

        System.out.println();
        System.out.println("Program mencari harga jeruk");
        System.out.print("Masukan total jeruk yang dibeli: ");

        total = sc.nextInt();

        totalFirst = total;

        if (total >= 5) {
            int banyak5 = total / 5;
            harga += banyak5 * 10_000;
            total %= 5;
        }

        if (total >= 2) {
            int banyak2 = total / 2;
            harga += banyak2 * 5_000;
            total %= 2;
        }

        if (total >= 1) {
            int banyak1 = total / 1;
            harga += banyak1 * 3_000;
            total %= 1;
        }

        System.out.print(totalFirst + " jeruk, maka harganya adalah: " + harga);
        System.out.println();
        sc.close();
    }
}