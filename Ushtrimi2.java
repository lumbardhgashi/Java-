/*
2.	Shkruani klasën Ushtrimi2 që kryen këtë funksion:
Udhëzon shfrytëzuesin të shtyp numra të plotë dhe informoni se numri -9999 (SENTINEL) e
terminon loop dhe nuk përfshihet në kalkulim
Në fund të shtypet (afishohet) se sa numra janë shtypur gjithsej dhe sa nga këta numra ishin tek

 */
import java.util.Scanner;
public class Ushtrimi2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nr;
        int count = -1 ;
        int tek = -1;
        final int SENTINEL = -9999 ;

        do {
            System.out.print("Shtypni nje numer te plote , me -9999 e perfundon loop-en =>");
            nr = scan.nextInt();
            count++;
            if (nr % 2 != 0) {
                tek++;
            }

        }
        while (nr != SENTINEL);

        System.out.println("Ju keni shtypur gjithsej => " +count+ " numra dhe => " +tek+ " jan TEK");


    }
}
