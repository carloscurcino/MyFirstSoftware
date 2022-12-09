package model;

public class Usuario 
{
	private String nome;
	private String matricula;
	private String senha;
	private int serAdm = 0;

	//CONSTRUTORES
	public Usuario(String nome, String matricula, String senha, int serAdm){
		this.setNome(nome);
	}

	//SETTERS
	public void setNome(String n) {
		this.nome = n;
	}
	public void setMatricula(String M) {
		this.matricula = M;
	}
	public void setSenha(String senha){
		this.senha = senha;
	}

	public void setSerAdm(int serAdm) {
		this.serAdm = serAdm;
	}

	//GETTERS
	public String getNome(){
		return this.nome;
	}
	public String getMatricula(){
		return this.matricula;
	}
	public int getSerAdm() {
		return serAdm;
	}
	public String getSenha() {
		return this.senha;
	}

	//METODOS
	public void adicionarFoto(){
		System.out.println("adicionando foto");
	}
	public void enviarProblema(Problema problema){
		System.out.println("enviando problema");
	}
	public void cadastrarUser(Usuario Usuario) {
		
	}

}
