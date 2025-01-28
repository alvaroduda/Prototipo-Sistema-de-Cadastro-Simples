package br.com.sistemapasta.painel.model;

/**
 *
 * @author Álvaro
 */
public class Usuarios {
    private String usuario;
    private String senha;
    private String sexo;
    private int idade; 
    
    public Usuarios(){
    usuario = "";
    senha = "";
    sexo = "";
    idade = 0;
    }
    
    public Usuarios (String usuario, String senha, String sexo, int idade) {
    this.usuario = usuario;
    this.senha = senha;
    this. sexo = sexo;
    this.idade = idade;       
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
