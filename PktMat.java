public class PktMat {
          
          private int masa; //prywatne pole masy
          
          public void setMasa(int m) { //W test nie zwracamy sie bezposrenio do masy tylko za pomoca akcesorów + mamy kontrolewartosci(jesli masa jest ujemna podaje komunikat)
            if(m>0) masa = m;
            else System.out.println("Masa pkt musi być wieksza od 0!");
          }

          public int getMasa() {  
            return masa;
          }


          public PktMat() { //konstruktor domyslny
            masa=5;
          }

          public PktMat(int m) { //konstruktor z parametrem
            setMasa(m);
            getMasa();
          }
          
          public float GlownyMom(){ //Metoda obliczająca i zwracająca główny moment bezwł.
            return 0;
          }

          public float Steiner(float l) { //Metoda przyjmująca jeden parametr, obliczająca moment bezwł. z tw. Steinera
            return GlownyMom()+masa*l*l;
          }

          public void Opis() { //Metoda wyświetlająca opis obiektu
            System.out.println("Punkt materialny");
          }
}
