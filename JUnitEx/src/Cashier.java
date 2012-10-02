
public class Cashier {
	
	private double totalEnv;
	private double totalPrice;
	private double diff;
	
	public Envelope makeChange(Envelope env, int numOfD, int numOfC) throws NegativeBalanceException{
		Envelope newEnv = new Envelope();
		
		totalEnv = env.getTotalCents();
		
		totalPrice = numOfD*100 + numOfC;
		
		diff = totalEnv - totalPrice;
		
		if (diff < 0) {
			throw new NegativeBalanceException("Price exceeds envelope contents by" + Math.abs(diff) + "cents");
		}
		
		newEnv.setDollars((int)diff/100);
		diff %= 100; 
		
		newEnv.setQuarter((int)diff/25);
		diff %= 25;
		
		newEnv.setDimes((int)diff/10);
		diff %= 10;
		
		newEnv.setNickels((int)diff/5);
		diff %= 5;
		
		newEnv.setPennies((int)diff);

		return newEnv; 
	}
	
	/*
	//~~~~~~TEST
	public static void main(String[] args) throws NegativeBalanceException {
		Cashier cc = new Cashier();
		Envelope e = new Envelope(22,0,0,0,3);
		Envelope ee = cc.makeChange(e,21,81);
		
		System.out.println(ee.getDollars());
		System.out.println(ee.getQuarter());
		System.out.println(ee.getDimes());
		System.out.println(ee.getNickels());
		System.out.println(ee.getPennies());
		
		
	}
	*/
}
