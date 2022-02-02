import java.util.Scanner;
public class Ushtrimi5 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);

	     System.out.println("Shkruani nje numer se paku 15");
	     int numri = scan.nextInt();

	     while(numri<15) {
	     System.out.println("Shkruani nje numer se paku 15");
	     numri = scan.nextInt();
	     }
	     int [] vlera = new int[numri];
	     scan.nextLine();

	     for(int i=0;i<numri;i++) {
	         System.out.println("Shkruani numra te plote:");
	         vlera[i]=scan.nextInt();
	     }
	     
	     int max= maxMesatarja(vlera);
	     
	     System.out.println("Jane shtypur gjithsej " + numri + " numra dhe " + max + " ishte numri me i madh me i madh se mesatarja");
	     scan.close();
	}
	
	public static int maxMesatarja(int[] vlera) {
		double mesatarja=0;
		double Sum=0;
		int max=0;
		for(int i=0;i<vlera.length;i++) {
			Sum+=vlera[i];
		}
		mesatarja = Sum/vlera.length;
		for(int i=0;i<vlera.length;i++) {
			if(vlera[i]>mesatarja && vlera[i]>max) {
				max=vlera[i];
			}
		}
		return max;
				
	}

}
