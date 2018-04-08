public class PktMat {
	
	//prywatne pole masy
	protected float masa; 
	double Moment;
	double SteinerMom;
	
	//W test nie zwracamy sie bezposrenio do masy tylko za pomoca akcesorów + mamy kontrole wartosci(jesli masa jest ujemna podaje komunikat)
	public void setMasa(float m) {					
	    if(m>0) masa = m;
	    else System.out.println("Masa pkt musi być wieksza od 0!");
	  }
	public float getMasa() {
	    return masa;
	  }
	  
	//konstruktor domyslny  
	public PktMat() { 
		masa=20;
	}

	//konstruktor z parametrem
	public PktMat(float m) {	
		setMasa(m);
		getMasa();
	}
	
	//Metoda obliczająca  i zwracająca główny moment bezwł.
	public double GlownyMom(){	
		return Moment=0;
	}
	
	//Metoda przyjmująca jeden parametr, obliczająca moment bezwł. z tw. Steinera
	public double Steiner(float l) {	
		
		return SteinerMom=GlownyMom()+masa*l*l;
	}
	
	//Metoda wyświetlająca opis obiektu
	public void Opis() {	
		System.out.println("Punkt materialny\nMasa: "+masa+"\nMoment bezwladnosci: "+GlownyMom()+"\nMOment bezwladnosci wzgl nowej osi: "+SteinerMom);
	}
	
}
