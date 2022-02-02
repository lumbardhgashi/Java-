package Ushtrimi3;


public class Filmi {

	public String emri;
	public int vitiLansimit;
	public Aktori[] Aktoret;
	public static int index=0;
	public Filmi(String e,int vl,int gjatesia) {
		emri=e;
		vitiLansimit=vl;
		Aktoret=new Aktori[gjatesia];
	}
	
	public boolean ekziston(Aktori ak){
        for(int i = 0; i < index; i++){
            if(Aktoret[i].krahasimi(ak)){
                return true;
            }
        }
        return false;
    }
	
	public void shtoAktorin(Aktori ak){
        if(ak == null){
            System.out.println("Objekti eshte null");
            return;
        }
        if(index >= Aktoret.length){
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }
        if(ekziston(ak)){
            System.out.println("Objekti ekziston");
            return;
        }
        Aktoret[index++] = ak;
    }
	
	public Aktori[] shtypAktoret(char a){
        int countGjinia = 0;
        for(int i = 0; i < index; i++){
            if(Aktoret[i].getGjinia() == a){
            	countGjinia++;
            }
        }
        if(countGjinia == 0){
            return null;
        }
        
        Aktori[] temporaryVarg = new Aktori[countGjinia];
        int temp = 0;
        for(int i = 0; i < index; i++){
            if(Aktoret[i].getGjinia() == a){
                temporaryVarg[temp++] = Aktoret[i];
            }
        }
        
        return temporaryVarg;
    }
	
	 public Aktori[] ktheAktoret(Aktori[] ak){
		 if(index<2) {
			 return null;
		 }
		 Aktori[] temporaryVarg=new Aktori[2];
		 for(int i = 0; i < index; i++){
	            if(temporaryVarg[0]==null||ak[i].getVitiLindjes() > temporaryVarg[0].getVitiLindjes()){
	                temporaryVarg[0] = ak[i];
	            }
	            if(temporaryVarg[1]==null||ak[i].getVitiLindjes() < temporaryVarg[1].getVitiLindjes()){
	                temporaryVarg[1] = ak[i];
	            }
	        }
			 
			 return temporaryVarg;
	 }
	
	
	
	
	
	
	public static void main(String[] args) {

		Filmi Shutter = new Filmi("Shutter island",2010, 5);
		Aktori a1= new Aktori("Angelina Jolie",1975,'F');
		Aktori a2= new Aktori("Bruce Willis",1955,'M');
		Aktori a3= new Aktori("Johnny depp",1964,'M');
		Aktori a4= new Aktori("Angelina Jolie",1975,'F');


		Shutter.shtoAktorin(a1);
		Shutter.shtoAktorin(a2);
		Shutter.shtoAktorin(a3);
		Shutter.shtoAktorin(a4);

	    System.out.println("==================");
	     
	    Aktori[] v = Shutter.shtypAktoret('F');
        for(int i = 0; i < v.length;i++){
            System.out.println(v[i].output());
        }
	     
	    System.out.println("==================");

	    Aktori[] b = Shutter.ktheAktoret(Shutter.Aktoret);
        for(int i = 0; i < b.length;i++){
            System.out.println(b[i].output());
        }

	}

}
