package bowling;

import org.junit.Test;

import bowlingGame.Game;
import junit.framework.TestCase;

public class BowlingKataTest extends TestCase {
private Game g;
	protected void setUp() throws Exception{
		g=new Game();
	}
	
	private void rollMany(int n, int pins){
		for(int i=0;i<n;i++){
			g.roll(pins);
		}
	}	
	
	@Test
	public void test() {
		rollMany(20,0);
			assertEquals(0,g.score());
	}

	@Test
	public void testAllOnes(){
		rollMany(20,1);
		assertEquals(20,g.score());
	}
	
	@Test
	public void testOneSpare()throws Exception{
		g.roll(3);
		rollMany(17,0);
		assertEquals(16,g.score());
	}
	private void rollSpare(){
		g.roll(5);
		g.roll(5);
	}
	

}
	