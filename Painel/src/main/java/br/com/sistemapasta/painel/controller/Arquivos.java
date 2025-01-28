package br.com.sistemapasta.painel.controller;

import br.com.sistemapasta.painel.model.Usuarios;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Álvaro
 */
public class Arquivos {
  
    Usuarios usuarios;
    
  //OutputStream serve para direcionar o arquivo que será manipulado (independente dele existir ou se ainda vai criar)
    OutputStream os;
  //OutputStreamWriter serve para direcionar os dados que serão armazenados no arquivo direcionado 
    OutputStreamWriter osw;
  //BufferedWriter joga os dados dentro do arquivo  
    BufferedWriter bw;
    
    public Arquivos(){
        
        try {
            os = new FileOutputStream ("cadastros.txt", true);
            osw = new OutputStreamWriter (os);
            bw = new BufferedWriter (osw);
        }
        
        catch (FileNotFoundException ex) {
            System.out.println ("Não encontrou o arquivo de texto");
        }
    
    }
    
    public void salvar(Usuarios usuarios) throws IOException{
       String dados = usuarios.getUsuario() + "," + usuarios.getSexo() + "," + usuarios.getIdade();
        bw.append(dados);
        bw.newLine();
        
        bw.close();
        os.close();
        osw.close();
    }
    
    public void ler (){
    
    }
    
    
}
