package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingKataTest {

	private Game g;
	
	@Before
	public void setUp() throws Exception {
		g = new Game();
	}
	
	@Test
	public void test() {
		for (int i = 0; i < 20; i++)
			g.roll(0);
		assertEquals(0, g.score());
	}
	
	private void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++)
			g.roll(pins);
	}
	
	@Test
	public void testGutterGame() throws Exception {
		rollMany(20, 0);
		assertEquals(0, g.score());
	}

	@Test
	public void testAllOnes() throws Exception {
	    rollMany(20,1);
	    assertEquals(20, g.score());
	}
	
	  public void testOneSpare() throws Exception {
	    g.roll(5);
	    g.roll(5);
	    g.roll(3);
	    rollMany(17,0);
	    assertEquals(16,g.score());
	  }
	
}