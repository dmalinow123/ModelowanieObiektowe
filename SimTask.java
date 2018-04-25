import java.util.TimerTask;

public class SimTask extends TimerTask {
	
		private SimEngine SE;
		private SpringApp SA;
		private double krok;
		private double t=0;
		
		public SimTask(SpringApp app, SimEngine eng, long krok) { //konstruktor z 
parametrami
			SA=app;
			SE=eng;
			setKrok(krok);
		}
	
	
		public void run() {		
			SE.sim(krok);			//obliczanie parametrow symolacji w 
podanym od
			SA.repaint();			//odstępie czasowym (krok) i ponowne 
narysowanie
		}
		
		
		
		public double getKrok() {
			return krok;
		}
		
		public void setKrok(double krok) {
			if (krok>0) {this.krok=krok;}
			else {System.out.println("Krok musi byc wiekszy od 0!!");}
		}
		
		public double getT() {
			return t;
		}
		
		public void setT(double t) {
			if (krok>0) {this.t=t;}
			else {System.out.println("Krok musi byc wiekszy od 0!!");}
		}
		
		
		
		
		
		
		
		
}

