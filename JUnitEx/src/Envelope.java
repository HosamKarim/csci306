
public class Envelope {
	
	private int dollars, quarter, dimes, nickels, pennies;

	public int getDollars() {
		return dollars;
	}

	public void setDollars(int dollars) {
		this.dollars = dollars;
	}

	public int getQuarter() {
		return quarter;
	}

	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}

	public int getDimes() {
		return dimes;
	}

	public void setDimes(int dimes) {
		this.dimes = dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public void setNickels(int nickels) {
		this.nickels = nickels;
	}

	public int getPennies() {
		return pennies;
	}

	public void setPennies(int pennies) {
		this.pennies = pennies;
	}

	public Envelope() {
		super();
	}

	public Envelope(int dollars, int quarter, int dimes, int nickels,
			int pennies) {
		super();
		this.dollars = dollars;
		this.quarter = quarter;
		this.dimes = dimes;
		this.nickels = nickels;
		this.pennies = pennies;
	}
	
	public int getTotalCents(){
		int total = this.getDollars()*100 + this.getQuarter()*25 + this.getDimes()*10
				+ this.getNickels()*5 + this.getPennies();
		return total;
	}

	@Override
	public String toString() {
		return "Envelope [dollars=" + dollars + ", quarter=" + quarter
				+ ", dimes=" + dimes + ", nickels=" + nickels + ", pennies="
				+ pennies + "]";
	}
	
	
}
