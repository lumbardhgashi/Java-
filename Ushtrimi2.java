import java.util.Scanner;
public class Ushtrimi2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	    System.out.println("Shkruani nje numer se paku 15");
	    int numri = scan.nextInt();

	    do {
	    	if(numri<10) {
	    		System.out.println("Shkruani nje numer se paku 10");
	    	    numri = scan.nextInt();
	    	}
	    }
	    while(numri<10);
	    short [] vlera = new short[numri];
	    scan.nextLine();

	    for(int i=0;i<numri;i++) {
	        System.out.println("Shkruani numra short:");
	        vlera[i]=scan.nextShort();
	    }
	    double percentage= countShorts(vlera);
		
	    System.out.println("Jane shtypur gjithsej " + numri + " numra dhe " + percentage +"% ishin me te vogel se mesatarja e te gjithe numrave");
	    scan.close();
	}
	
	public static double countShorts(short[] vlera) {
		double mesatarja=0;
		double Sum=0;
		double count=0;
		for(int i=0;i<vlera.length;i++) {
			Sum+=vlera[i];
		}
		mesatarja = Sum/vlera.length;
		for(int i=0;i<vlera.length;i++) {
			if(vlera[i]<mesatarja) {
				count++;
			}
		}
		return (count/vlera.length)*100;
				
	}

}
