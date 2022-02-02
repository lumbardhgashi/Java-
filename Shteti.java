package Ushtrimi5;


public class Shteti {

	public String emri;
	public Qyteti[] qytetet;
	public int index=0;
	
	public Shteti(String e,int gjatesia) {
		emri=e;
		qytetet=new Qyteti[gjatesia];
	}
	
	public boolean ekziston(Qyteti qy){
        for(int i = 0; i < index; i++){
            if(qytetet[i].krahasimi(qy)){
                return true;
            }
        }
        return false;
    }
	
	public void shtoQytetin(Qyteti qy){
        if(qy == null){
            System.out.println("Objekti eshte null");
            return;
        }
        if(index >= qytetet.length){
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }
        if(ekziston(qy)){
            System.out.println("Objekti ekziston");
            return;
        }
        qytetet[index++] = qy;
    }
	
	 public Qyteti[] shtypQytetet(String a){
	        int countEmri = 0;
	        for(int i = 0; i < index; i++){
	            if(qytetet[i].getEmri().startsWith(a)){
	                countEmri++;
	            }
	        }
	        if(countEmri == 0){
	            return null;
	        }
	        
	        Qyteti[] temporaryVarg = new Qyteti[countEmri];
	        int temp = 0;
	        for(int i = 0; i < index; i++){
	            if(qytetet[i].getEmri().startsWith(a)){
	                temporaryVarg[temp++] = qytetet[i];
	            }
	        }
	        
	        return temporaryVarg;
	    }
	 public Qyteti[] ktheQytetet(int a){
	        int countPopullsia = 0;
	        for(int i = 0; i < index; i++){
	            if(qytetet[i].getPopullsia()>a){
	                countPopullsia++;
	            }
	        }
	        if(countPopullsia == 0){
	            return null;
	        }
	        
	        Qyteti[] temporaryVarg = new Qyteti[countPopullsia];
	        int temp = 0;
	        for(int i = 0; i < index; i++){
	            if(qytetet[i].getPopullsia()>a){
	                temporaryVarg[temp++] = qytetet[i];
	            }
	        }
	        
	        return temporaryVarg;
	    }
	
	

	
	public static void main(String[] args) {
		
		Shteti Ks = new Shteti("Kosova",10);
		Qyteti q1= new Qyteti(10000,"Prishtina",145000);
		Qyteti q2= new Qyteti(30000,"Peja",90000);
		Qyteti q3= new Qyteti(70000,"Ferizaji",108610);
		Qyteti q4= new Qyteti(30000,"Peja",90000);

		Ks.shtoQytetin(q1);
		Ks.shtoQytetin(q2);
		Ks.shtoQytetin(q3);
		Ks.shtoQytetin(q4);

	    System.out.println("==================");
	     
	    Qyteti[] v = Ks.shtypQytetet("P");
        for(int i = 0; i < v.length;i++){
            System.out.println(v[i].output());
        }
	     
	    System.out.println("==================");

	    Qyteti[] b = Ks.ktheQytetet(100000);
        for(int i = 0; i < b.length;i++){
            System.out.println(b[i].output());
        }

	}

}
