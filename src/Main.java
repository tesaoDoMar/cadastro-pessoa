public class Main {
	
			public static void main(String[] args) 
			{

			Pessoa pessoa1 = new Pessoa("Joana", 23, "Feminino");

			Pessoa pessoa2 = new Pessoa("Felipe", 20, "Masculino");
			
			Pessoa pessoa3 = new Pessoa("Nati", 16, "Indefinido");
			
			Endereco endereco1 = new Endereco("Brejaru", "Rua Rafael Sap�o", 648);
			
			Endereco endereco2 = new Endereco("Ponte do Imaruim", "Rua da Casa Amarela", 258);
			
			Endereco endereco3 = new Endereco("Ro�ado", "Rua Nilo Morfin", 1);
			
			
			System.out.println("O nome da pessoa1 � " + pessoa1.getNome() + ", ela tem " + pessoa1.getIdade() + " anos e � do sexo: " + pessoa1.getSexo() + ". " + "Ela mora no bairro: " + endereco1.getBairro() + ", na rua: " + endereco1.getRua() + " N#" + endereco1.getNumero());
			System.out.println("O nome da pessoa2 � " + pessoa2.getNome() + ", ela tem " + pessoa2.getIdade() + " anos e � do sexo: " + pessoa2.getSexo() + ". " + "Ela mora no bairro: " + endereco2.getBairro() + ", na rua: " + endereco2.getRua() + " N#" + endereco2.getNumero());
			System.out.println("O nome da pessoa3 � " + pessoa3.getNome() + ", ela tem " + pessoa3.getIdade() + " anos e � do sexo: " + pessoa3.getSexo() + ". " + "Ela mora no bairro: " + endereco3.getBairro() + ", na rua: " + endereco3.getRua() + " N#" + endereco3.getNumero());
			}	
	}


