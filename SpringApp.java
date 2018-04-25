
Import java.util.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
public class SpringApp extends JFrame;
private double w, s;
	private Image buf;
	private Graphics bufG;
	private SimEngine SE;
	private SimTask ST;
	private Timer T;
  
public SpringApp(int w, int s) {
		if(w>0 && s>0) {
		this.w=w;				      //nadanie wartosci polom w,s + if sprawdzajacy poprawnosc podanych danych
		this.s=s;
		setSize(w,s);			    //ustawienie wymiarów okna na w i s 
		setTitle("Oscylator");	//nadanie tytłuu oknu
		SE = new SimEngine(20, 1, 1, 10, new Vector2D(50,20), new Vector2D(getWidth()/2,0), new Vector2D((double)getWidth()/2,0), new Vector2D(0,10) );
		ST = new SimTask(this , SE, 1);
		T = new Timer();					//stworzenie obiektów 3 klas
		T.scheduleAtFixedRate(ST, 0, (long)(ST.getKrok())*10);	//ustawienie timera
		
		}else System.out.println("Podaj dodatnie wymiary okna!");
		
	}
	
	
	public void paint(Graphics g) {		//podwojne buforowanie okna i rysowanie
		buf = createImage((int)w, (int)s);
		bufG=buf.getGraphics();
		paintComponent(bufG);
		g.drawImage(buf, 0, 0, null);
	}

	
	public void paintComponent(Graphics g) {	
		super.paintComponents(g);
		g.clearRect(0, 0, (int)this.w, (int)this.s);  //wyczyszczenie okna o 
wymiarach w,s 
		g.setColor(Color.BLACK);						
//ustawienien koloru rysowania na czarny
		g.drawOval(getWidth()/2-25, (int)SE.getpol().y-25, 50, 50);		
//rysowanie okregu
		g.drawLine((int)SE.getu().x, (int)SE.getu().y, getWidth()/2, (int)SE.getpol().y);								//rysowanie linii
		
	}

public static void main(String[] args) {
	SpringApp pr = new SpringApp(600,600);				//stworzenie 
nowego obiektu konstruktorem z parametrami jakimi są wyskość i szerokość okna
	pr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //ustawienie działania 
na nacisniecie znaku "x" w prawym gornym rogu
	pr.setVisible(true);								
//ustaiwenie widocznosci okna
	}
}
