package uzdevums5;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import OOP.MinkuTante;
public class Figuras {
	static String[] objektuPogas = {"Centrs", "Četrsturis", "Aplis", "Trijsturis", "Atgriezties"};
	
	static ArrayList<Centrs> centraObjekti = new ArrayList<>();
	static ArrayList<Cetrsturis> cetrsturaObjekti = new ArrayList<>();
	static ArrayList<Aplis> aplaObjekti = new ArrayList<>();
	static ArrayList<Trijsturis> trijsturisObjekti = new ArrayList<>();
	
	public static void main(String [] args) {
		/*
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
	*/
		
	 int izvele, poga;
	
	do {
		izvele = MinkuTante.skaitlaParbaude("Ko vēlies darīt?\n"
				+"0 - Apturēt\n"
				+"1 - Izveidot objektu\n"
				+"2 - Aplūkot objektus\n"
				+"3 - Izsaukt metodi\n",0,3);
		if(izvele == -1)
			izvele = 0;
		switch(izvele) {
		
		case 0:
			JOptionPane.showMessageDialog(null, "Programma apturēta!", "Paziņojums",
					JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 1:
			OIzveide.izveidotObjektu();
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		}
	}while(izvele != 0);
	
}
}
