import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
    Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (IllegalArgumentException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            exception.printStackTrace();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = parametroDois - parametroUm;
		if(contagem>0){
            for (int i = 1; i <= contagem; i++) {
                System.out.println("imprimindo o número "+i);
            }
        }else{
           throw new ParametrosInvalidosException();
        }

		//realizar o for para imprimir os números com base na variável contagem
	}    
    
}
