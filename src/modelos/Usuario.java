package modelos;

import java.sql.Date;

/**
 * Modelo de usuario para ser instanciado e passado no dados.UsuarioDAO
 * 
 * @author cadud
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String celular;
    private Date nascimento;
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
        
    public void setEmail(String email){
        this.email = email;
    }
            
    public void setCelular(String celular){
        this.celular = celular;
    }
    
    public void setNascimento(Date nasc){
        this.nascimento = nasc;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getCelular(){
        return this.celular;
    }
    
    public Date getNascimento(){
        return this.nascimento;
    }
}
