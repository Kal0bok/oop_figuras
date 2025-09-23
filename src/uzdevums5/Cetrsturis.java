package uzdevums5;

public class Cetrsturis {
	public double platums, augstums;
	public Centrs punkts;

	//Konstruktoru pārslogošana
	public Cetrsturis() {
		punkts = new Centrs (0, 0);
	}
	
	public Cetrsturis(Centrs punkts, double p, double a) {
		this.punkts = punkts;
		platums = p;
		augstums = a;
	}
	
	public String izvaditCetrsturisInfo() {
		return "Platums: "+platums+"Augstums: "+augstums+"cm";
	}
	//Uztaisīt metodi, kas apreķina laukumu un atgriež tikai rezultatu 
	public double cLaikums() {
		double s = platums * augstums;
		return s;
	}
	
}
