package model;

import java.nio.file.Path;

public class Problema{
    private String nome;
    private String lugar;
    private String urgencia;
    private String status;
    private String objeto;
    private String descricao;
    private Path img;


    //GETTERS
    public String getNome() {
        return this.nome;
    }
    public String getLugar() {
        return this.lugar;
    }
    public String getUrgencia() {
        return this.urgencia;
    }
    public String getStatus() {
        return this.status;
    }
    public String getObjeto() {
        return this.objeto;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public Path getImg() {
        return this.img;
    }

    //SETTERS



    //METODOS
    public void adicionarImg(Path img){
        this.img = img;
    }
    
    public void acao(String actionCommand) {

    }
}