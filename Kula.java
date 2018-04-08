public class Kula extends PktMat {
    
    //prywatne pole promienia kuli
    private float prKuli;
        
  //konstruktor domyslny
    public Kula(){
        super();
        prKuli=10;    
        }
    
    //setter
    public void setPromienK(float r) { 
        if(r>0) prKuli = r;
        else System.out.println("Promien musi być wieksza od 0!");
        }
    
    //getter
    public float getPromienK() {
        return prKuli;
        }
    
    //konstruktor z parametrami
    public Kula(float m, float r) { 
        super(m);
        setPromienK(r);
        getPromienK();
        }    
    
  //przeciazona metoda obliczajca glowny mom bezwladnosci
    public double GlownyMom(){
       return Moment+masa*prKuli*prKuli*2/5;
    }

  //Przeciazona metoda wyświetlająca opis obiektu 
    public void Opis() {	//Metoda wyświetlająca opis obiektu 
		System.out.println("Kula\nMasa: "+masa+"\nPromien: "+prKuli+"\nMoment bezwladnosci: "+GlownyMom()+"\nWartosc momentu wzgledem nowej osi: "+SteinerMom+"\n\n");
    }
}
