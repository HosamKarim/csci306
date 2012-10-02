import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class TestCashier {

	@Test
	public void testMakeChanges() throws NegativeBalanceException{
		Envelope expected = new Envelope(0,0,2,0,2);
		
		Cashier c = new Cashier();
		Envelope e = new Envelope(22,0,0,0,3);
		Envelope actual = c.makeChange(e,21,81);
		
		Assert.assertEquals(expected.toString(), actual.toString());
	}

}
