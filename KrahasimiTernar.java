/*
2) Shkruani kodin e programit KrahasimiTernar i cili e zgjidh problemin më poshtë:
Deklaroni dy variabla të tipit numër me presje dhjetore 64 bit, p dhe q, dhe shtypni  maksimumin mes p dhe
q. Nëse p dhe q janë te barabartë te shtypet vlera e q.
Vini re: Të përdoret operatori “ ternar” .

 */
import java.util.Scanner;
public class KrahasimiTernar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hajt shkruj ti 2 numra un a muj me gjet mat madhin");
        System.out.println("Shenoni vlerat per 2 variabla");
        System.out.print("p = ");
        double p = reader.nextDouble();
        System.out.print("q = ");
        double q = reader.nextDouble();


        if (p == q){
            System.out.println("Numrat jan te barabart");
        }
        else {
            System.out.print("Numri me i madhe eshte :");
            System.out.println(Math.max(p,q));
        }
    }
}
