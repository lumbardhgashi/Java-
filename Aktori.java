package Ushtrimi3;

public class Aktori {
	public String emri;
	public int vitiLindjes;
	public char gjinia;
	
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
}
