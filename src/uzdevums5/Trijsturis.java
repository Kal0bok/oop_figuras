package uzdevums5;

public class Trijsturis {
	public double mala1, mala2, mala3;
	public Centrs punkts;
	public Trijsturis(Centrs p, double m1, double m2, double m3) {
		punkts = p;
		mala1 = m1;
		mala2 = m2;
		mala3 = m3;
	}
	
	public String izvaditTrisjturaInfo() {
		return "Mala1: "+mala1+"cm/n"+
				"Mala1: "+mala1+"cm/n"+
				"Mala1: "+mala1+"cm";
	}
	
	//uztaisit metodi laukuma aprēķinam
	public double tLaukums() {
		double p = (mala1+mala2+mala3) / 2;
		double s = Math.sqrt(p*(p-mala1)*(p-mala2)*(p-mala3));
		return Math.round(s*100.0)/100.0;
	}
}
