package aplicativo;
import infra.Conection;
import usuarios.Usuario;

public class App{
    public static void main(String[] args) {
    	Usuario u1 = new Usuario();
    	Conection con = new Conection();
    	 u1.setMatricula(202210);
    	// u1.setNome("Victor Mateus");
    	// u1.TesteGetSet();
		// System.out.println('\n'+u1.toString());
		con.getConexao();
    }

}

/*Notas: Metódos Get e Set e variaveis privadas, pois, as informações dos usuários serão privadas e mutavéis apenas por eles mesmo.
 * E método teste para verificar se o set e get funcionam corretamente.*/
 
