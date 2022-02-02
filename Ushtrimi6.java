import java.util.Scanner;
public class Ushtrimi6 {

	public static void main(String[] args) {
		 Scanner scan= new Scanner (System.in);
		 System.out.println("Shkruani nje numer se paku 5");
		 int numri = scan.nextInt();

		 while(numri<5) {
		     System.out.println("Shkruani nje numer se paku 5");
		     numri = scan.nextInt();
		     }
		 String [] fjalia = new String[numri];
		 scan.nextLine();

		 for(int i=0;i<numri;i++) {
			 System.out.println("Shkruani fjali:");
			 fjalia[i]=scan.nextLine();

		 }
		 double mesatarja = myMethod(fjalia);
		 
		 System.out.println("Jane shtypur gjithsej " + numri +" fjale/fjali dhe " + mesatarja + " eshte mesatarja e fjaleve qe plotesojne kushtin");

		 scan.close();

	}
	
	public static double myMethod(String[] fjalia) {
		int count = 0;
		double gjatesia = 0;
		for(int i = 0; i < fjalia.length; i++){
			if(!fjalia[i].toLowerCase().startsWith("shki") && fjalia[i].contains("ubt")){
				gjatesia += fjalia[i].length();
				count++;
			}
		}
		
			
			return gjatesia / count;
		
		
	}
	
	

}
