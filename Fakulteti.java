package Ushtrimi1;

/*1.2.	Krijoni klasën Fakulteti që ka atributin drejtimi, dhe përmban një  varg ku do të ruhen mësimdhënësit.
1.2.1.	Ofroni konstruktorin e kësaj klase, i cili pranon drejtimin si dhe numrin e mësimdhënësve të fakultetit.  
1.2.2.	Ofroni metodën ekziston e cila tregon nëse në mësimdhënës jep mësim në fakultet. Mësimdhënësi ti dërgohet
 metodës si parametër. 
1.2.3.	Ofroni metodën shtoMesimdhenesin që e shton një mësimdhënës në varg nëse ai veç se nuk ekziston dhe ka vend
 në varg. 
1.2.4.	Ofroni metodën mesimdhenesiMeIRi që e kthen mësimdhënës in më të ri në fakultet. Nëse ka shumë se një 
mësimdhënës më të ri me vit të lindjes të njëjtë, të kthehet mësimdhënësi i parë që e plotëson kushtin. 
1.2.5.	Ofroni metodën ktheAngazhimet që kthen mësimdhënësit që kanë angazhim të caktuar. Angazhimi ti dërgohet 
metodës si parametër. Nëse nuk ka asnjë mësimdhënës që ka angazhimin i cili dërgohet si parametër, të kthehet një 
vlerë null. 
1.2.6.	Ofroni metodën main ku do të krijohet një instancë e klasës Fakulteti me drejtim “Shkenca Kompjuterike dhe 
Inxhinieri”, me 15 mësimdhënës dhe shtoni disa mësimdhënës.   
1.2.7.	Të testohen a ekziston mësimdhënësi “Fistek Filani : 1985 - Asistent”, të shtypet (afishohet) mësimdhënësi
 më i ri dhe të shtypen (afishohen) mësimdhënësit me angazhim “Profesor”
*/
public class Fakulteti {

	public String drejtimi;
	public Mesimdhenesi[] mesimdhenesit;
	public int index=0;
	
	
	public Fakulteti(String d,int gjatesia) {
		drejtimi=d;
		mesimdhenesit=new Mesimdhenesi[gjatesia];
	}
	
	public boolean ekziston(Mesimdhenesi me){
        for(int i = 0; i < index; i++){
            if(mesimdhenesit[i].krahasimi(me)){
                return true;
            }
        }
        return false;
    }
	
	public void shtoMesimdhenesin(Mesimdhenesi me){
        if(me == null){
            System.out.println("Objekti eshte null");
            return;
        }
        if(index >= mesimdhenesit.length){
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }
        if(ekziston(me)){
            System.out.println("Objekti ekziston");
            return;
        }
        mesimdhenesit[index++] = me;
    }
	
	 public Mesimdhenesi mesimdhenesiMeIRi(){
	        Mesimdhenesi iRi = null;
	        for(int i = 0; i < index; i++){
	            if(iRi == null || mesimdhenesit[i].getVitiLindjes() > iRi.getVitiLindjes()){
	            	iRi = mesimdhenesit[i];
	            }
	        }
	        return iRi;
	    }
	 
	 public Mesimdhenesi[] ktheAngazhimet(String a){
	        int countAngazhimet = 0;
	        for(int i = 0; i < index; i++){
	            if(mesimdhenesit[i].getAngazhimi().equals(a)){
	                countAngazhimet++;
	            }
	        }
	        if(countAngazhimet == 0){
	            return null;
	        }
	        
	        Mesimdhenesi[] temporaryVarg = new Mesimdhenesi[countAngazhimet];
	        int temp = 0;
	        for(int i = 0; i < index; i++){
	            if(mesimdhenesit[i].getAngazhimi().equals(a)){
	                temporaryVarg[temp++] = mesimdhenesit[i];
	            }
	        }
	        
	        return temporaryVarg;
	    }
	 
	 
	 
	 
	 
	 
	
	public static void main(String[] args) {
		Fakulteti shki = new Fakulteti("Shkenca Kompjuterike 1", 15);
        Mesimdhenesi m1 = new Mesimdhenesi("Altin Murtezaj",2000,"Profesor");
        Mesimdhenesi m2 = new Mesimdhenesi("Leke Kelmendi",2000,"Profesor");
        Mesimdhenesi m3 = new Mesimdhenesi("Avdi Vrellaku",2001,"Asistent");
        Mesimdhenesi m4 = new Mesimdhenesi("Erand Aliu",2001,"Asistent");
        Mesimdhenesi m5 = new Mesimdhenesi("Erand Aliu",2001,"Asistent");
        
        shki.shtoMesimdhenesin(m1);
        shki.shtoMesimdhenesin(m2);
        shki.shtoMesimdhenesin(m3);
        shki.shtoMesimdhenesin(m4);
        shki.shtoMesimdhenesin(m5);
        
        System.out.println("----------------");
        
        System.out.println(shki.mesimdhenesiMeIRi().output());
        
        System.out.println("----------------");
          
        Mesimdhenesi[] v = shki.ktheAngazhimet("Profesor");
        for(int i = 0; i < v.length;i++){
            System.out.println(v[i].output());
        }

	}

}
