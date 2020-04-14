
public class Conta {
	//Quando uma vari�vel � declarada diretamente dentro do escopo da classe, �
	//chamada de vari�vel de objeto, ou atributo
	
	int numero;
	String titular;
	double saldo;
	double salario;

	/* Fun��es da classe s�o chamados de M�todos da classe*/
	
	/*
	void saca(double quantidade) // (double quantidade)  argumento do m�todo ou parametro
	{
	 double novoSaldo =	this.saldo -quantidade; 
	 this.saldo = novoSaldo;
	//palavra chave this para mostrar que esse � um atributo, e n�o uma simples vari�vel pois tanto a variavel quantidade e novoSaldo v�o morrer ao termino 
	 // da execu��o do m�todo , ou seja, o valor n�o ficara guardado
	}
	*/
	
	public double getSaldo() {
		return this.saldo;
	}

	void deposita(double quantidade)
	{
		this.saldo += quantidade;
	}
	
	// M�todo com retorno 
	
	/*  
	 A palavra chave throw, que est� no imperativo, lan�a uma Exception . Isto � bem diferente de
throws , que est� no presente do indicativo, e que apenas avisa da possibilidade daquele m�todo lan��la,
obrigando o outro m�todo que v� utilizar deste de se preocupar com essa exce��o em quest�o.
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
	 * No nosso caso acima, lan�a uma exce��o do tipo unchecked(o compilador n�o verifica se essa exce��o esta sendo tratada). RuntimeException � a exception m�e de todas as
exceptions unchecked. A desvantagem, aqui, � que ela � muito gen�rica; quem receber esse erro n�o sabe
dizer exatamente qual foi o problema. Podemos ent�o usar uma Exception mais espec�fica conforme o exemplo:
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
	 IllegalArgumentException diz um pouco mais: algo foi passado como argumento e seu m�todo
n�o gostou. Ela � uma Exception unchecked pois estende de RuntimeException e j� faz parte da
biblioteca do java. ( IllegalArgumentException � a melhor escolha quando um argumento sempre �
inv�lido como, por exemplo, n�meros negativos, refer�ncias nulas, etc).
	 */
	
	
	
	
}
