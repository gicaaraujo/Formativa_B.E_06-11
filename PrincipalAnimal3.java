package avFormativa.desafios;

public class PrincipalAnimal3 {

	public static void main(String[] args) {
		
		Lobo2 lobo2 = new Lobo2("Thor", "M", "Husky Siberiano");
		System.out.println("Lobo: ");
		System.out.println("Nome: " + lobo2.getNome());
		System.out.println("Sexo: " + lobo2.getSexo());
		System.out.println("Raça: " + lobo2.getRaca());
		lobo2.emitirSom();
		lobo2.correr();
		lobo2.caminhar();
		lobo2.dormir();
		
		Leao leao = new	Leao("Simba", "M", "Leão-do-Congo");
		System.out.println("\nLeão: ");
		System.out.println("Nome: " + leao.getNome());
		System.out.println("Sexo: " + leao.getSexo());
		System.out.println("Raça: " + leao.getRaca());
		leao.emitirSom();
		leao.correr();
		leao.caminhar();
		leao.dormir();
		
	}

}