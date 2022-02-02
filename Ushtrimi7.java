/*
7.	Shkruani klasën Ushtrimi7 që kryen këtë funksion:
Kërkon nga shfrytëzuesi të shtyp vlera String. Vlera SENTINEL, EXIT e përfundon loop dhe
nuk përfshihet në kalkulim.
Të numërohen dhe paraqiten në konzolë sa fjali të shtypura përfundojnë me shkronjën A
 Për të testuar nëse stringu përfundon me A, përdorni metodën endsWith të klasës String
Përshkrimi i metodës endsWith(String str) të klasës java.lang.String:
public boolean endsWith(String str), kthen true (e saktë) nëse fjala të cilës i thirret metoda përfundon me
 Stringun str, në të kundërtën kthen false (e pasaktë)
 */
import java.util.Scanner;
public class Ushtrimi7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fjalia;
        final String SENTINEL = "EXIT";
        int kushti= 0 ;
        int count = -1 ;

        do {
            System.out.print("Shkruani nje fjali , me EXIT perfundoni loop-en => ");
            fjalia = scan.nextLine();
            count++;
            if (fjalia.endsWith("A")) {
                kushti++;
            }

        }
            while (!fjalia.equals(SENTINEL));
            System.out.println("Ju keni shtypur gjithsej => " +count+ " fjali dhe => " +kushti+ " perfundojn me \"A\" ");
    }
}
