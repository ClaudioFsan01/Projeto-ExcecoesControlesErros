
public class Conta {
	//Quando uma variável é declarada diretamente dentro do escopo da classe, é
	//chamada de variável de objeto, ou atributo
	
	int numero;
	String titular;
	double saldo;
	double salario;

	/* Funções da classe são chamados de Métodos da classe*/
	
	/*
	void saca(double quantidade) // (double quantidade)  argumento do método ou parametro
	{
	 double novoSaldo =	this.saldo -quantidade; 
	 this.saldo = novoSaldo;
	//palavra chave this para mostrar que esse é um atributo, e não uma simples variável pois tanto a variavel quantidade e novoSaldo vão morrer ao termino 
	 // da execução do método , ou seja, o valor não ficara guardado
	}
	*/
	
	public double getSaldo() {
		return this.saldo;
	}

	void deposita(double quantidade)
	{
		this.saldo += quantidade;
	}
	
	// Método com retorno 
	
	/*  
	 A palavra chave throw, que está no imperativo, lança uma Exception . Isto é bem diferente de
throws , que está no presente do indicativo, e que apenas avisa da possibilidade daquele método lançála,
obrigando o outro método que vá utilizar deste de se preocupar com essa exceção em questão.
	 */
	/*
	boolean saca(double quantidade)
	{
		if(quantidade<= this.saldo)
		{
			this.saldo -= quantidade;
			return true;
		}
		else
		{
			return false;
		}
		 
	}*/
	
	
		/*
	public void saca(double quantidade)
	{
		if(quantidade > this.saldo)
		{		
			throw new RuntimeException();
			
		}
		else
		{
			this.saldo -= quantidade;
			
		}
		 
	}
	*/
	
	/*
	 * No nosso caso acima, lança uma exceção do tipo unchecked(o compilador não verifica se essa exceção esta sendo tratada). RuntimeException é a exception mãe de todas as
exceptions unchecked. A desvantagem, aqui, é que ela é muito genérica; quem receber esse erro não sabe
dizer exatamente qual foi o problema. Podemos então usar uma Exception mais específica conforme o exemplo:
	 */
	
	public void saca(double quantidade)
	{
		if(quantidade > this.saldo)
		{		
			throw new IllegalArgumentException();
			
		}
		else
		{
			this.saldo -= quantidade;
			
		}
		 
	}
	
	/*
	 IllegalArgumentException diz um pouco mais: algo foi passado como argumento e seu método
não gostou. Ela é uma Exception unchecked pois estende de RuntimeException e já faz parte da
biblioteca do java. ( IllegalArgumentException é a melhor escolha quando um argumento sempre é
inválido como, por exemplo, números negativos, referências nulas, etc).
	 */
	
	
	
	
}
