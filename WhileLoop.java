import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int SENTINEL = 5 ;    // int i ka 32 bit
        System.out.print("Shtypni nje numer jo 5 :");

        int a = scan.nextInt();
        // kur kushti behet false del nga loop (perderisa esht true hin ne body te while dhe ekzekuto kodin)
        while (a > SENTINEL){
            System.out.print("Shtypni nje Tjeter o jaran merr vesh 5 :");
            a = scan.nextInt();
        }



    }


}
