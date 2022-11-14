package model;

public class Problema {
    private byte img;
    private String local;
    private String objeto;
    private String descriao;
    private String urgencia;
    private String status;
    //CONSTRUTOR
    public Problema(byte img, String local, String obj, String desc, String urgencia, String status){
        this.setImage(img);
        this.setLocal(local);
        this.setObj(obj);
        this.setDesc(desc);
        this.setUrgencia(urgencia);
        this.setStatus(status);
    }

    //SETTERS
    private void setStatus(String status2) {
        this.status = status2;
    }
    private void setUrgencia(String urgencia2) {
        this.urgencia = urgencia2;
    }
    private void setDesc(String desc) {
        this.descriao = desc;
    }
    private void setObj(String obj) {
        this.objeto = obj;
    }
    private void setLocal(String local2) {
        this.local = local2;
    }
    private void setImage(byte img2) {
        this.img = img2;
    }
    //GETTERS
    public byte getImg() {
		return img;
	}

	public String getLocal() {
		return local;
	}

	public String getObjeto() {
		return objeto;
	}

	public String getDescriao() {
		return descriao;
	}

	public String getUrgencia() {
		return urgencia;
	}

	public String getStatus() {
		return status;
	}
    

    //METODOS

    //toString

}
