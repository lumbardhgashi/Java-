import java.util.Scanner;
/*
1) Shkruani kodin e programit CilesiaEAjrit i cili e zgjidh problemin më poshtë:
Deklaroni një variabël të tipit numër i plotë 32 bit ku do te ruani vlerën e Indeksit të Cilësisë së Ajrit (ICA):
   Nëse vlera e indeksit është dhënë më e vogël se 0 shfaqni rezultatin:
Vlera e indeksit eshte dhene gabim!

   Nëse vlera e indeksit është dhënë në mes 0 – 49 shfaqni rezultatin:
Indeksi i ulet.
Mund te vazhdoni me aktivitetet tuaja te zakonshme ne natyre.

   Nëse vlera e indeksit është dhënë në mes të 50 – 74  shfaqni rezultatin:
Indeksi i moderuar.
Reduktoni aktivitetet jashtme nese jeni duke perjetuar ndonje simptome.

   Nëse vlera e indeksit është dhënë në mes të 75 – 100 shfaqni rezultatin:
Indeksi i larte.
Reduktoni aktivitetet e jashtme.
Femijet dhe gjithashtu te moshuarit duhet te kene kujdes.

   Nëse vlera e indeksit është dhënë mbi 100 shfaqni rezultatin:
Indeksi shume i larte.
Shmangini aktivitetet e jashtme.
Femijet dhe gjithashtu te moshuarit duhet te shmangin aktivitetet e jashtme.
 */
/*
byte 8 bit - numer t plot
short 16 bit - numer t plot
int 32 bit - numer t plot
float 32 bit - presje
char 32 bit - karaktere
double 64 bit - presje
long 64 bit - numra te plot
 */
public class CilesiaEAjrit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Shenoni vleren  e indexi-t te cilesis se ajrit : ");
        int ICA = scan.nextInt();

        if (ICA < 0 ){
            System.out.println("Vlera e indeksit eshte dhene gabim!");
        }
        if (ICA > 0 && ICA <= 49 ){
            System.out.println("Indexi i Ulet i ajrit");
            System.out.println("Mund te vazhdoni me aktivitetet tuaja te zakonshme ne natyre.");
        }
        if (ICA >= 50 && ICA <= 74) {
            System.out.println("Indeksi i moderuar.\n" +
                    "Reduktoni aktivitetet jashtme nese jeni duke perjetuar ndonje simptome.");
        }
        if (ICA >= 75 && ICA <= 100){
            System.out.println("Indeksi i larte.\n" +
                    "Reduktoni aktivitetet e jashtme.\n" +
                    "Femijet dhe gjithashtu te moshuarit duhet te kene kujdes.");
        }
        if (ICA >100){
            System.out.println("Indeksi shume i larte.\n" +
                    "Shmangini aktivitetet e jashtme.\n" +
                    "Femijet dhe gjithashtu te moshuarit duhet te shmangin aktivitetet e jashtme.");
        }
    }
}
