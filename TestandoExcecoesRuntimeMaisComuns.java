
public class TestandoExcecoesRuntimeMaisComuns {
	
	public static void main(String [] args) {
		
		// Divis�o por zero
		/* Exemplo de ex��es unchecked pois o compilador n�o checa se voc� est� tratando essas exce��es porque 
		tais problemas poderiam ser evitados pelo programador */
		
		try {
			int i = 5741;			
			System.out.println(" Numero :"+ i +" divido por 0 � = "+ i/0);			
		}catch(ArithmeticException e) {
			System.out.println(" Erro divis�o por zero :"+ e.getMessage());			
		}
				
		
		
	}

}
