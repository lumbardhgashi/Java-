package Ushtrimi5;

public class Qyteti {

	public int kodi;
	public String emri;
	public int popullsia;
	
	
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
}
