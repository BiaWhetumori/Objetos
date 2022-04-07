package orientaçãoaobjetos;

public class Avião02 {

	public static void main(String[] args) {
		Aviao a = new Aviao();
		
		a.nome = "Zeus";
		a.modelo = "ABC";
		a.numero = 997;
		
		System.out.println();
		System.out.println("Nome:" + a.nome);
		System.out.println("Modelo: " + a.modelo );
		System.out.println("Numero: " + a.numero);
		
		a.estacionado();
		
		System.out.println();
		System.out.println("Nome:" + a.nome);
		System.out.println("Modelo: " + a.modelo);
		System.out.println("Numero: " + a.numero);
		
		System.out.println();
		a.decolar();
		
		

	}

}
