package orienta��oaobjetos;
//1) Crie uma classe cliente e apresente os atributos e m�todos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informa��es deste objeto no console.
	
public class Cliente {
	 //Declara��o de vari�veis
	
	String nome;
	String endereco;
	int idade;
	
	
	//M�todos
	void cadastro() {
		System.out.println("Cliente:  " + nome + " est� realizando o cadastro...");
	}
	void avaliarloja() {
		System.out.println("A cliente:"  + nome +  " Realizo uma avalia��o: Recomendo a loja irei voltar. ");
	}

}
