/*
5.	Shkruani klasën Ushtrimi5 që kryen këtë funksion:
Udhëzon shfrytëzuesin të shtyp numra të plotë 32-bit dhe e informon se numri -1111 (SENTINEL)
e terminon loop dhe nuk përfshihet në kalkulim.
Në fund të shtypet (afishohet) se sa numra janë shtypur gjithsej dhe sa nga këta numra ishin tek,
negativ dhe të plotëpjestueshëm me 7 (p.sh. numri -21 është një numër i tillë) :
Jane shtypur gjithsej <x> numra dhe <y> prej tyre e plotesojne kushtin.
Nëse nuk është shtypur asnjë numër tjetër përveq numrit SENTINEL të shtypet (afishohet):
Nuk eshte shtypur asnje numer!

 */
import java.util.Scanner;
public class Ushtrim5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nr ;
        int count= -1;
        int teknegativ = 0 ;
        final int SENTINEL = -1111;

        do {
            System.out.print("Shtypni nje numer te plote , me -7777 e perfundon loop-en => ");
            nr = scan.nextInt();
            count++;
            if (nr % 7 == 0 && nr < 0 && nr % 2 != 0){
                teknegativ++;
            }
        }
        while (nr != SENTINEL );

        System.out.println("Ju keni shtypur gjitsej => " +count+ " numra dhe => " +teknegativ+ " e kan plotesuar kushtin ");
    }
}
