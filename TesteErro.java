
public class TesteErro {
	/* Exemplo de exceção unchecked pois o compilador não checa se você está tratando essas exceções porque 
	tais problemas poderiam ser evitados pelo programador */
     // 
	public static void main(String [] args) {
		/*
		O sistema de exceções do Java funciona da seguinte maneira: quando uma exceção é lançada
     (throw), a JVM entra em estado de alerta e vai ver se o método atual toma alguma precaução ao
     tentar executar esse trecho de código. Como podemos ver, o metodo2 não toma nenhuma precaução p/ o erro gerado,
     Como o metodo2 não está tratando esse problema, a JVM pára a execução dele anormalmente, sem
    esperar ele terminar, e volta um stackframe pra baixo, onde será feita nova verificação(ou seja volta pra quem chamou) nesse caso o metodo1
     e verifica no bloco de instruçõs desse método se está se precavendo de um problema chamado NullPointerException ?" "Não.
     Como o metodo1() no seu bloco de instrução não esta se precavendo entao volta para o metodo main que foi quem chamou o metodo1().
     
     No nosso exemplo final a exceção esta sendo tratada na chamada do metodo1() no metodo main
		 */
		
		try {
			metodo1();					
			
		}catch(NullPointerException e) {
			System.out.println(" Erro exceção de ponteiro : "+ e.getMessage());
		}
		
		try {
			
			ContaCorrente cc = new ContaCorrente();		
			cc.deposita(200);
			System.out.println(" Saldo da conta corrente antes do saque: "+ cc.getSaldo());		
			cc.saca(300);		
			System.out.println(" Saldo da conta corrente depois do saque : "+ cc.getSaldo());
			
		}		
		catch(IllegalArgumentException e) {
			System.out.println(" Saldo insuficiente , erro : "+ e.getMessage());	
		}
		
		
		
	}
	static void metodo1() {
		/*try { Neste caso o tratamento ocorre na chamada do metodo2() quando ocorrer a excecao do tipo ponteiro nulo 
		     no corpo de execucação do metodo2() ocorrerá  uma interrupção nesse ponto e retornará pra onde o método foi chamado
		     sendo essa exceção pega pelo catch 
			metodo2();
		}catch(NullPointerException e) {
			System.out.println(" Erro exceção de ponteiro : "+ e.getMessage());
		}
		
		*/
		
		metodo2();
		
	}
	
	static void metodo2() {
		int i=0;
		ContaCorrente cc1 = new ContaCorrente();
		
        // Neste 1° exemplo quando for gerada a primeira exceção do tipo  NullPointerException o catch pega essa exceção e finaliza a execução
		
		/*
		try { // try (experimentar ou tentar executar o codigo que esta dentro do bloco)
			for(;i<15;i++) {
				
				cc1.deposita(500+i);
				
				System.out.println("Saldo conta corrente :"+ cc1.getSaldo());
				
				if(i==5) {
					cc1 =null;
				}
				
			}			
			
		}catch(NullPointerException e ) {  catch (pegar) caso a exceção seja do tipo NullPointerException 
		                                   Exceção de ponteiro nulo ele será pego(catch)				
				
			System.out.println(" Erro exceção de ponteiro : "+ e.getMessage());}
		
		*/	
		
		  /* Neste 2° exemplo devido o try e catch estarem dentro do bloco de execução do for todos os erros do tipo NullPointerException
		     serão pegos pelo catch() 
		   /*
			for(;i<15;i++) {
				
				try {
				cc1.deposita(500+i);
				
				System.out.println("Saldo conta corrente :"+ cc1.getSaldo());
				
				if(i==5) {
					cc1 =null;
				}
				
			}catch(NullPointerException e) {
				System.out.println(" Erro exceção de ponteiro : "+ e.getMessage());
			}
				
			}	*/	
		
		// 3° exemplo inserindo o try catch em volta da chamada do metodo2()
		
		for(;i<15;i++) {
			
			cc1.deposita(500+i);
			
			System.out.println("Saldo conta corrente :"+ cc1.getSaldo());
			
			if(i==5) {
				cc1 =null;
			}
			
		}			
		
	
		
	} // fim do metodo2() 
}
