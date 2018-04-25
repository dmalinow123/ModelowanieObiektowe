import static java.lang.Math.*;

public class Vector2D {
	
	public double x;   //Publiczne wspólrzędne wektora
    public double y;
    
     public Vector2D(){	//Konstruktor domyślny
        x=0;
        y=0;
    }
     
    public Vector2D(double x1, double y1){	//Konstruktor z parametrami
        x=x1;
        y=y1;
    }
    
    public Vector2D Suma(Vector2D AB ){					//Metoda, której 
parametrem jest obiekt zwracajaca obiekt, ktory jest suma wektorów
        
        Vector2D wektor = new Vector2D(AB.x+x,AB.y+y);
        
            return wektor;
    }
    
    public Vector2D Roznica(Vector2D AB ){				//Metoda z parametrem(obiektem) zwracająca nowy obiekt, ktory jest rożnicą wektorów
        
        Vector2D wektor = new Vector2D(x-AB.x,y-AB.y);
        
            return wektor;
    }
    
    public Vector2D Powieksz(double k){				//Metoda z parametrem zwracajaca obiekt bedacy wielokrotnoscia danego wektora
        
        Vector2D wektor = new Vector2D(k*x,k*y);
        
            return wektor;
    }
    
    public double Dlugosc(){				//Metoda bez parametru zwracajaca dlugosc wektora dla ktorego ja wywołujemy
        return sqrt(pow(x,2)+pow(y,2));	
    }
    
    public Vector2D Normalizuj(){									//Metoda bez parametru zwracajaca obiekt ktory jest znormalizowanym wektorem
        Vector2D wektor = new Vector2D(x/Dlugosc(),y/Dlugosc());
        return wektor;
    }

    public void opis() {									//Metoda do wyswietlania wspolrzednych wektora
    	System.out.println("[" + x + " , " + y + "]");
    }
}
