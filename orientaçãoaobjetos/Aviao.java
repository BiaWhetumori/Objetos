package orienta��oaobjetos;
//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
//esta classe, em seguida crie um objeto avi�o, defina as instancias deste
//objeto e apresente as informa��es deste objeto no console.
public class Aviao {

	//Declara��o de vari�veis
	
		String nome;
		String modelo;
		int numero;
		
		
		//M�todos
		void estacionado() {
			System.out.println("O avi�o :  " + nome + " est� estacionado na pista.");
		}
		void decolar() {
			System.out.println("O avi�o "  + nome +  " Vai iniciar a decolagem a qualquer momento. ");
		}

	}
