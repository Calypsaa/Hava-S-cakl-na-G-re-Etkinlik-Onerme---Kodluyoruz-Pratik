
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz : ");
        heat = scanner.nextInt();

        if (heat < 5) {
            System.out.println("Kayağa gidebilirsiniz.");
        }
        if (heat > 5 && heat <= 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (heat > 10 && heat <= 15) {
            System.out.println("Sinema ve kayağa gidebilirsiniz.");
        }
        if (heat > 15 && heat <= 25) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
