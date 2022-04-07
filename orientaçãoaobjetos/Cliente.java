package orientaçãoaobjetos;
//1) Crie uma classe cliente e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.
	
public class Cliente {
	 //Declaração de variáveis
	
	String nome;
	String endereco;
	int idade;
	
	
	//Métodos
	void cadastro() {
		System.out.println("Cliente:  " + nome + " está realizando o cadastro...");
	}
	void avaliarloja() {
		System.out.println("A cliente:"  + nome +  " Realizo uma avaliação: Recomendo a loja irei voltar. ");
	}

}
