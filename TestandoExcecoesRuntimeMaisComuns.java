
public class TestandoExcecoesRuntimeMaisComuns {
	
	public static void main(String [] args) {
		
		// Divisão por zero
		/* Exemplo de exções unchecked pois o compilador não checa se você está tratando essas exceções porque 
		tais problemas poderiam ser evitados pelo programador */
		
		try {
			int i = 5741;			
			System.out.println(" Numero :"+ i +" divido por 0 é = "+ i/0);			
		}catch(ArithmeticException e) {
			System.out.println(" Erro divisão por zero :"+ e.getMessage());			
		}
				
		
		
	}

}
