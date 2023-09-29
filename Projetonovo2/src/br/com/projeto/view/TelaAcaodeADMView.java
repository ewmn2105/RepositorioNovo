package br.com.projeto.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class TelaAcaodeADMView extends JFrame {
	private String nome;
	private String senha;
	private String email;
	private JLabel exclusao;
	private JTextArea textArea;
	
	public TelaAcaodeADMView(String nome, String senha, String email) {
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		inicializarComponentes();
	}
	public void inicializarComponentes() {
		getContentPane().setBackground(new Color(230, 228, 242));
		setBounds(487, 185, 744, 571);
		getContentPane().setLayout(null);
		
		exclusao = new JLabel(new ImageIcon("C:\\Users\\pwneg\\OneDrive\\Área de Trabalho\\MVC\\Projetonovo2\\Imagens\\1530578.png"));
		exclusao.setToolTipText("Pesquisar Resumo");
		exclusao.setBounds(565, 310, 100, 102);
		getContentPane().add(exclusao);
		
		JScrollPane pane1 = new JScrollPane((Component) null);
		pane1.setBounds(206, 194, 296, 49);
		getContentPane().add(pane1);
		
		textArea = new JTextArea();
		textArea.setText(email);
		textArea.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		pane1.setViewportView(textArea);
		
		JLabel sair2 = new JLabel(new ImageIcon("C:\\Users\\pwneg\\OneDrive\\Área de Trabalho\\MVC\\Projetonovo2\\Imagens\\Sair.png"));
		sair2.setBounds(590, 8, 130, 113);
		getContentPane().add(sair2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setBounds(0, 131, 1540, 2);
		getContentPane().add(panel_1);
		
		JScrollPane pane1_1 = new JScrollPane((Component) null);
		pane1_1.setBounds(206, 289, 296, 49);
		getContentPane().add(pane1_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText(nome);
		textArea_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		pane1_1.setViewportView(textArea_1);
		
		JScrollPane pane1_1_1 = new JScrollPane((Component) null);
		pane1_1_1.setBounds(206, 383, 296, 49);
		getContentPane().add(pane1_1_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setText(senha);
		textArea_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		pane1_1_1.setViewportView(textArea_1_1);
		
		JLabel edição = new JLabel(new ImageIcon("C:\\Users\\pwneg\\OneDrive\\Área de Trabalho\\MVC\\Projetonovo2\\Imagens\\novopencil.png"));
		edição.setToolTipText("Pesquisar Resumo");
		edição.setBounds(565, 197, 100, 102);
		getContentPane().add(edição);
		
		JLabel lblNewLabel = new JLabel("E-mail");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.PLAIN, 17));
		lblNewLabel.setBounds(332, 171, 54, 21);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Segoe UI Variable", Font.PLAIN, 17));
		lblNome.setBounds(332, 266, 54, 13);
		getContentPane().add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Segoe UI Variable", Font.PLAIN, 17));
		lblSenha.setBounds(332, 360, 54, 13);
		getContentPane().add(lblSenha);
		
		setVisible(true);		
	}
	public void excluir(MouseListener listener) {
		exclusao.addMouseListener(listener);
	}
	public String getEmail() {
		return textArea.getText();
	}
	public void mensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	public void mensagemErro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
}