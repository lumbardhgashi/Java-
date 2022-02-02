package Ushtrimi1;

/*1.2.	Krijoni klas�n Fakulteti q� ka atributin drejtimi, dhe p�rmban nj�  varg ku do t� ruhen m�simdh�n�sit.
1.2.1.	Ofroni konstruktorin e k�saj klase, i cili pranon drejtimin si dhe numrin e m�simdh�n�sve t� fakultetit.  
1.2.2.	Ofroni metod�n ekziston e cila tregon n�se n� m�simdh�n�s jep m�sim n� fakultet. M�simdh�n�si ti d�rgohet
 metod�s si paramet�r. 
1.2.3.	Ofroni metod�n shtoMesimdhenesin q� e shton nj� m�simdh�n�s n� varg n�se ai ve� se nuk ekziston dhe ka vend
 n� varg. 
1.2.4.	Ofroni metod�n mesimdhenesiMeIRi q� e kthen m�simdh�n�s in m� t� ri n� fakultet. N�se ka shum� se nj� 
m�simdh�n�s m� t� ri me vit t� lindjes t� nj�jt�, t� kthehet m�simdh�n�si i par� q� e plot�son kushtin. 
1.2.5.	Ofroni metod�n ktheAngazhimet q� kthen m�simdh�n�sit q� kan� angazhim t� caktuar. Angazhimi ti d�rgohet 
metod�s si paramet�r. N�se nuk ka asnj� m�simdh�n�s q� ka angazhimin i cili d�rgohet si paramet�r, t� kthehet nj� 
vler� null. 
1.2.6.	Ofroni metod�n main ku do t� krijohet nj� instanc� e klas�s Fakulteti me drejtim �Shkenca Kompjuterike dhe 
Inxhinieri�, me 15 m�simdh�n�s dhe shtoni disa m�simdh�n�s.   
1.2.7.	T� testohen a ekziston m�simdh�n�si �Fistek Filani : 1985 - Asistent�, t� shtypet (afishohet) m�simdh�n�si
 m� i ri dhe t� shtypen (afishohen) m�simdh�n�sit me angazhim �Profesor�
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
