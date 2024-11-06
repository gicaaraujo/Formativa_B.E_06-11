package avFormativa.desafios;

public class PrincipalPessoa3 {

	public static void main(String[] args) {
		//Criando Pessoa
		Pessoa3 pessoa = new Pessoa3 ("Giovana Araujo", "(15) 99835-1934 ");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());


		//Criando PessoaFisica
		PessoaFisica pessoaFisica = new PessoaFisica ("Isabella Kimberly", "(15) 99871-2029", "47801553802", "1505664523");
		System.out.println("\nPessoa física: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
}
}