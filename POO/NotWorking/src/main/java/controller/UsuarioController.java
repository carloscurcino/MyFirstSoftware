package controller;

import model.Usuario;

public class UsuarioController {
	
		public boolean cadastrarUser(String nome, String matricula, String senha, boolean serAdm) {
			if(nome != null && matricula != null && senha != null  && serAdm == true) {
					Usuario admin = new Usuario(nome, matricula, senha, serAdm);
					admin.cadastrarUser(admin);
					return true;
				}
			else if(nome != null && matricula != null && senha != null  && serAdm == false){
			    	Usuario user = new Usuario(nome, matricula, senha, serAdm);
			    	user.cadastrarUser(user);
			    	return true;
			}
			return false;
		}
		/*public void AdmOrNo(int matricula, boolean serAdm) {
			if( ) {
				return true;
			}
			else if) {
				return false;
			}
		}*/
	}
	
	


