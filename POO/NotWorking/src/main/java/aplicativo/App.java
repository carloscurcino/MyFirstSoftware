package aplicativo;

import model.Conection;
import view.cad;


public class App {
public static void main(String[] args) {
    Conection con = new Conection();
		con.getConexao();
    //cad.run();
}

}

/*Notas: Metódos Get e Set e variaveis privadas, pois, as informações dos usuários serão privadas e mutavéis apenas por eles mesmo.
 * E método teste para verificar se o set e get funcionam corretamente.*/
 
