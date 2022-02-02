/*3.	Krijoni klasën Aktori që ka tri atribute:  
emri [readonly], vitiLindjes dhe gjinia (M ose F). 
3.1.	Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet. 
3.2.	Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme  
3.3.	Ofroni metodën që reprezenton në String një objekt të klasës Aktori në formatin: 
emri : vitiLindjes - angazhimi
3.4.	Ofroni metodën për krahasimin e dy objekteve Aktori për barazi. 
Vini re: Dy aktorë janë të njëjtë nëse kanë emër dhe vit të lindjes të njëjtë.
3.5.	Ofroni metodën main dhe krijoni 3 instanca të e klasës Aktori
3.6.	Të thirren metodat e secilës instancë të krijuar (get, set, toString dhe equals).
*/
public class Aktori {

	private String emri;
	private int vitiLindjes;
	private char gjinia;
	
	public Aktori(String e, int vl, char g) {
		emri=e;
		vitiLindjes=vl;
		gjinia=g;
	}
	
	public String getEmri() {
		return emri;
	}
	public int getVitiLindjes() {
		return vitiLindjes;
	}
	public char getGjinia() {
		return gjinia;
	}
	public void setVitiLindjes(int vl) {
		vitiLindjes=vl;
		}
	public void setGjinia(char g) {
		gjinia=g;
	}
	public String output() {
		return emri + " : " + vitiLindjes + " - " + gjinia;
	}
	public boolean krahasimi(Object obj) {
		if(obj instanceof Aktori) {
			Aktori krahasues= (Aktori) obj;
			
			if(emri.equals(krahasues.getEmri()) && vitiLindjes==krahasues.getVitiLindjes()) {
				return true;
			}
			
			
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Aktori a1= new Aktori("Johnny depp",1975,'F');
		Aktori a2= new Aktori("Bruce Willis",1955,'M');
		Aktori a3= new Aktori("Johnny depp",1975,'M');

		System.out.println("Thirrja e metodave per a1:");
		System.out.println("Emri: "+a1.getEmri());
		System.out.println("Viti i lindjes: "+a1.getVitiLindjes());
		System.out.println("Gjinia: "+a1.getGjinia());
		System.out.println("==================================");
		
		
		System.out.println("Thirrja e metodave per a2:");
		System.out.println("Emri: "+a2.getEmri());
		System.out.println("Viti i lindjes: "+a2.getVitiLindjes());
		System.out.println("Gjinia: "+a2.getGjinia());
		System.out.println("==================================");
		
		
		System.out.println("Thirrja e metodave per a3:");
		System.out.println("Emri: "+a3.getEmri());
		System.out.println("Viti i lindjes: "+a3.getVitiLindjes());
		System.out.println("Gjinia: "+a3.getGjinia());
		System.out.println("==================================");
		
		System.out.println("Outputi:");
		System.out.println(a1.output());
		System.out.println(a2.output());
		System.out.println(a3.output());
		System.out.println("==================================");

		System.out.println("Krahasimi mes a1 dhe a3:");
		System.out.println(a1.krahasimi(a3));
		System.out.println("==================================");
		
		System.out.println("Ndryshimi i vleres a1:");
		a1.setVitiLindjes(1963);
		a1.setGjinia('M');
		System.out.println(a1.output());
		System.out.println("==================================");

	}

}
