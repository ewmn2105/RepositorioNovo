package br.com.projeto.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.com.projeto.model.bo.LoginBO;
import br.com.projeto.model.vo.LoginVO;
import br.com.projeto.controller.*;
import javax.swing.Icon;

public class TelaADMView extends JFrame {
	private JLabel image2, image3;
	private JPanel p, p2, p3;
	private Container container;
	private ImageIcon i1, i2, i3;
	private Font fonte = new Font("Calibri", Font.BOLD, 30);
	private Font fonte1 = new Font("Calibri", Font.BOLD, 15);
	private Font fonte2 = new Font("Calibri", Font.BOLD, 27);
	private Font fonte3 = new Font("Calibri", Font.BOLD, 40);
	private Font fonte4 = new Font("Calibri", Font.BOLD, 12);
	private String contaCad;

	public TelaADMView() {
		inicializaComponentes();
	}

	public void inicializaComponentes() {
		setTitle("Acesso ADM");
		setBounds(0, 0, 1920, 1080);
		getContentPane().setBackground(new Color(230, 228, 242));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		i1 = new ImageIcon("Imagens/Fundo.jpg");
		i2 = new ImageIcon("Imagens/Fundo1.jpg");
		i3 = new ImageIcon("Imagens/read.png");
		image2 = new JLabel(i2);
		image3 = new JLabel(i3);
		p = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		container = getContentPane();
		image3.setBounds(95, -60, 390, 320);
		p.setBounds(90, 200, 500, 350);
		p2.setBounds(0, 130, 500, 5);
		p3.setBounds(920, 200, 500, 350);
		p.add(image2);
		//p3.add(image2);
		p2.setBackground(Color.black);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 64));
		panel.setBounds(58, 0, 2, 845);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setBounds(0, 50, 1540, 2);
		getContentPane().add(panel_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 128, 64));
		panel_6.setBounds(58, 150, 458, 2);
		getContentPane().add(panel_6);
		
		JLabel lblLogo = new JLabel(new ImageIcon("C:\\Users\\pwneg\\OneDrive\\Área de Trabalho\\MVC\\Projetonovo2\\Imagens\\LogoTela.png"));
		lblLogo.setBounds(70, 62, 93, 71);
		getContentPane().add(lblLogo);
		
		JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\pwneg\\OneDrive\\Área de Trabalho\\MVC\\Projetonovo2\\Imagens\\Login.png"));
		l1.setBounds(424, 150, 234, 213);
		getContentPane().add(l1);
		
		JLabel l1_1 = new JLabel(new ImageIcon("C:\\Users\\pwneg\\OneDrive\\Área de Trabalho\\MVC\\Projetonovo2\\Imagens\\Resumos.png"));
		l1_1.setBounds(113, 150, 234, 213);
		getContentPane().add(l1_1);
		
		JLabel l1_2 = new JLabel(new ImageIcon("C:\\Users\\pwneg\\OneDrive\\Área de Trabalho\\MVC\\Projetonovo2\\Imagens\\2919592.png"));
		l1_2.setBounds(769, 150, 234, 213);
		getContentPane().add(l1_2);
		
		JLabel l1_2_1 = new JLabel(new ImageIcon("C:\\Users\\pwneg\\OneDrive\\Área de Trabalho\\MVC\\Projetonovo2\\Imagens\\1530578.png"));
		l1_2_1.setBounds(1107, 150, 234, 213);
		getContentPane().add(l1_2_1);
		
		JLabel lblNewLabel = new JLabel("Resumos");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.PLAIN, 19));
		lblNewLabel.setBounds(194, 363, 82, 51);
		getContentPane().add(lblNewLabel);
		
		JLabel lblUsuriosCadastrados = new JLabel("Usuários Cadastrados");
		lblUsuriosCadastrados.setFont(new Font("Segoe UI Variable", Font.PLAIN, 19));
		lblUsuriosCadastrados.setBounds(455, 373, 191, 51);
		getContentPane().add(lblUsuriosCadastrados);
		
		JLabel lblEditarUsurio = new JLabel("Editar Usuário");
		lblEditarUsurio.setFont(new Font("Segoe UI Variable", Font.PLAIN, 19));
		lblEditarUsurio.setBounds(832, 373, 131, 51);
		getContentPane().add(lblEditarUsurio);
		
		JLabel lblExcluirUsurio = new JLabel("Excluir Usuário");
		lblExcluirUsurio.setFont(new Font("Segoe UI Variable", Font.PLAIN, 19));
		lblExcluirUsurio.setBounds(1166, 373, 131, 51);
		getContentPane().add(lblExcluirUsurio);
		
		JLabel Sair = new JLabel(new ImageIcon("C:\\Users\\pwneg\\OneDrive\\Área de Trabalho\\MVC\\Projetonovo2\\Imagens\\SaídaADM.png"));
		Sair.setBounds(113, 428, 234, 213);
		getContentPane().add(Sair);
		
		Sair.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
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
			
		});
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setFont(new Font("Segoe UI Variable", Font.PLAIN, 19));
		lblSair.setBounds(238, 653, 38, 51);
		getContentPane().add(lblSair);
		setVisible(true);
		
		l1_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					TelaRAcaoView view = new TelaRAcaoView();
					String url = "jdbc:mysql://localhost:3306/BD";
					Connection conexao = DriverManager.getConnection(url, "root", "root");
					AcaoRController controle = new AcaoRController(view, conexao);
					view.setVisible(true);
					view.setExtendedState(JFrame.MAXIMIZED_BOTH);
					}catch(SQLException sqle) {}
				
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
			
		});
	}

	

	public void mensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Usuário Removido", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mensagemErro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Remoção não realizada", JOptionPane.WARNING_MESSAGE);
	}
}