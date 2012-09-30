
public class Cashier {
	
	public Envelope makeChange(int numOfD, int numOfC){
		Envelope env = new Envelope();
		int qua;
		int dim;
		int ni;
		
		env.setDollars(numOfD);
		
		qua = (int)(numOfC/25);
		env.setQuarter(qua);
		numOfC -= qua*25;
		
		dim = (int)(numOfC/10);
		env.setDimes(dim);
		numOfC -= dim*10;
		
		ni = (int)(numOfC/5);
		env.setNickels(ni);
		numOfC -= ni*5;

		env.setPennies(numOfC);
		
		return env; 
	}
	
	//TEST
	public static void main(String[] args) {
		Cashier cc = new Cashier();
		Envelope ee = cc.makeChange(222,68);
		
		System.out.println(ee.getDollars());
		System.out.println(ee.getQuarter());
		System.out.println(ee.getDimes());
		System.out.println(ee.getNickels());
		System.out.println(ee.getPennies());
		
	}
}
