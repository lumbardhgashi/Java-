package Ushtrimi2;


public class Biblioteka {

	public String emri;
	public Libri[] Librat;
	public static int index=0;
	public Biblioteka(String e,int gjatesia) {
		emri=e;
		Librat=new Libri[gjatesia];
	}
	
	public boolean ekziston(Libri li){
        for(int i = 0; i < index; i++){
            if(Librat[i].krahasimi(li)){
                return true;
            }
        }
        return false;
    }
	public void shtoLibrin(Libri li){
        if(li == null){
            System.out.println("Objekti eshte null");
            return;
        }
        if(index >= Librat.length){
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }
        if(ekziston(li)){
            System.out.println("Objekti ekziston");
            return;
        }
        Librat[index++] = li;
    }
	
	public Libri titulliliIGjate(){
        Libri iRi = null;
        for(int i = 0; i < index; i++){
            if(iRi == null || Librat[i].getTitulli().length() >= iRi.getTitulli().length()){
            	iRi = Librat[i];
            }
        }
        return iRi;
    }
	
	public String ktheNumratEFaqeve(Libri[] li) {
		int min=0;
		int max=0;
		if(index<2) {
			return null;
		}
		for(int i = 0; i < index; i++){
            if(min==0||Librat[i].getNumriFaqeve()<min){
               min=Librat[i].getNumriFaqeve();
            }
            if(Librat[i].getNumriFaqeve()>max){
                max=Librat[i].getNumriFaqeve();
             }
        }
		
		return "Numri me i vogel i faqeve eshte : "+min+", kurse numri me i madh eshte:"+max;
	}
	
	
	public String ktheLibrat(int x) {
		return Librat[x].output();
	}
	
	public static void main(String[] args) {
		Biblioteka UBT = new Biblioteka("UBT Library", 5);
		Libri l1= new Libri(102314,"Potato land",63);
		Libri l2= new Libri(51231,"Tomato land",158);
		Libri l3= new Libri(102314,"Cancerous land",280);
		Libri l4= new Libri(12345,"lishari",188);
		Libri l5= new Libri(12345,"lishari",188);

		 UBT.shtoLibrin(l1);
		 UBT.shtoLibrin(l2);
	     UBT.shtoLibrin(l3);
	     UBT.shtoLibrin(l4);
	     UBT.shtoLibrin(l5);

	     System.out.println("==================");
	     
	     System.out.println(UBT.ktheNumratEFaqeve(UBT.Librat));
	     
	     System.out.println("==================");

	     System.out.println(UBT.ktheLibrat(0));
	     System.out.println(UBT.ktheLibrat(index-1));

	}

}
