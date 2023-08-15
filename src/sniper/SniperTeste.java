package sniper;
import java.util.Random;
import java.util.Scanner;


public class SniperTeste {
	public static void main(String[]args) {
		int opcao;
		Scanner leitor = new Scanner(System.in);
		Random randomx = new Random();
		Random randomy = new Random();
		Sniper sniper = new Sniper("Omen", randomx.nextInt(16), randomy.nextInt(16));
		
		do {
			
			System.out.println("+--------------------------------+");
			System.out.println("|         MENU DO SNIPER         |");
			System.out.println("+--------------------------------+");
			System.out.println(
					"| 1 - Atirar (Pense com cuidado) |\n" +
					"| 2 - Mirar (Mire no Alvo)       |\n" +
					"| 3 - Recarregar (Municao +)     |\n" +
					"| 4 - Olhar Cartucho             |\n" +
					"| 5 - Consultar Alvo             |\n" +
					"| 99 - Fechar jogo               |"
					);
			System.out.println("+--------------------------------+\n");
			
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				sniper.atirar();
				break;
			case 2:
				System.out.println("<<< Digite o valor em X, aperte ENTER e digite o valor em Y >>>");
				sniper.mirar(leitor.nextInt(), leitor.nextInt());
				System.out.println("<<< TCH... MIRA POSICIONADA... AGUARDANDO ORDENS >>>\n");
				break;
			case 3:
				sniper.recarregar();
				System.out.println("<<< UMA BALA RECARREGADA... >>>\n");
				break;
			case 4:
				System.out.println("<<< BALAS " + sniper.getMunicao() + "/5 >>>\n");
				break;
			case 5:	
				System.out.println("<<< SEU ALVO EH:" + sniper.getAlvo() + ">>>\n");
				System.out.println("<<< Ela foi vista entre X:" + (sniper.getAlvoX() - 2) + "-" + (sniper.getAlvoX() + 2) + "Y:" + (sniper.getAlvoY() - 2) + "-" + (sniper.getAlvoY() + 2)  );
				break;
			case 99:
				System.out.println("<<< Obrigado por jogar!!! >>>");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		}while(opcao != 99);
		
		leitor.close();
	}
}
