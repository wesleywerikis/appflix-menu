package br.com.appflix.menu.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import br.com.appflix.menu.util.DateUtils;

import javax.swing.SwingConstants;
import java.awt.Font;

public class MenuView {

	private JFrame frameMenu;
	private JLabel lblMenu_Date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView window = new MenuView();
					window.frameMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMenu = new JFrame();
		frameMenu.setTitle("Appflix · Menu");
		frameMenu.setBounds(100, 100, 930, 550);
		frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenu.getContentPane().setLayout(null);
		
		JPanel panelMenu_Full = new JPanel();
		panelMenu_Full.setBackground(new Color(57, 62, 70));
		panelMenu_Full.setBounds(0, 0, 914, 511);
		frameMenu.getContentPane().add(panelMenu_Full);
		panelMenu_Full.setLayout(null);
		
		JPanel panelMenu_Head = new JPanel();
		panelMenu_Head.setBackground(new Color(57, 62, 70));
		panelMenu_Head.setBounds(0, 0, 914, 40);
		panelMenu_Full.add(panelMenu_Head);
		panelMenu_Head.setLayout(null);
		
		lblMenu_Date = new JLabel("");
		lblMenu_Date.setForeground(new Color(207, 207, 207));
		lblMenu_Date.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		lblMenu_Date.setBounds(10, 13, 78, 14);
		panelMenu_Head.add(lblMenu_Date);
		
		JLabel lblMenu_Separator = new JLabel("|");
		lblMenu_Separator.setForeground(new Color(207, 207, 207));
		lblMenu_Separator.setBounds(90, 13, 10, 14);
		panelMenu_Head.add(lblMenu_Separator);
		
		JLabel lblMenu_Welcome = new JLabel("Bem vindo");
		lblMenu_Welcome.setForeground(new Color(207, 207, 207));
		lblMenu_Welcome.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		lblMenu_Welcome.setBounds(101, 13, 72, 14);
		panelMenu_Head.add(lblMenu_Welcome);
		
		JLabel lblMenu_Username = new JLabel("");
		lblMenu_Username.setForeground(new Color(207, 207, 207));
		lblMenu_Username.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		lblMenu_Username.setBounds(175, 13, 148, 14);
		panelMenu_Head.add(lblMenu_Username);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 40, 914, 471);
		panelMenu_Full.add(panel);
		
		updateDateLabel();
	}
	
	private void updateDateLabel() {
		String formatteDate = DateUtils.getCurrentDate();
		lblMenu_Date.setText(formatteDate);
	}
}
