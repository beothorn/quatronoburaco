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
				"-------\n";
		
		Jogo subject = new Jogo();
		String actual = subject.getJogo();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void depoisDeUmaJogada_MostraTablueiroComPeca(){
		String expected = 
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"X------\n";
		
		Jogo subject = new Jogo();
		int coluna = 1;
		subject.jogar(coluna);
		String actual = subject.getJogo();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void depoisDeUmaJogadaDiferente_MostraTablueiroComPeca(){
		String expected = 
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"-X-----\n";
		
		Jogo subject = new Jogo();
		int coluna = 2;
		subject.jogar(coluna);
		String actual = subject.getJogo();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void depoisDeDuasJogadas_MostraTablueiroComPeca(){
		String expected = 
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"-------\n"+
				"XO-----\n";
		
		Jogo subject = new Jogo();
		int colunaX = 1;
		subject.jogar(colunaX);
		int colunaO = 2;
		subject.jogar(colunaO);
		String actual = subject.getJogo();
		Assert.assertEquals(expected, actual);
	}

}
