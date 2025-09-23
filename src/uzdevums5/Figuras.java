package uzdevums5;

public class Figuras {
	
	public static void main(String [] args) {
	//izveido Centrs objektu
	Centrs centraP1 = new Centrs(-10, 12);
	System.out.println(centraP1.izvaditKoordinatas());
	centraP1.parvietot(5,  -2);
	System.out.println(centraP1.izvaditKoordinatas());
	
	//izveidot Cetrsturis objektu
	Cetrsturis cetrsturis1 = new Cetrsturis();
	System.out.println(cetrsturis1.izvaditCetrsturisInfo());
	// izvadit ši četrstura atrašanas vietu
	System.out.println(cetrsturis1.punkts.izvaditKoordinatas());
	
	Cetrsturis cetrsturis2 = new Cetrsturis(centraP1, 5, 11);
	System.out.println(cetrsturis2.izvaditCetrsturisInfo()+"\n"+
	cetrsturis2.punkts.izvaditKoordinatas()+"\ns = "+cetrsturis2.cLaikums());
	
	Centrs punkts2 = new Centrs(5, 23);
	Aplis aplis1 = new Aplis (punkts2, 5);
	System.out.println(aplis1.izvaditAplaInfo()+"\n"+"s = "+
	aplis1.rLaukums()+"\n"+"\s"+aplis1.rLGarums());
}
}
