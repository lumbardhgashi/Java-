/*2.	Krijoni klasën Libri që ka tri atribute:  
isbn [readonly], titulli  dhe numriFaqeve
2.1.	Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet. 
2.2.	Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme  
2.3.	Ofroni metodën që reprezenton në String një objekt të klasës Libri në formatin: 
isbn : titulli - numriFaqeve
2.4.	Ofroni metodën për krahasimin e dy objekteve Libri për barazi. 
Vini re: Dy libra janë të njejtë nëse kanë isbn të njejtë.
2.5.	Ofroni metodën main dhe krijoni 3 instanca të e klasës Libri
2.6.	Të thirren metodat e secilës instancë të krijuar (get, set, toString dhe equals).
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
