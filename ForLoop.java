public class ForLoop {
    public static void main(String[] args) {
        for (int i =0 ; i < 5 ; i++){
            System.out.println("Tigran");
            i++;
        }
        System.out.println("------------------");
        System.out.println("Dul nga loop");
        /*
        a < b => a me e vogel se b
        a >  b => a me e madhe se b
        a == b => a e barabart me b
         */

        /*
        Zgjidhja :
        i=0 , 0 < 5 (true) , tigran i=1 , i=2
        i= 2 , 2 < 5(true) , tigran i=3 , i = 4
        i=4 , 4 < 5(true) , tigran i=5 , i = 6
        i = 6 , 6 < 5(false) kur kushti eshte false del nga for loop
         */


        /*
        1. hapi par :i =0 , hapi dyte : 0 < 5 (true) , hapi tret:shkon e printon (body)tigran , hapi kater : e rrit i per 1
         */

        System.out.println("------------------");

        for (int i=2 ; i < 6 ;i++){
            System.out.println((i-1) + ".tigran");
        }
        /*
        Zgjidhja :
        4 hapa for loop : HAPI 1 . DEKLARIM/INICIALIZIMI I i-se , HAPI 2. KONTROLLIMI KUSHTIT , HAPI 3. EKZEKUTIMI BODY , HAPI 4.i++
        i=2 , 2<6 (true) , 2-1= 1.tigran , i=3;
        i=3 , 3<6(true) , 3 - 1 = 2.tigran , i=4
        i=4 ,4<6(true) , 4 - 1 = 3.tigran , i =5
        i=5, 5<6(true) , 5-1 = 4.tigran , i=6
        i=6 , 6 < 6 (false) del nga loop

         */
        System.out.println("------------------");

        for (int i = 1;  i==4;i--){
            System.out.println("Tigran");

        }
        /*
        i=1  ; 1 < 4 dhe 1 == 4 (false) ,del prej loop
         */
        System.out.println("------------------");

        for (int i = 0 ;i < 5 ;  ){
            System.out.println("Gashi");
        }

        /*
        Zgjidhje :

        i = 0 ; ska kusht ; gashi ; ska kurgjo
        i=0 ; ska kusht ; gashi ; ska kurgjo
        INFINIT LOOP
         */
    }
}
