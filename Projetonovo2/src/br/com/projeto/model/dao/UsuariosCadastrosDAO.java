package br.com.projeto.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto.model.vo.GenerosVO;
import br.com.projeto.model.vo.LoginVO;

public class UsuariosCadastrosDAO {
	private Connection conexao;
	private String url = "jdbc:mysql://localhost:3306/BD";
	public List<LoginVO> buscaUsuarios() {
		List<LoginVO> usuarios = new ArrayList<>();
		 try {
	    	 Connection conexao = DriverManager.getConnection(url, "root", "root");
	    	 String sql = "SELECT nome, email FROM Usuarios";
    		 PreparedStatement statement = conexao.prepareStatement(sql);
    		 ResultSet resultado = statement.executeQuery();
    		 while(resultado.next()) {
    			 String coluna1 = resultado.getString("nome");
    			 String coluna2 = resultado.getString("email");
    			 LoginVO lgvo = new LoginVO();
    			 lgvo.setNome(coluna1);
    			 lgvo.setEmail(coluna2);
    			 usuarios.add(lgvo);
    		 }
	    } catch (SQLException slcte) {
	        return null;
	    }
		 return usuarios;
	}
}
