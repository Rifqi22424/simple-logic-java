import java.util.Scanner;

public class CountEgg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilos = 28000;

        System.out.print("Berapa kilo telur? ");
        int manyKilos = scanner.nextInt();
        
        int total = manyKilos * kilos;
        
        System.out.print("Masukan uang bayar: ");
        int money = scanner.nextInt();

        int change = money - total;

        System.out.println("Kembaliannya adalah: " + change);

        scanner.close();
    }
}
