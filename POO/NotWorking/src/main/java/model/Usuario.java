package model;

public class Usuario 
{
	private String nome;
	private String matricula;
	private String senha;
	private boolean serAdm = false;

	//CONSTRUTORES
	public Usuario(String nome, String matricula, String senha, boolean serAdm){
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
	//GETTERS
	public String getNome(){
		return this.nome;
	}
	public String getMatricula(){
		return this.matricula;
	}
	
	//METODOS
	public void adicionarFoto(){
		System.out.println("adicionando foto");
	}
	public <Problema> void enviarProblema(Problema problema){
		System.out.println("enviando problema");
	}
	public void cadastrarUser(Usuario admin) {
		System.out.println(admin);
	}
	}
	

