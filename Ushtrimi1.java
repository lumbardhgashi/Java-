/*
1.Shkruani klasën Ushtrimi1 që kryen këtë funksion:
Udhëzon shfrytëzuesin të shtyp numra të plotë dhe informoni se numri -5555 (SENTINEL)
e terminon loop dhe nuk përfshihet në kalkulim
Në fund të shtypet (afishohet) se sa numra janë shtypur gjithsej
 */

import java.util.Scanner;
public class Ushtrimi1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nr;
        int count = -1;
        final int SENTINEL = -5555;


        do {
            System.out.print("Shtypni nje numer te plote , me -5555 e perfundon loop-en =>");
            nr = sc.nextInt();
            count++;
        }
        while (nr != SENTINEL);

        System.out.println("Ju keni shtypur gjitsej =>" +count+ " numra");

    }
}