import java.util.Scanner;

public class gradeConvertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        String grade = "";

        System.out.println("Program konversi nilai angka ke abjad");
        System.out.print("Masukan nilai: ");

        nilai = sc.nextInt();

        if (nilai > 85) {
            grade = "A";
        } else if (nilai > 75) {
            grade = "B";
        } else if (nilai > 65) {
            grade = "C";
        } else if (nilai > 55) {
            grade = "D";
        }

        System.out.println(nilai + " termasuk grade " + grade);
        sc.close();
    }
}
