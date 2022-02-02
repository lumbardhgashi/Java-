/*
3.Shkruani klasën Ushtrimi3 që kryen këtë funksion:
Udhëzon shfrytëzuesin të shtyp numra të plotë dhe informoni se numri -3333 (SENTINEL)
e terminon loop dhe nuk përfshihet në kalkulim
Në fund të shtypet (afishohet) se sa numra janë shtypur gjithsej dhe sa nga këta numra ishin çift
 */

import java.util.Scanner;
public class Ushtrimi3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nr ;
        int count= -1;
        int cift = 0 ;
        final int SENTINEL = -3333;

        do {
            System.out.print("Shtypni nje numer te plote , me -3333 e perfundon loop-en => ");
            nr = scan.nextInt();
            count++;
            if (nr % 2 == 0){
                cift++;
            }
        }
        while (nr != SENTINEL );

        System.out.println("Ju keni shtypur gjithsej => " +count+ " numra dhe => " +cift+ " prej tyre jan CIFT");
    }
}
