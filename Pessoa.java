package poo;

public class Pessoa {

	public static void main(String[] args) {
		//Criando objetos da classe pessoa
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		//Objeto 1
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California, USA");
		pessoa1.setProfissao("Ator");

		//Objeto 2
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami,USA");
		pessoa2.setProfissao("Jogador de futebol");

		//Chamando o método get() para apresentar o resultado
		System.out.println("----- OBJETO 1 -----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());

		System.out.println("----- OBJETO 2 -----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
	}
	String nome;
	int idade;
	String endereco;
	String profissao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
