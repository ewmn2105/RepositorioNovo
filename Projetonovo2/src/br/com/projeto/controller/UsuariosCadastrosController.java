package br.com.projeto.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.projeto.controller.AcaoRController.listener;
import br.com.projeto.controller.LembrarSenhaController.lembraListener;
import br.com.projeto.model.bo.ADMBO;
import br.com.projeto.model.bo.CadastroBO;
import br.com.projeto.model.bo.LembrarSenhaBO;
import br.com.projeto.model.vo.CadastroVO;
import br.com.projeto.model.vo.GenerosVO;
import br.com.projeto.model.vo.LembrarSenhaVO;
import br.com.projeto.model.vo.LoginVO;
import br.com.projeto.view.CadastroView;
import br.com.projeto.view.LembrarSenhaView;
import br.com.projeto.view.TelaADMView;
import br.com.projeto.view.TelaRAcaoView;
import br.com.projeto.view.UsuariosCadastrosView;
import br.com.projeto.model.vo.ADMVO;
import br.com.projeto.model.dao.AcaoRDAO;
import br.com.projeto.model.dao.ConexaoDAO;
import br.com.projeto.model.dao.UsuariosCadastrosDAO;
	public class UsuariosCadastrosController {
		private UsuariosCadastrosView view;
		private ADMBO admBO;
		private ConexaoDAO conexao;
		private PreparedStatement statement;
		private ResultSet resultSet;
		private JTable table;
		private JScrollPane scrollTable;
		private UsuariosCadastrosDAO userDAO;
		public UsuariosCadastrosController (UsuariosCadastrosView view, Connection conexao) {
			this.view = view;
			this.userDAO = new UsuariosCadastrosDAO();
			view.addBtnPegaTxt(new listener());
			view.addBtnPegaTxt2(new listener2());
		}

		class listener implements MouseListener {

			@Override
			public void mouseClicked(MouseEvent e) {
				List<LoginVO> usuarios = userDAO.buscaUsuarios();
				view.tabela(usuarios);
			}		
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		class listener2 implements MouseListener {

			@Override
			public void mouseClicked(MouseEvent e) {
				String email = view.getAutor();
				List<LoginVO> usuarios = userDAO.buscaUsuariosEmail(email);
				view.tabela(usuarios);
			}		
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
	}