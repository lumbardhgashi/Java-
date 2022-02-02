/*2.	Krijoni klas�n Libri q� ka tri atribute:  
isbn [readonly], titulli  dhe numriFaqeve
2.1.	Ofroni konstruktorin q� pranon q� t� tri parametrat, ku inicializohen t� gjitha atributet. 
2.2.	Ofroni metodat get dhe set p�r ato atribute q� ju e shihni t� nevojshme  
2.3.	Ofroni metod�n q� reprezenton n� String nj� objekt t� klas�s Libri n� formatin: 
isbn : titulli - numriFaqeve
2.4.	Ofroni metod�n p�r krahasimin e dy objekteve Libri p�r barazi. 
Vini re: Dy libra jan� t� njejt� n�se kan� isbn t� njejt�.
2.5.	Ofroni metod�n main dhe krijoni 3 instanca t� e klas�s Libri
2.6.	T� thirren metodat e secil�s instanc� t� krijuar (get, set, toString dhe equals).
*/

public class Libri {

	private int isbn;
	private String titulli;
	private int numriFaqeve;
	
	
	public Libri(int isbn,String titulli,int nf) {
		this.isbn=isbn;
		this.titulli=titulli;
		numriFaqeve=nf;
	}
	public int getIsbn() {
		return isbn;
	}
	public String getTitulli() {
		return titulli;
	}
	public int getNumriFaqeve() {
		return numriFaqeve;
	}
	public void setTitulli(String t) {
		titulli=t;
	}
	public void setNumriFaqeve(int nf) {
		numriFaqeve=nf;
	}
	public String output() {
		return isbn + " : " + titulli + " - " + numriFaqeve;
	}
	
	public boolean krahasimi(Object obj) {
		if(obj instanceof Libri) {
			Libri krahasues = (Libri) obj;
			
			if(isbn==krahasues.getIsbn()) {
				return true;
			}
			
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libri l1= new Libri(102314,"Potato land",63);
		Libri l2= new Libri(51231,"Tomato land",158);
		Libri l3= new Libri(102314,"Cancerous land",280);
		
		System.out.println("Thirrja e metodave per l1:");
		System.out.println("Isbn: "+l1.getIsbn());
		System.out.println("Titulli: "+l1.getTitulli());
		System.out.println("Faqet: "+l1.getNumriFaqeve());
		System.out.println("==================================");
		
		
		System.out.println("Thirrja e metodave per l2:");
		System.out.println("Isbn: "+l2.getIsbn());
		System.out.println("Titulli: "+l2.getTitulli());
		System.out.println("Faqet: "+l2.getNumriFaqeve());
		System.out.println("==================================");
		
		
		System.out.println("Thirrja e metodave per l3:");
		System.out.println("Isbn: "+l3.getIsbn());
		System.out.println("Titulli: "+l3.getTitulli());
		System.out.println("Faqet: "+l3.getNumriFaqeve());
		System.out.println("==================================");
		
		System.out.println("Outputi:");
		System.out.println(l1.output());
		System.out.println(l2.output());
		System.out.println(l3.output());
		System.out.println("==================================");

		System.out.println("Krahasimi mes l1 dhe l3:");
		System.out.println(l1.krahasimi(l3));
		System.out.println("==================================");
		
		System.out.println("Ndryshimi i vleres l1:");
		l1.setTitulli("Blerimi Land");
		l1.setNumriFaqeve(23);
		System.out.println(l1.output());
		System.out.println("==================================");

	}

}
