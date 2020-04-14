import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteErro2 {
	/* 
	  Exemplo de exce��o checked, pois o compilador
checar� se ela est� sendo devidamente tratada, diferente das anteriores, conhecidas como unchecked
	 */
	
   /*Um exemplo interessante � o de abrir um arquivo , onde pode ocorrer o erro do arquivo
n�o existir neste caso obriga a quem chama o m�todo ou construtor a tratar essa exce��o*/
	
	/*
	public static void main(String [] args) throws FileNotFoundException {
		new java.io.FileInputStream("arquivo.txt");
	}
		*/
	
	//ou
	
	
	@SuppressWarnings("resource")
	public static void main(String [] args) throws IOException {
		try {
			new java.io.FileInputStream("arquivo.txt");
		}catch(java.io.FileNotFoundException e) {
			System.out.println(" Arquivo n�o pode ser lido erro : "+ e.getMessage());
			e.printStackTrace();
		}
		
		abre("arquivo2.txt");
	}
	
	
	/* com o throws  obs : 
	 A palavra chave throw, que est� no imperativo, lan�a uma Exception . Isto � bem diferente de
throws , que est� no presente do indicativo, e que apenas avisa da possibilidade daquele m�todo lan��la,
obrigando o outro m�todo que v� utilizar deste de se preocupar com essa exce��o em quest�o.
	 */
	
	@SuppressWarnings("resource")
	public static void abre(String file) throws java.io.IOException{
		new java.io.FileInputStream(file);
	}
		

}
