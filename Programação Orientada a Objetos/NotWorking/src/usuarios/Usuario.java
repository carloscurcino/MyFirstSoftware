package usuarios;

public class Usuario 
{
	private String nome;
	private int matricula;
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	public int getMatricula(){
		return this.matricula;
	}
	
	public void setMatricula(int M) {
		this.matricula = M;
	}
	
	public void TesteGetSet()
	{
		System.out.print("Nome: " + this.nome + "\nMatricula: " + this.matricula);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.nome + "\nMatricula: " + this.matricula;
	}
}
