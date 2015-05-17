package quatronoburaco;

public class Jogo {

	private static final int JOGADOR1 = 1;
	private static final int JOGADOR2 =2;
	private static final int VAZIO = 0;
	private int[][] tabuleiro = new int[6][7];
	private int vezDoJogador = JOGADOR1;
	
	public String getJogo() {
		String tabuleiroAsString = "";
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if(tabuleiro[i][j] == VAZIO)
					tabuleiroAsString += "-";
				if(tabuleiro[i][j] == JOGADOR1)
					tabuleiroAsString += "X";
				if(tabuleiro[i][j] == JOGADOR2)
					tabuleiroAsString += "O";
			}
			tabuleiroAsString += "\n";
		}
		return tabuleiroAsString;
	}

	public void jogar(int coluna) {
		if(vezDoJogador == JOGADOR1){
			tabuleiro[5][coluna-1] = JOGADOR1;
			vezDoJogador = JOGADOR2;
		}else{
			tabuleiro[5][coluna-1] = JOGADOR2;
			vezDoJogador = JOGADOR1;
		}
	}

}
