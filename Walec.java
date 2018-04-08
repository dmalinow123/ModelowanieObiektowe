public class Walec extends PktMat {
    
	//prywatne pole promienia walca
    private float prWalca;
    
  //konstruktor domyslny
    public Walec(){
        super();
        prWalca=10;    
    }
    
    //setter
    public void setPromien(float r) { 
        if(r>0) prWalca = r;
        else System.out.println("Promien musi być wieksza od 0!");
    }
    
    //getter
    public float getPromien() {
        return prWalca;
    }
    
    //konstruktor z parametrami
    public Walec(float m, float r) { 
        super(m);
        setPromien(r);
        getPromien();
    }
    
  //przeciazona metoda obliczajca glowny mom bezwladnosci
    public double GlownyMom(){
    	return Moment+masa*prWalca*prWalca/2;
    }
    
  //Przeciazona metoda wyświetlająca opis obiektu 
    public void Opis() {	//Metoda wyświetlająca opis obiektu 
		System.out.println("Walec\nMasa: "+masa+"\nPromien: "+prWalca+"\nMoment bezwladnosci: "+GlownyMom()+"\nWartosc momentu wzgledem nowej osi: "+SteinerMom+"\n\n");
    }
}
