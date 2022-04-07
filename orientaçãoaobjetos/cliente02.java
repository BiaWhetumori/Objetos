package orientaçãoaobjetos;

public class cliente02 {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		
		c.nome = "Bella";
		c.endereco ="Rua Lucas";
		c.idade = 21;
		
		System.out.println();
		System.out.println("Nome:" + c.nome);
		System.out.println("Endereço: " + c.endereco);
		System.out.println("Idade: " + c.idade);
		
		c.cadastro();
		
		System.out.println();
		System.out.println("Nome:" + c.nome);
		System.out.println("Endereço: " + c.endereco);
		System.out.println("Idade: " + c.idade);
		
		System.out.println();
		c.avaliarloja();
		
		

	}

}
