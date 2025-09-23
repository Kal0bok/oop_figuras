package uzdevums5;

	public class Aplis {
		public Centrs punkts;
		public double radiuss;

		public Aplis (Centrs p, double r) {
			punkts = p; 
			radiuss = r;
}

		public String izvaditAplaInfo() {
			return "Rādiuss: "+radiuss;
}

		//izveidot metodi rinka linijas aprekinasanai 
		public double rLGarums() {
			double c = 2 *Math.PI*radiuss;
			return Math.round(c*100.0)/100.0;
		}
		
		//rinka laukuma aprekinasanai
		public double rLaukums() {
			double s = Math.PI*Math.pow(radiuss, 2);
			return Math.round(s*100.0)/100.0;
		}
		
		
		
}		
