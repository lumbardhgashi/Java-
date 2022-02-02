/*6.	Krijoni klasën Futbollisti që ka tri atribute:  
emri [readonly], pozita dhe mosha
6.1.	Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet. 
6.2.	Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme  
6.3.	Ofroni metodën që reprezenton në String një objekt të klasës Futbollisti në formatin: 
emri : mosha - pozita
6.4.	Ofroni metodën për krahasimin e dy objekteve Futbollisti për barazi. 
Vini re: Dy futbollistë janë të njëjtë nëse kanë emër, pozite dhe moshe të njëjtë.
6.5.	Ofroni metodën main dhe krijoni 3 instanca të e klasës Futbollisti
6.6.	Të thirren metodat e secilës instancë të krijuar (get, set, toString dhe equals).
*/
public class Futbollisti {

	private String emri;
	private String pozita;
	private int mosha;
	
	public Futbollisti(String e,String p, int m) {
		emri=e;
		pozita=p;
		mosha=m;
	}
	public String getEmri() {
		return emri;
	}
	public String getPozita() {
		return pozita;
	}
	public int getMosha() {
		return mosha;
	}
	public void setPozita(String p) {
		pozita=p;
		}
	public void setMosha(int m) {
		mosha=m;
		}
	
	
	public String output() {
		return emri + " : " + pozita + " - " + mosha;
	}
	public boolean krahasimi(Object obj) {
		if(obj instanceof Futbollisti) {
			Futbollisti krahasues= (Futbollisti) obj;
			
			if(emri.equals(krahasues.getEmri()) && pozita.equals(krahasues.getPozita()) && mosha==krahasues.getMosha()) {
				return true;
			}
			
			
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {

		Futbollisti f1= new Futbollisti("Lionel Messi","Forward",33);
		Futbollisti f2= new Futbollisti("Ronaldo de Assis Moreira","Midfielder",41);
		Futbollisti f3= new Futbollisti("Lionel Messi","Forward",33);

		System.out.println("Thirrja e metodave per f1:");
		System.out.println("Emri: "+f1.getEmri());
		System.out.println("Poziat: "+f1.getPozita());
		System.out.println("Mosha: "+f1.getMosha());
		System.out.println("==================================");
		
		
		System.out.println("Thirrja e metodave per f2:");
		System.out.println("Emri: "+f2.getEmri());
		System.out.println("Pozita: "+f2.getPozita());
		System.out.println("Mosha: "+f2.getMosha());
		System.out.println("==================================");
		
		
		System.out.println("Thirrja e metodave per f3:");
		System.out.println("Emri: "+f3.getEmri());
		System.out.println("Pozita: "+f3.getPozita());
		System.out.println("Mosha: "+f3.getMosha());
		System.out.println("==================================");
		
		System.out.println("Outputi:");
		System.out.println(f1.output());
		System.out.println(f2.output());
		System.out.println(f3.output());
		System.out.println("==================================");

		System.out.println("Krahasimi mes f1 dhe f3:");
		System.out.println(f1.krahasimi(f3));
		System.out.println("==================================");
		
		System.out.println("Ndryshimi i vleres a1:");
		f1.setMosha(19);
		f1.setPozita("Midfielder");
		System.out.println(f1.output());
		System.out.println("==================================");

	}


}
