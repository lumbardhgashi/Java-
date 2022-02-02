/*4.	Krijoni klasën Punetori që ka tri atribute:  
emri [readonly] , mosha dhe departamenti
4.1.	Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet. 
4.2.	Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme  
4.3.	Ofroni metodën që reprezenton në String një objekt të klasës Punetori në formatin: 
emri - mosha : departamenti
4.4.	Ofroni metodën për krahasimin e dy objekteve Punetori për barazi. 
Vini re: Dy punëtorë janë të njëjtë nëse kanë emrin dhe moshën e njëjtë.
4.5.	Ofroni metodën main dhe krijoni 3 instanca të e klasës Punetori
4.6.	Të thirren metodat e secilës instancë të krijuar (get, set, toString dhe equals).
*/

public class Punetori {

	private String emri;
	private int mosha;
	private String departamenti;
	
	public Punetori(String e, int m, String d) {
		emri=e;
		mosha=m;
		departamenti=d;
	}
	public String getEmri() {
		return emri;
	}
	public int getMosha() {
		return mosha;
	}
	public String getDepartamenti() {
		return departamenti;
	}
	public void setMosha(int m) {
		mosha=m;
		}
	public void setDepartamenti(String d) {
		departamenti=d;
	}
	
	public String output() {
		return emri + " : " + mosha + " - " + departamenti;
	}
	public boolean krahasimi(Object obj) {
		if(obj instanceof Punetori) {
			Punetori krahasues= (Punetori) obj;
			
			if(emri.equals(krahasues.getEmri()) && mosha==krahasues.getMosha()) {
				return true;
			}
			
			
		}
		
		return false;
	}
	
	
	
	
	
	public static void main(String[] args) {

		Punetori p1= new Punetori("Dion Osmani",18,"Zdrukthtari");
		Punetori p2= new Punetori("Toxicity",23,"Mekatronik");
		Punetori p3= new Punetori("Kompir",47,"Mekanik");

		System.out.println("Thirrja e metodave per p1:");
		System.out.println("Emri: "+p1.getEmri());
		System.out.println("Mosha: "+p1.getMosha());
		System.out.println("Departamenti: "+p1.getDepartamenti());
		System.out.println("==================================");
		
		
		System.out.println("Thirrja e metodave per p2:");
		System.out.println("Emri: "+p2.getEmri());
		System.out.println("Mosha: "+p2.getMosha());
		System.out.println("Departamenti: "+p2.getDepartamenti());
		System.out.println("==================================");
		
		
		System.out.println("Thirrja e metodave per p3:");
		System.out.println("Emri: "+p3.getEmri());
		System.out.println("Mosha: "+p3.getMosha());
		System.out.println("Departamenti: "+p3.getDepartamenti());
		System.out.println("==================================");
		
		System.out.println("Outputi:");
		System.out.println(p1.output());
		System.out.println(p2.output());
		System.out.println(p3.output());
		System.out.println("==================================");

		System.out.println("Krahasimi mes p1 dhe p3:");
		System.out.println(p1.krahasimi(p3));
		System.out.println("==================================");
		
		System.out.println("Ndryshimi i vleres a1:");
		p1.setMosha(19);
		p1.setDepartamenti("Ngjyrosje");
		System.out.println(p1.output());
		System.out.println("==================================");

	}

}
