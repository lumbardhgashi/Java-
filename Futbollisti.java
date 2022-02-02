package Ushtrimi6;

public class Futbollisti {
	public String emri;
	public String pozita;
	public int mosha;
	
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
	
}
