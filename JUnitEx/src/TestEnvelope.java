import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class TestEnvelope {

	@Test
	public void testGetTotalCents() {
		int expected = 141;
		Envelope envelope = new Envelope(1,1,1,1,1);
		int actual = envelope.getTotalCents();
		Assert.assertEquals(expected, actual);
	}

}
