package Ushtrimi6;


public class Skuadra {
	public String emri;
	public Futbollisti[] futbollistet;
	public int index=0;
	
	
	
	
	public Skuadra(String e,int gjatesia) {
		emri=e;
		futbollistet=new Futbollisti[gjatesia];
	}
	
	
	
	
	public boolean ekziston(Futbollisti qy){
        for(int i = 0; i < index; i++){
            if(futbollistet[i].krahasimi(qy)){
                return true;
            }
        }
        return false;
    }
	
	
	
	
	public void shtoFutbollistin(Futbollisti qy){
        if(qy == null){
            System.out.println("Objekti eshte null");
            return;
        }
        if(index >= futbollistet.length){
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }
        if(ekziston(qy)){
            System.out.println("Objekti ekziston");
            return;
        }
        futbollistet[index++] = qy;
    }
	
	
	
	
	 public Futbollisti avgMaxMosha(){
		 if(index<2) {
			 return null;
		 }
		 double Sum=0;
		 double avgMaxMosha;
	        for(int i=0;i<index;i++) {
	        	Sum+=futbollistet[i].getMosha();
	        }  
	     avgMaxMosha=Sum/index;
	     Futbollisti avgMaxFutbollisti=new Futbollisti("","",0);
	     for(int i=0;i<index;i++) {
	        	if(futbollistet[i].getMosha()>=avgMaxMosha) {
	        		avgMaxFutbollisti=futbollistet[i];
	        	}
	        }  
	     System.out.println(Sum);
	     System.out.println(avgMaxMosha);
	     return avgMaxFutbollisti;
	 }
	 
	 
	 
	 public Futbollisti[] kthefutbollistet(String a){
	        int countPozita = 0;
	        for(int i = 0; i < index; i++){
	            if(futbollistet[i].getPozita().equals(a)){
	            	countPozita++;
	            }
	        }
	        if(countPozita == 0){
	            return null;
	        }
	        
	        Futbollisti[] temporaryVarg = new Futbollisti[countPozita];
	        int temp = 0;
	        for(int i = 0; i < index; i++){
	            if(futbollistet[i].getPozita().equals(a)){
	                temporaryVarg[temp++] = futbollistet[i];
	            }
	        }
	        
	        return temporaryVarg;
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	public static void main(String[] args) {

		Skuadra SH = new Skuadra("Shqiperia",16);
		Futbollisti f1= new Futbollisti("Lionel Messi","Forward",33);
		Futbollisti f2= new Futbollisti("Ronaldo de Assis Moreira","Midfielder",41);
		Futbollisti f3= new Futbollisti("Marc-Andre ter Stegen","Portier",29);
		Futbollisti f4= new Futbollisti("Arnau Tenas","Portier",20);
		Futbollisti f5= new Futbollisti("Lionel Messi","Forward",33);
		
		
		SH.shtoFutbollistin(f1);
		SH.shtoFutbollistin(f2);
		SH.shtoFutbollistin(f3);
		SH.shtoFutbollistin(f4);
		SH.shtoFutbollistin(f5);

	    System.out.println("==================");
	     
	    Futbollisti[] v = SH.kthefutbollistet("Portier");
        for(int i = 0; i < v.length;i++){
            System.out.println(v[i].output());
        }
	     
	    System.out.println("==================");

	    Futbollisti b = SH.avgMaxMosha();
            System.out.println(b.output());
        

	}

}
