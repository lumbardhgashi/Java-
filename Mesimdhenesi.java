/*1.	Krijoni klasën Mesimdhenesi që ka tri atribute:  
emri [readonly], vitiLindjes si dhe angazhimi (p.sh. Profesor, Asistent, etj.)
1.1.	Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet. 
1.2.	Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme  
1.3.	Ofroni metodën që reprezenton në String një objekt të klasës Mesimdhenesi në formatin: 
emri : vitiLindjes - angazhimi
1.4.	Ofroni metodën për krahasimin e dy objekteve Mesimdhenesi për barazi. 
Vini re: Dy mësimdhënës janë të njëjtë nëse kanë emrin dhe vitin e lindjes të njëjtë.
1.5.	Ofroni metodën main dhe krijoni 3 instanca të e klasës Mesimdhenesi 
1.6.	Të thirren metodat e secilës instancë të krijuar (get, set, toString dhe equals).*/

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
