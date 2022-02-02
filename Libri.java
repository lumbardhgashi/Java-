package Ushtrimi2;

public class Libri {

	public int isbn;
	public String titulli;
	public int numriFaqeve;
	
	
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
	
}
