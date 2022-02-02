package Ushtrimi4;

public class Punetori {
	public String emri;
	public int mosha;
	public String departamenti;
	
	public Punetori(String e, int m, String d) {
		emri=e;
		mosha=m;
		departamenti=d;
	}
	public String getEmri() {
		return emri;
	}
	public int getMosha() {
		return mosha;
	}
	public String getDepartamenti() {
		return departamenti;
	}
	public void setMosha(int m) {
		mosha=m;
		}
	public void setDepartamenti(String d) {
		departamenti=d;
	}
	
	public String output() {
		return emri + " : " + mosha + " - " + departamenti;
	}
	public boolean krahasimi(Object obj) {
		if(obj instanceof Punetori) {
			Punetori krahasues= (Punetori) obj;
			
			if(emri.equals(krahasues.getEmri()) && mosha==krahasues.getMosha()) {
				return true;
			}
			
			
		}
		
		return false;
	}
	
	
	
}
