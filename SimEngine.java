
public class SimEngine{
	
	
	private double masa, k , c, lo;
	private Vector2D pozM, pozUtw, predM, g;
	
	public SimEngine(double m, double k, double b, double l, Vector2D pozM, Vector2D predM, Vector2D pozUtw, Vector2D g){ //konstruktor z parametrami ustalajacy wartosci do obliczen symulacji
		
		setmasa(m);
		setk(k);
		setc(b);
		setlo(l);
		setpol(pozM);
		setv(predM);
		setu(pozUtw);
		setg(g);
		
	}
	
	
	public void setmasa(double m){
		 if(m>0){ 
			 masa = m;
		 }
		 else System.out.println("wartosc musi byc wieksza od 0!");
	}
	
	public void setk(double k){
		 if(k>0){ 
			 this.k = k;
		 }
		 else System.out.println("wartosc musi byc wieksza od 0!");
	}
	
	public void setc(double c){
		 if(c>0){ 
			 this.c = c;
		 }
		 else System.out.println("wartosc musi byc wieksza od 0!");
	}
	
	public void setlo(double lo){
		 if(lo>0){ 
			 this.lo = lo;
		 }
		 else System.out.println("wartosc musi byc wieksza od 0!");
	}
	
	public void setpol(Vector2D pozM){ 
		this.pozM= pozM;
	}
	
	public void setv(Vector2D predM){ 
		this.predM= predM;
	}
	
	public void setu(Vector2D pozUtw){ 
		 this.pozUtw = pozUtw;
	}
	
	public void setg(Vector2D g){ 
		 this.g = g;
	}
	
	
	public double getmasa(){
		return masa;
	}
	
	public double getk(){
		return k;
	}
	
	public double getc(){
		return c;
	}
	
	public double getlo(){
		return lo;
	}
	
	public Vector2D getpol(){
		return pozM;
	}
	
	public Vector2D getv(){
		return predM;
	}
	
	public Vector2D getu(){
		return pozUtw;
	}
	
	public Vector2D getg(){
		return g;
	}
	
	public void sim(double krok){	//symualcja(rownania ruchu dla oscylatora))
		
		Vector2D Fw = ( g.Powieksz(masa) ).Suma(  ( pozM.Roznica(pozUtw).Roznica(new Vector2D(0,getlo())).Powieksz(k).Powieksz(-1) ).Suma( predM.Powieksz(c).Powieksz(-1) )  );
		Vector2D a=Fw.Powieksz(1/masa);
		setpol((  (  pozM.Roznica(pozUtw).Roznica(new Vector2D(0,getlo())).Suma( predM.Powieksz(krok) )  ).Suma(  ( a.Powieksz(krok).Powieksz(krok) ).Powieksz(0.5)  )   ).Suma(new Vector2D(0,getlo()))); 
		setv(  predM.Suma( a.Powieksz(krok) )  );
		
		
	}
	
	public void reset(){  //reset symulacji(predkosci masy)
		setv(new Vector2D(0,0));
	}
}
