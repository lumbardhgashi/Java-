/*5.	Krijoni klasën Qyteti që ka tri atribute:  
kodi [readonly], emri  dhe popullsia
5.1.	Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet. 
5.2.	Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme  
5.3.	Ofroni metodën që reprezenton në String një objekt të klasës Qyteti në formatin: 
kodi - emri  : popullsia
5.4.	Ofroni metodën për krahasimin e dy objekteve Qyteti për barazi. 
Vini re: Dy qytete janë të njëjtë nëse e kanë kodin e njëjtë.
5.5.	Ofroni metodën main dhe krijoni 3 instanca të e klasës Qyteti
5.6.	Të thirren metodat e secilës instancë të krijuar (get, set, toString dhe equals).
*/
public class Qyteti {

	private int kodi;
	private String emri;
	private int popullsia;
	
	
	public Qyteti(int k, String e, int p) {
		kodi=k;
		emri=e;
		popullsia=p;
	}
	public int getKodi() {
		return kodi;
	}
	public String getEmri() {
		return emri;
	}
	public int getPopullsia() {
		return popullsia;
	}
	public void setEmri(String e) {
		emri=e;
		}
	public void setPopullsia(int p) {
		popullsia=p;
	}
	public String output() {
		return kodi + " : " + emri + " - " + popullsia;
	}
	public boolean krahasimi(Object obj) {
		if(obj instanceof Qyteti) {
			Qyteti krahasues= (Qyteti) obj;
			
			if(kodi==krahasues.getKodi()) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	public static void main(String[] args) {

		Qyteti q1= new Qyteti(10000,"Prishtina",145000);
		Qyteti q2= new Qyteti(30000,"Peja",60000);
		Qyteti q3= new Qyteti(70000,"Ferizaji",108610);

		System.out.println("Thirrja e metodave per q1:");
		System.out.println("Kodi: "+q1.getKodi());
		System.out.println("Emri: "+q1.getEmri());
		System.out.println("Popullsia: "+q1.getPopullsia());
		System.out.println("==================================");
		
		
		System.out.println("Thirrja e metodave per q2:");
		System.out.println("Kodi: "+q2.getKodi());
		System.out.println("Emri: "+q2.getEmri());
		System.out.println("Popullsia: "+q2.getPopullsia());
		System.out.println("==================================");
		
		
		System.out.println("Thirrja e metodave per q3:");
		System.out.println("Kodi: "+q3.getKodi());
		System.out.println("Emri: "+q3.getEmri());
		System.out.println("Popullsia: "+q3.getPopullsia());
		System.out.println("==================================");
		
		System.out.println("Outputi:");
		System.out.println(q1.output());
		System.out.println(q2.output());
		System.out.println(q3.output());
		System.out.println("==================================");

		System.out.println("Krahasimi mes q1 dhe q3:");
		System.out.println(q1.krahasimi(q3));
		System.out.println("==================================");
		
		System.out.println("Ndryshimi i vleres a1:");
		q1.setEmri("Prishtine");
		q1.setPopullsia(145149);
		System.out.println(q1.output());
		System.out.println("==================================");
		
	}

}
