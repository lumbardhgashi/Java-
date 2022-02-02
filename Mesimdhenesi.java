package Ushtrimi1;

public class Mesimdhenesi {

	public String emri;
	public int vitiLindjes;
	public String angazhimi;
	
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

}
