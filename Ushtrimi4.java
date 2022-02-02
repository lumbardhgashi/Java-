/*
4.	Shkruani klasën Ushtrimi4 që kryen këtë funksion:
Udhëzon shfrytëzuesin të shtyp numra të plotë dhe informoni se numri -7777 (SENTINEL) e
terminon loop dhe nuk përfshihet në kalkulim
Në fund të shtypet (afishohet) se sa numra janë shtypur gjithsej dhe sa nga këta numra
ishin shumëfishi edhe i numrit 4 edhe i numrit 8 (p.sh. numri 64 është një numër i tillë)
 */

import java.util.Scanner;
public class Ushtrimi4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nr ;
        int count= -1;
        int kushti = 0 ;
        final int SENTINEL = -7777;

        do {
            System.out.print("Shtypni nje numer te plote , me -7777 e perfundon loop-en => ");
            nr = scan.nextInt();
            count++;
            if (nr % 4 == 0 && nr % 8 == 0){
                kushti++;
            }
        }
        while (nr != SENTINEL );

        System.out.println("Ju keni shtypur gjithsej => " +count+ " numra dhe => " +kushti+ " prej tyre e kan plotesuar kushtin");
    }
}
