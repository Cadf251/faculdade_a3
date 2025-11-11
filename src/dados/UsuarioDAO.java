/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import modelos.Usuario;
import java.sql.Connection;

/**
 *
 * @author cadud
 */
public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO(){
        this.conn = new ConexaoDB().getConnection();
    }
    
    public void criarUsuario(Usuario usuario){       
        String query = "INSERT INTO usuarios (nome, email, celular, nascimento) ";
    }
}
