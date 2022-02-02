import java.util.Scanner;
public class Ushtrimi1 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	     System.out.println("Shkruani nje numer se paku 10");
	     int numri = scan.nextInt();

	     while(numri<10) {
	     System.out.println("Shkruani nje numer se paku 10");
	     numri = scan.nextInt();
	     }
	     String [] fjalia = new String[numri];
	     scan.nextLine();

	     for(int i=0;i<numri;i++) {
	         System.out.println("Shkruani numra:");
	         fjalia[i]=scan.nextLine();
	     }
	     
	     double mesatarja = gamingAvg(fjalia);
	     
	     System.out.println("Jane shtypur gjithsej : " + fjalia.length 
	    + " fjale / fjali " + " dhe gjatesia mesatare e atyre " +
	    "qe permbanin \"gaming\" eshte  " + mesatarja);
		
	     scan.close();
	}
	public static double gamingAvg(String[] fjalia) {
		int count = 0;
		double gjatesia = 0;
		for(int i = 0; i < fjalia.length; i++){
			if(fjalia[i].toLowerCase().contains("gaming")){
				gjatesia += fjalia[i].length();
				count++;
			}
		}

		if(count == 0){
			return 0;
		}
		else{
			
			return gjatesia / count;
		}
	}

}
