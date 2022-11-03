package app;

import usuarios.Usuario;

public class App
{
    public static void main(String[] args)
    {
    	Usuario u1 = new Usuario();
    	
    	u1.setMatricula(202210);
    	u1.setNome("Victor Mateus");
    	u1.TesteGetSet();
    }

}

/*Notas: Metódos Get e Set e variaveis privadas, pois, as informações dos usuários serão privadas e mutavéis apenas por eles mesmo.
 * E método teste para verificar se o set e get funcionam corretamente.*/
 
