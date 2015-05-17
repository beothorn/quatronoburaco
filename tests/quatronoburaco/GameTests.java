package quatronoburaco;


import org.junit.Assert;
import org.junit.Test;

public class GameTests {

	@Test
	public void mostraUmTabuleiroVazio() {
		String expected = 
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"-------";
		
		Jogo subject = new Jogo();
		String actual = subject.getJogo();
		
		Assert.assertEquals(expected, actual);
	}

}
