import java.util.Scanner;
public class Ushtrimi3 {

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        System.out.println("Shkruani nje numer se paku 10");
        int numri = scan.nextInt();

        do {
	    	if(numri<10) {
	    		System.out.println("Shkruani nje numer se paku 10");
	    	    numri = scan.nextInt();
	    	}
	    }
	    while(numri<10);
        String [] fjalia = new String[numri];
        scan.nextLine();

        for(int i=0;i<numri;i++) {
            System.out.println("Shkruani fjali:");
            fjalia[i]=scan.nextLine();

        }
        int kushti = numeroZanoret(fjalia);

        System.out.println("Jane shtypur gjithsej " + numri +" fjale/fjali dhe " + kushti + " prej tyre kishin me shume se 5 zanore");

        scan.close();
    }

    public static int numeroZanoret(String[] fjalia) {
        int count = 0;
        int kushti =0;
        for(int i=0; i <fjalia.length;i++) {
            for(int j=0;j<fjalia[i].length();j++) {
                if("aeiouy".indexOf(fjalia[i].toLowerCase().charAt(j))!=-1) {
                    count++;
                }

            }
            if(count>=5) {
                kushti++;
            }
        count=0;
        }
        return kushti;

    }

}