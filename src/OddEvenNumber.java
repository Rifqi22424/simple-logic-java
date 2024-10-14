import java.util.Scanner;

/**
 * oddEvenNumber
 */
public class OddEvenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        String type;

        System.out.println("Program mengecek number ganjil atau genap");
        System.out.print("Masukan number yang akan dicek: ");

        num = sc.nextInt();

        if (num % 2 == 0) {
            type = "Genap";
        } else {
            type = "Ganjil";
        }

        System.out.println(num + "adalah termasuk bilangan " + type);
        sc.close();
    }
}