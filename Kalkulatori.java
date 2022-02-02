import java.util.Scanner;

/*
Detyra 2.
Të shkruhet një program në JAVA i cili simulon kalkulatorin që kryen operacionet themelore
aritmetikore: mbledhjen (+), zbritjen (-), shumëzimin (+), dhe pjesëtimin (/). Programi i jep
mundësi përdoruesit të zgjedhë operacionin që dëshiron ta kryejë nga menu-ja. Poashtu programi
duhet të mundësojë përdoruesin të japë vlerat e operandeve si hyrje

 */
public class Kalkulatori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /*
       //ZGJIDHJA ME NUMER :
        System.out.println("Shenoni vlerat ");
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.println("Menu :");
        System.out.println("Per 1 hyn ne mbledhje :");
        System.out.println("Per 2 hyn ne zbritje :");
        System.out.println("Per 3 hyn ne shumzim :");
        System.out.println("Per 4 hyn ne pjestim :");
        System.out.print("Zgjidhni operacionin aritmetikor per kalkulim :");
        byte nrMenu = scan.nextByte();
        if (nrMenu == 1){
            System.out.printf("%d + %d = %d",a,b,(a+b));
        }
        if (nrMenu == 2){
            System.out.printf("%d - %d = %d",a,b,(a-b));
        }
        if (nrMenu == 3){
            System.out.printf("%d * %d = %d",a,b,(a*b));
        }
        if (nrMenu == 4){
            System.out.printf("%d / %d = %d",a,b,(a/b));
        }

        */
//Zgjidhja me String

        System.out.println("Shenoni vlerat ");
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.println("Menu :");
        System.out.println("Shtyp mbledhje per mbledhje:");
        System.out.println("Shtyp zbritje per zbritje:");
        System.out.println("Shtyp shumzim per shumzim :");
        System.out.println("Shtyp pjestim per pjestim :");
        System.out.print("Zgjidhni operacionin aritmetikor per kalkulim :");

        scan.nextLine();

        String menu = scan.nextLine();
        if (menu.equals("mbledhje")){
            System.out.printf("%d + %d = %d",a,b,(a+b));
        }
        if (menu.equals("zbritje")){
            System.out.printf("%d - %d = %d",a,b,(a-b));
        }
        if (menu.equals("shumzim")){
            System.out.printf("%d * %d = %d",a,b,(a*b));
        }
        if (menu.equals("pjestim")){
            System.out.printf("%d / %d = %d",a,b,(a/b));
        }

    }
}
