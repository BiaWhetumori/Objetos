package orientaçãoaobjetos;
//2) Crie uma classe avião e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto avião, defina as instancias deste
//objeto e apresente as informações deste objeto no console.
public class Aviao {

	//Declaração de variáveis
	
		String nome;
		String modelo;
		int numero;
		
		
		//Métodos
		void estacionado() {
			System.out.println("O avião :  " + nome + " está estacionado na pista.");
		}
		void decolar() {
			System.out.println("O avião "  + nome +  " Vai iniciar a decolagem a qualquer momento. ");
		}

	}
