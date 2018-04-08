import java.util.Random;
public class Test{

public static void main(String[] args) {
	
	//stworzenie obiektow poszczegolnych klas za pomoca konstruktorów z parametrami
    Walec walec1 = new Walec(50,12);
    Kula kula1 = new Kula(70,15);
    Pret pret1 = new Pret(30,50);
    
    //Wyswietlenie powyzszych obiektow
    walec1.Opis();
    kula1.Opis();
    pret1.Opis();
    
    Random r = new Random(); 
    
    //stworzenie tablicy roznych klas pochodnych z losowami wartosciami parametrów konstruktora
    PktMat tab[] = new PktMat[3];
    tab[0]=new Walec(r.nextInt(100)+1,r.nextInt(100)+1);
    tab[1]=new Kula(r.nextInt(100)+1,r.nextInt(100)+1);
    tab[2]=new Pret(r.nextInt(100)+1,r.nextInt(100)+1);
    
    //wypisanie elementow tablicy + moment bezwladnosci wzgledem nowej osi
    System.out.println("Elementy tablicy: ");
    for(int i=0;i<3;i++){ 
    	tab[i].Steiner(5);
    	tab[i].Opis();      
    	}  
    }
}
