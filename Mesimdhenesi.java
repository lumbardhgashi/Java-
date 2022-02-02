/*1.	Krijoni klas�n Mesimdhenesi q� ka tri atribute:  
emri [readonly], vitiLindjes si dhe angazhimi (p.sh. Profesor, Asistent, etj.)
1.1.	Ofroni konstruktorin q� pranon q� t� tri parametrat, ku inicializohen t� gjitha atributet. 
1.2.	Ofroni metodat get dhe set p�r ato atribute q� ju e shihni t� nevojshme  
1.3.	Ofroni metod�n q� reprezenton n� String nj� objekt t� klas�s Mesimdhenesi n� formatin: 
emri : vitiLindjes - angazhimi
1.4.	Ofroni metod�n p�r krahasimin e dy objekteve Mesimdhenesi p�r barazi. 
Vini re: Dy m�simdh�n�s jan� t� nj�jt� n�se kan� emrin dhe vitin e lindjes t� nj�jt�.
1.5.	Ofroni metod�n main dhe krijoni 3 instanca t� e klas�s Mesimdhenesi 
1.6.	T� thirren metodat e secil�s instanc� t� krijuar (get, set, toString dhe equals).*/

public class Mesimdhenesi {

	private String emri;
	private int vitiLindjes;
	private String angazhimi;
	
	public Mesimdhenesi(String e, int vl, String a) {
		emri=e;
		vitiLindjes=vl;
		angazhimi=a;
	}
	
	public String getEmri() {
		return emri;
	}
	public int getVitiLindjes() {
		return vitiLindjes;
	}
	public String getAngazhimi() {
		return angazhimi;
	}
	public void setVitiLindjes(int viti) {
		vitiLindjes=viti;
	}
	public void setAngazhimi(String ang) {
		angazhimi=ang;
	}
	public String output() {
		return emri + " : " + vitiLindjes + " - " + angazhimi;	
	}
	public boolean krahasimi(Object obj) {
		if(obj instanceof Mesimdhenesi){
			Mesimdhenesi krahasues = (Mesimdhenesi) obj;
		
		if(emri.equals(krahasues.getEmri()) &&
			vitiLindjes == krahasues.getVitiLindjes()){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Mesimdhenesi m1 = new Mesimdhenesi("Blerim",2002,"Legjend");
		Mesimdhenesi m2 = new Mesimdhenesi("Toxicity",2012,"Profesor");
		Mesimdhenesi m3 = new Mesimdhenesi("Banana",1987,"Asistent");
		Mesimdhenesi m4 = new Mesimdhenesi("Blerim",2002,"Legjend");
		
		System.out.println("Thirja e metodave per m1");
		System.out.println("Emri : " + m1.getEmri());
		System.out.println("Viti : " + m1.getVitiLindjes());
		System.out.println("Angazhimi : " + m1.getAngazhimi());
		
		System.out.println("=================================");

		System.out.println("Thirja e metodave per m2");
		System.out.println("Emri : " + m2.getEmri());
		System.out.println("Viti : " + m2.getVitiLindjes());
		System.out.println("Angazhimi : " + m2.getAngazhimi());
		
		System.out.println("=================================");

		System.out.println("Thirja e metodave per m3");
		System.out.println("Emri : " + m3.getEmri());
		System.out.println("Viti : " + m3.getVitiLindjes());
		System.out.println("Angazhimi : " + m3.getAngazhimi());
		
		System.out.println("=================================");

		System.out.println("Outputi");
		System.out.println(m1.output());
		System.out.println(m2.output());
		System.out.println(m3.output());
		
		System.out.println("=================================");
		System.out.println("Krahasimi i vleres m1 dhe m4");
		
		System.out.println(m1.krahasimi(m4));
		
		System.out.println("=================================");
		System.out.println("Ndryshimi i vleres se m1");
		m1.setVitiLindjes(2020);
		System.out.println(m1.output());
		System.out.println(m1.krahasimi(m4));
	}

}
