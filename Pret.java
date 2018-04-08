public class Pret extends PktMat{
    
	//prywatne pole dlugosci preta
    private float dlPreta;
    
    //konstruktor domyslny
    public Pret(){
        super();
        dlPreta=10;    
        }
    
    //setter
    public void setPret(float r) { 
        if(r>0) dlPreta = r;
        else System.out.println("Promien musi być wieksza od 0!");
        }
    
    //getter
    public float getPret() {
        return dlPreta;
        }
    
    //konstruktor z parametrami
    public Pret(float m, float r) { 
        super(m);
        setPret(r);
        getPret();
    }
    
    //przeciazona metoda obliczajca glowny mom bezwladnosci
    public double GlownyMom(){
        return (Moment+masa*masa*dlPreta/12);
    }
    
    //Przeciazona metoda wyświetlająca opis obiektu 
    public void Opis() {	
		System.out.println("Pręt\nMasa: "+masa+"\nDlugosc: "+dlPreta+"\nMoment bezwladnosci: "+GlownyMom()+"\nWartosc momentu wzgledem nowej osi :"+SteinerMom+"\n\n");
    }
}
