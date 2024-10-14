import java.util.Scanner;

public class Treshold {
    public static void main(String[] args) {
        int num;
        String statue;

        Scanner sc = new Scanner(System.in);

        System.out.println("Program menentukan apakah lulus atau tidak");
        System.out.print("Masukan nilai anda: ");
        num = sc.nextInt();

        if (num > 75) {
            statue = "Lulus";
        } else {
            statue = "Tidak lulus";
        }

        System.out.println("Dengan nilai " + num + " maka anda dinyatakan " + statue);
        sc.close();
    }
}
