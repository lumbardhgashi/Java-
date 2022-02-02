/*
8.	Shkruani klasën Ushtrimi8 që kryen këtë funksion:
Kërkon nga shfrytëzuesi të shtyp vlera String. Vlera SENTINEL, STOP e përfundon loop dhe
 nuk përfshihet në kalkulim.
Të numërohen dhe paraqiten në konzolë sa fjali të shtypura përmbajnë fjalën SHKI (case sensitive)
Për të testuar nëse stringu përmbanë fjalën SHKI, përdorni metodën contains të klasës String
Përshkrimi i metodës contains(String str) të klasës java.lang.String:
public boolean contains(String str), kthen true (e saktë) nëse fjala të cilës i thirret
 metoda përmban Stringun str, në të kundërtën kthen false (e pasaktë)

 */
import java.util.Scanner;
public class Ushtrimi8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String SENTINEL = "STOP";
        int count = -1 ;
        int kushti= 0;
        String fjalia ;

        do {
            System.out.print("Shkruani nje fjali , me STOP e perfunfoni loop-en => ");
            fjalia= scan.nextLine();
            count++;
            if (fjalia.contains("SHKI")){
                kushti++;
            }
        }
        while (!fjalia.equals(SENTINEL));
        System.out.println("Ju keni shtypur => " +count+ " fjali dhe => " +kushti+ " prej tyre e permbajn \"SHKI\" ");

    }
}
