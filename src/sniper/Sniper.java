package sniper;

public class Sniper {
	//definindo os atributos
	
	private String alvo;
	private int alvoX;
	private int alvoY;
	private int municao;
	private int x;
	private int y;
	
	//metodo construtor
	public Sniper(String alvo, int alvoX, int alvoY) {
		this.alvo = alvo;
		this.municao = 5;
		this.alvoX = alvoX;
		this.alvoY = alvoY;
	}
	
	
	//definicao de metodos
	
	public void mirar(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public void atirar() {
		
		if(municao <= 0) {
			System.out.println("<<< SEM BALAS NO CARTUCHO >>>");
		}else {
			municao -= 1;
			System.out.println("POW ===========D");
			
			if(x == alvoX && y == alvoY) {
				System.out.println("<<< Parabéns Soldado, um belo tiro !!! >>>");
			}else {
				System.out.println("<<< Voce errou soldado, tente novamente >>>");
			}	
		}
		
	}
	
	public void recarregar() {
		if(municao >= 5) {
			System.out.println("<<< CARTUCHO CHEIO >>>");
		}else {
		municao += 1;
		}
	}
	
	public int getAlvoX() {
		return alvoX;
	}
	
	public int getAlvoY() {
		return alvoY;
	}
	
	public String getAlvo() {
		return alvo;
	}
	
	public int getMunicao() {
		return municao;
	}

}


