import java.util.Scanner;
public class Ushtrimi4 {

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
	    
	    int kushti = numeroSimbolet(fjalia);

	    System.out.println("Jane shtypur gjithsej " + numri +" fjale/fjali dhe " + kushti + " plotesojne kushtin");
	    scan.close();
		
	}
	public static int numeroSimbolet(String[] fjalia) {
		int kushti=0;
		for(int i=0; i<fjalia.length;i++) {
			if(fjalia[i].length()>=6 && fjalia[i].length()<=15 && !fjalia[i].contains("+") && !fjalia[i].contains("-") && !fjalia[i].contains("*") && !fjalia[i].contains("/") && !fjalia[i].contains("%")) {
				kushti++;
			}
		}
		return kushti;
	}
}
