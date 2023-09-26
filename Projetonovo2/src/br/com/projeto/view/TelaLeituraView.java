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
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class TelaLeituraView extends JFrame {
	public TelaLeituraView() {
		JFrame frame = new JFrame("Visualização");
		frame.getContentPane().setBackground(new Color(230, 228, 242));
		frame.setBounds(487, 185, 744, 571);
		frame.getContentPane().setLayout(null);
		
		JScrollPane pane1 = new JScrollPane((Component) null);
		pane1.setBounds(69, 159, 590, 365);
		frame.getContentPane().add(pane1);
		
		JTextArea textArea = new JTextArea();
		//textArea.setText(Resumo);
		textArea.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		pane1.setViewportView(textArea);
		
		JLabel sair2 = new JLabel(new ImageIcon("C:\\Users\\pwneg\\OneDrive\\Área de Trabalho\\MVC\\Projetonovo2\\Imagens\\Sair.png"));
		sair2.setBounds(590, 8, 130, 113);
		frame.getContentPane().add(sair2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setBounds(0, 131, 1540, 2);
		frame.getContentPane().add(panel_1);
		
		sair2.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

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
		
		frame.setVisible(true);
		
		
	}
	}
