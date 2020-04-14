
public class TesteErro {
	/* Exemplo de exce��o unchecked pois o compilador n�o checa se voc� est� tratando essas exce��es porque 
	tais problemas poderiam ser evitados pelo programador */
     // 
	public static void main(String [] args) {
		/*
		O sistema de exce��es do Java funciona da seguinte maneira: quando uma exce��o � lan�ada
     (throw), a JVM entra em estado de alerta e vai ver se o m�todo atual toma alguma precau��o ao
     tentar executar esse trecho de c�digo. Como podemos ver, o metodo2 n�o toma nenhuma precau��o p/ o erro gerado,
     Como o metodo2 n�o est� tratando esse problema, a JVM p�ra a execu��o dele anormalmente, sem
    esperar ele terminar, e volta um stackframe pra baixo, onde ser� feita nova verifica��o(ou seja volta pra quem chamou) nesse caso o metodo1
     e verifica no bloco de instru��s desse m�todo se est� se precavendo de um problema chamado NullPointerException ?" "N�o.
     Como o metodo1() no seu bloco de instru��o n�o esta se precavendo entao volta para o metodo main que foi quem chamou o metodo1().
     
     No nosso exemplo final a exce��o esta sendo tratada na chamada do metodo1() no metodo main
		 */
		
		try {
			metodo1();					
			
		}catch(NullPointerException e) {
			System.out.println(" Erro exce��o de ponteiro : "+ e.getMessage());
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
		     no corpo de execuca��o do metodo2() ocorrer�  uma interrup��o nesse ponto e retornar� pra onde o m�todo foi chamado
		     sendo essa exce��o pega pelo catch 
			metodo2();
		}catch(NullPointerException e) {
			System.out.println(" Erro exce��o de ponteiro : "+ e.getMessage());
		}
		
		*/
		
		metodo2();
		
	}
	
	static void metodo2() {
		int i=0;
		ContaCorrente cc1 = new ContaCorrente();
		
        // Neste 1� exemplo quando for gerada a primeira exce��o do tipo  NullPointerException o catch pega essa exce��o e finaliza a execu��o
		
		/*
		try { // try (experimentar ou tentar executar o codigo que esta dentro do bloco)
			for(;i<15;i++) {
				
				cc1.deposita(500+i);
				
				System.out.println("Saldo conta corrente :"+ cc1.getSaldo());
				
				if(i==5) {
					cc1 =null;
				}
				
			}			
			
		}catch(NullPointerException e ) {  catch (pegar) caso a exce��o seja do tipo NullPointerException 
		                                   Exce��o de ponteiro nulo ele ser� pego(catch)				
				
			System.out.println(" Erro exce��o de ponteiro : "+ e.getMessage());}
		
		*/	
		
		  /* Neste 2� exemplo devido o try e catch estarem dentro do bloco de execu��o do for todos os erros do tipo NullPointerException
		     ser�o pegos pelo catch() 
		   /*
			for(;i<15;i++) {
				
				try {
				cc1.deposita(500+i);
				
				System.out.println("Saldo conta corrente :"+ cc1.getSaldo());
				
				if(i==5) {
					cc1 =null;
				}
				
			}catch(NullPointerException e) {
				System.out.println(" Erro exce��o de ponteiro : "+ e.getMessage());
			}
				
			}	*/	
		
		// 3� exemplo inserindo o try catch em volta da chamada do metodo2()
		
		for(;i<15;i++) {
			
			cc1.deposita(500+i);
			
			System.out.println("Saldo conta corrente :"+ cc1.getSaldo());
			
			if(i==5) {
				cc1 =null;
			}
			
		}			
		
	
		
	} // fim do metodo2() 
}
