package Ushtrimi4;



public class Kompania {

	public String emri;
	public Punetori[] puntoret;
	public int index=0;
	public Kompania(String e,int gjatesia) {
		emri=e;
		puntoret=new Punetori[gjatesia];
	}
	
	public boolean ekziston(Punetori pu){
        for(int i = 0; i < index; i++){
            if(puntoret[i].krahasimi(pu)){
                return true;
            }
        }
        return false;
    }
	
	public void shtoPunetorin(Punetori pu){
        if(pu == null){
            System.out.println("Objekti eshte null");
            return;
        }
        if(index >= puntoret.length){
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }
        if(ekziston(pu)){
            System.out.println("Objekti ekziston");
            return;
        }
        puntoret[index++] = pu;
    }
	
	 public Punetori[] shtypDepartamentin(String a){
	        int countDepartamenti = 0;
	        for(int i = 0; i < index; i++){
	            if(puntoret[i].getDepartamenti().equals(a)){
	                countDepartamenti++;
	            }
	        }
	        if(countDepartamenti == 0){
	            return null;
	        }
	        
	        Punetori[] temporaryVarg = new Punetori[countDepartamenti];
	        int temp = 0;
	        for(int i = 0; i < index; i++){
	            if(puntoret[i].getDepartamenti().equals(a)){
	                temporaryVarg[temp++] = puntoret[i];
	            }
	        }
	        
	        return temporaryVarg;
	    }
	 
	 public Punetori[] kthePunetoret(Punetori[] pu){
		 if(index<2) {
			 return null;
		 }
		 Punetori[] temporaryVarg=new Punetori[2];
		 for(int i = 0; i < index; i++){
	            if(temporaryVarg[0]==null||pu[i].getMosha() < temporaryVarg[0].getMosha()){
	                temporaryVarg[0] = pu[i];
	            }
	            if(temporaryVarg[1]==null||pu[i].getMosha() > temporaryVarg[1].getMosha()){
	                temporaryVarg[1] = pu[i];
	            }
	        }
			 
			 return temporaryVarg;
	 }
	
	
	
	
	
	public static void main(String[] args) {

		Kompania KompaniaX = new Kompania("Shutter island",20);
		Punetori p1= new Punetori("Dion Osmani",18,"Zdrukthtari");
		Punetori p2= new Punetori("Toxicity",23,"Mekatronik");
		Punetori p3= new Punetori("Kompir",47,"Mekanik");
		Punetori p4= new Punetori("Filan Fisteku",32,"Burimet Njerëzore");


		KompaniaX.shtoPunetorin(p1);
		KompaniaX.shtoPunetorin(p2);
		KompaniaX.shtoPunetorin(p3);
		KompaniaX.shtoPunetorin(p4);

	    System.out.println("==================");
	     
	    Punetori[] v = KompaniaX.shtypDepartamentin("Burimet Njerëzore");
        for(int i = 0; i < v.length;i++){
            System.out.println(v[i].output());
        }
	     
	    System.out.println("==================");

	    Punetori[] b = KompaniaX.kthePunetoret(KompaniaX.puntoret);
        for(int i = 0; i < b.length;i++){
            System.out.println(b[i].output());
        }
	}

}
