package avFormativa.desafios;

public class Objetos1 {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa ();
		Pessoa pessoa2 = new Pessoa ();
		
		pessoa.setNome("Tom Cruise");
		pessoa.setIdade(60);
		pessoa.setEndereco("California, USA");
		pessoa.setProfissao("Ator");
		
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de futebol");
		
		System.out.println("");
		System.out.println("nome: " + pessoa.getNome());
		System.out.println("idade: " + pessoa.getIdade());
		System.out.println("endereço: " + pessoa.getEndereco());
		System.out.println("profissão: " + pessoa.getProfissao());
		
		System.out.println("");
		System.out.println("nome: " + pessoa2.getNome());
		System.out.println("idade: " + pessoa2.getIdade());
		System.out.println("endereço: " + pessoa2.getEndereco());
		System.out.println("profissão: " + pessoa2.getProfissao());
	}

}
