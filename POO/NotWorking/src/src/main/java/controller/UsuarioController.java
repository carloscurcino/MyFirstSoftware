package controller;

import model.Usuario;

public class UsuarioController {
	
		public boolean cadastrarUser(String nome, String matricula, String senha, int serAdm) {
			if(nome != null && matricula != null && senha != null  && (AdmOrNo(matricula, serAdm) == 1)) {
					Usuario admin = new Usuario(nome, matricula, senha, serAdm);
					admin.cadastrarUser(admin);
					return true;
				}
			else if(nome != null && matricula != null && senha != null  && (AdmOrNo(matricula, serAdm) == 0)){
			    	Usuario user = new Usuario(nome, matricula, senha, serAdm);
			    	user.cadastrarUser(user);
			    	return true;
			}
			return false;
		}
		//Precisaremos definir uma matrícula para ADM
		public int AdmOrNo(String matricula, int serAdm) {
			if(matricula == "12345678") {
				serAdm = 1;
			}
			else if(matricula != "12345678") {
				serAdm = 0;
			}
			return serAdm;
		}
	}
	
	


