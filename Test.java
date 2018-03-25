import java.util.Random;
public class Test{

    public static void main(String[] args) {
      
      PktMat pkt01 = new PktMat(); //nowy obiekt stworzony za pomocą konstruktora domyślnego
      PktMat pkt02 = new PktMat(50); //drugi obiekt klasy stworzony zapomocą konstruktora z parametrem

      pkt01.Opis();
      System.out.println("Masa: "+pkt01.getMasa()+"\nMoment bezwladnosci:"+pkt01.GlownyMom()+"\nWartosc momentu wzgledem nowej osi:"+pkt01.Steiner(2)+"\n\n");

      pkt02.Opis(); //wyświetlenie informacji dla obu obiektów
      System.out.println("Masa: "+pkt02.getMasa()+"\nMoment bezwladnosci:"+pkt02.GlownyMom()+"\nWartosc momentu wzgledem nowej osi:"+pkt02.Steiner(5)+"\n\n");
      
      pkt01.setMasa(75); //zmiana masy pierwszego obiektu za pomocą akcesora

      pkt01.Opis();   //wyświetlenie informacji dla zmienionego obiektu
      System.out.println("Masa: "+pkt01.getMasa()+"\nMoment bezwladnosci:"+pkt01.GlownyMom()+"\nWartosc momentu wzgledem nowej osi:"+pkt01.Steiner(2)+"\n\n\n");

      Random r = new Random();
      
      PktMat tabPkt[]= new PktMat[3];
      
      for(int i=0; i<3; i++) {
        tabPkt[i]=new PktMat(r.nextInt(101)+1);
      }
                                                                  //tablica obiektów z losowymi wartościami masy i wypisanie tablicy wpostaci opisów obiektów
      for (int j=0; j<3; j++) { 
        tabPkt[j].Opis(); 
         System.out.println("Masa: "+tabPkt[j].getMasa()+"\nMoment bezwladnosci: "+tabPkt[j].GlownyMom()+"\nWartosc momentu wzgledem nowej osi:"+tabPkt[j].Steiner(6)+"\n\n");
      }

    }
//tablica obiektów z losowymi wartościami masy i wypisanie tablicy wpostaci opisów obiektów
}
