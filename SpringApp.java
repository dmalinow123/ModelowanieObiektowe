import javax.swing.JFrame;

public class SpringApp extends JFrame{
	
	public void paint() {
		
	}
	
	public void paintComponent() {
		
	}
	
	public static void main(String[] args) {
		
		Vector2D wektor1= new Vector2D(5,9);  //Stworzenie 2 obiektow klasy Vector2D przy uzyciu konstruktora z parametrem
        Vector2D wektor2= new Vector2D(8,2);
        
        Vector2D wektor1plus2=wektor1.Suma(wektor2);     //Obliczenie sumy i roznicy utworzonych wektorow i zapisanie ich do obiektow o nowych nazwach 
        Vector2D wektor2minus1=wektor1.Roznica(wektor2);
        
        Vector2D norm1 = wektor1plus2.Normalizuj();		//Obliczenie znormalizowanych wektorow wyliczonych wczesniej i zapisanie ich do obiektów o nowej nazwie
        Vector2D norm2 = wektor2minus1.Normalizuj();
        
        double dl1 = norm1.Dlugosc();	//Obliczenie dlugosci wektorow i zapisanie do obiektow o nowych nazwach
        double dl2 = norm2.Dlugosc();
        
        Vector2D mnozony=wektor1.Powieksz(5);	//Pomnozenie wektora przez z stałą(5) i zapisanie go do obiekto o nowej nazwie
        
        
        System.out.print("Współrzedne wektora nr 1:  "); wektor1.opis();
        System.out.print("Współrzedne wektora nr 2:  "); wektor2.opis();
        System.out.print("Suma wektora 1 i 2:  "); wektor1plus2.opis();
        System.out.print("Różnica wektora 2 i 1:  "); wektor2minus1.opis();
        System.out.print("Znormalizowany wektor nr 1:  "); norm1.opis();
        System.out.print("Znormalizowany wektor nr 2:  "); norm2.opis();
        System.out.println("Długość wektora nr 1:  "+dl1);
        System.out.println("Długość wektora nr 2:  "+dl2);
        System.out.print("Wektor nr 1 powiekszony 5 razy:  "); mnozony.opis();
        
        
	}
}
