
public class Cashier {
	
	private int qua;
	private int dim;
	private int ni;
	private double totalEnv;
	private double totalPrice;
	private double diff;
	
	public Envelope makeChange(Envelope env, int numOfD, int numOfC) throws NegativeBalanceException{
		Envelope newEnv = new Envelope();
		
		totalEnv = env.getDollars() + env.getQuarter()/100*25 + env.getDimes()/100*10
				+ env.getNickels()/100*5 + env.getPennies()/100; 
		
		totalPrice = numOfD + numOfC/100;
		
		diff = totalEnv - totalPrice;
		
		if (diff < 0) {
			throw new NegativeBalanceException("Price exceeds envelope contents by" + Math.abs(diff) + "cents");
		}
		
		newEnv.setDollars(env.getDollars() - numOfD);
		
		qua = (int)(numOfC/25);
		newEnv.setQuarter(env.getQuarter() - qua);
		numOfC -= qua*25;
		
		dim = (int)(numOfC/10);
		newEnv.setDimes(env.getDimes() - dim);
		numOfC -= dim*10;
		
		ni = (int)(numOfC/5);
		newEnv.setNickels(env.getNickels() - ni);
		numOfC -= ni*5;

		newEnv.setPennies(env.getPennies() - numOfC);
		
		return newEnv; 
	}
	
	//~~~~~~TEST
	public static void main(String[] args) throws NegativeBalanceException {
		Cashier cc = new Cashier();
		Envelope e = new Envelope(223,3,6,2,6);
		Envelope ee = cc.makeChange(e,222,68);
		
		System.out.println(ee.getDollars());
		System.out.println(ee.getQuarter());
		System.out.println(ee.getDimes());
		System.out.println(ee.getNickels());
		System.out.println(ee.getPennies());
		
	}
}
