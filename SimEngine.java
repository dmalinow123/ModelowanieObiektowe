
public class SimEngine{
	
	
	private double masa, k , c, lo;
	private Vector2D pol, v, u, g;
	
	public SimEngine(double m, double k, double b, double l, Vector2D pol, Vector2D v, Vector2D u, Vector2D g){
		
		setmasa(100);
		setk(2);
		setc(0.5);
		setlo(1);
		setpol(0,0);
		setv(1,3);
		setu(0,1);
		setg(0,-10);
		
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
	
	public void setpol(double x, double y){ 
		this.pol= new Vector2D(x,y);
	}
	
	public void setv(double x, double y){ 
		this.v= new Vector2D(x,y);
	}
	
	public void setu(double x, double y){ 
		 this.u = new Vector2D(x,y);
	}
	
	public void setg(double x, double y){ 
		 this.g = new Vector2D(x,y);
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
		return pol;
	}
	
	public Vector2D getv(){
		return v;
	}
	
	public Vector2D getu(){
		return u;
	}
	
	public Vector2D getg(){
		return g;
	}
	
	public void symulacja(double dt){
		
		Vector2D Fw = (pol.Powieksz(k)).Suma(v.Powieksz(c)).Powieksz(-1) ;
		Vector2D a=Fw.Powieksz(1/masa);
		Vector2D x=pol.Suma(v)
		
	}
	
	public void reset(){
		v.x=0;
		v.y=0;
	}
	
	
}
