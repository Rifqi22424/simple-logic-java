import java.util.Scanner;

public class FractionMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 0;

        System.out.println("Program menghitung pecahan");
        System.out.print("Masukan harga: ");

        harga = sc.nextInt();
        
            int banyak100 = harga / 100_000;
            harga %= 100_000;
            if (banyak100 > 0) {
                System.out.println(banyak100 + " lembar 100 ribuan");
            }
         
        
            int banyak50 = harga / 50_000;
            harga %= 50_000;
            if (banyak50 > 0) {
                System.out.println(banyak50 + " lembar 50 ribuan");
            }
         
        
            int banyak20 = harga / 20_000;
            harga %= 20_000;
            if (banyak20 > 0) {
                System.out.println(banyak20 + " lembar 20 ribuan");
            }
         
        
            int banyak10 = harga / 10_000;
            harga %= 10_000;
            if (banyak10 > 0) {
                System.out.println(banyak10 + " lembar 10 ribuan");
            }
        
        
            int banyak5 = harga / 5_000;
            harga %= 5_000;
            if (banyak5 > 0) {
                System.out.println(banyak5 + " lembar 5 ribuan");
            }
        
        
            int banyak2 = harga / 2_000;
            harga %= 2_000;
            if (banyak2 > 0) {
                System.out.println(banyak2 + " lembar 2 ribuan");
            }
        
        
            int banyak1 = harga / 1_000;
            harga %= 1_000;
            if (banyak1 > 0) {
                System.out.println(banyak1 + " lembar 1 ribuan");
            }
        
        
            int banyak500perak = harga / 500;
            harga %= 500;
            if (banyak500perak > 0) {
                System.out.println(banyak500perak + " keping 500 perak");
            }
        
        
            int banyak200perak = harga / 200;
            harga %= 200;
            if (banyak200perak > 0) {
                System.out.println(banyak200perak + " keping 200 perak");
            }
        
        
            int banyak100perak = harga / 100;
            harga %= 100;
            if (banyak100perak > 0) {
                System.out.println(banyak100perak + " keping 100 perak");
            }
        

        sc.close();
    }
}
