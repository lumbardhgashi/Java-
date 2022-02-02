/*
6.	Shkruani klasën Ushtrimi6 që kryen këtë funksion:
Kërkon nga shfrytëzuesi të shtyp vlera String. Vlera SENTINEL, FUND e
përfundon loop dhe nuk përfshihet në kalkulim.
Të numërohen dhe paraqiten në konzolë sa fjali janë shtypur

 */
import java.util.Scanner;
public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String SENTINEL="FUND";
        String fjalia ;
        int count = -1 ;

        do {
            System.out.print("Shkruani nje fjali , me FUND e pefundon loop-en => ");
            fjalia = scan.nextLine();
            count++;
        }
        while (!fjalia.equals(SENTINEL));
        System.out.println("Ju keni shenuar gjithsej => " +count+ " fjali ");
    }
}
