import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteErro2 {
	/* 
	  Exemplo de exceção checked, pois o compilador
checará se ela está sendo devidamente tratada, diferente das anteriores, conhecidas como unchecked
	 */
	
   /*Um exemplo interessante é o de abrir um arquivo , onde pode ocorrer o erro do arquivo
não existir neste caso obriga a quem chama o método ou construtor a tratar essa exceção*/
	
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
			System.out.println(" Arquivo não pode ser lido erro : "+ e.getMessage());
			e.printStackTrace();
		}
		
		abre("arquivo2.txt");
	}
	
	
	/* com o throws  obs : 
	 A palavra chave throw, que está no imperativo, lança uma Exception . Isto é bem diferente de
throws , que está no presente do indicativo, e que apenas avisa da possibilidade daquele método lançála,
obrigando o outro método que vá utilizar deste de se preocupar com essa exceção em questão.
	 */
	
	@SuppressWarnings("resource")
	public static void abre(String file) throws java.io.IOException{
		new java.io.FileInputStream(file);
	}
		

}
