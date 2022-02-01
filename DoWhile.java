import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        do {
            System.out.println("Shtypni nje numer :");
            a = scan.nextInt();
        }while (a > 10); // kur eshte true hin brenda body , me do while se paku niher ka mu ekzekutu

    }
}
