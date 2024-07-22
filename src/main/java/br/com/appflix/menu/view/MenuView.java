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
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class MenuView {

	private JFrame frameMenu;
	private JLabel lblMenu_Date;
	private JPanel panelMenu_MenuBar_Modules;

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
		
		JLabel lblMenu_Welcome = new JLabel("Bem vindo, usuário(a)");
		lblMenu_Welcome.setForeground(new Color(207, 207, 207));
		lblMenu_Welcome.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		lblMenu_Welcome.setBounds(101, 13, 136, 14);
		panelMenu_Head.add(lblMenu_Welcome);
		
		JLabel lblMenu_Username = new JLabel("João");
		lblMenu_Username.setForeground(new Color(207, 207, 207));
		lblMenu_Username.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		lblMenu_Username.setBounds(236, 13, 148, 14);
		panelMenu_Head.add(lblMenu_Username);
		
		JPanel panelMenu_Main = new JPanel();
		panelMenu_Main.setBounds(0, 40, 914, 471);
		panelMenu_Full.add(panelMenu_Main);
		panelMenu_Main.setLayout(null);
		
		JLabel lblMenu_MenuPrincipal = new JLabel("menu principal");
		lblMenu_MenuPrincipal.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 16));
		lblMenu_MenuPrincipal.setBounds(29, 21, 104, 21);
		panelMenu_Main.add(lblMenu_MenuPrincipal);
		
		JLabel lblMenu_Separator_Main = new JLabel("");
		lblMenu_Separator_Main.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(192, 192, 192)));
		lblMenu_Separator_Main.setBounds(29, 47, 855, 1);
		panelMenu_Main.add(lblMenu_Separator_Main);
		
		JPanel panelMenu_MenuBar = new JPanel();
		panelMenu_MenuBar.setBounds(29, 53, 425, 407);
		panelMenu_Main.add(panelMenu_MenuBar);
		panelMenu_MenuBar.setLayout(null);
		
		JLabel lblMenu_IconRegister = new JLabel("");
		lblMenu_IconRegister.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblMenu_IconRegister.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu_IconRegister.setIcon(new ImageIcon(MenuView.class.getResource("/resources/img/menu-bar/register.png")));
		lblMenu_IconRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMenu_IconRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelMenu_MenuBar_Modules.setVisible(true);
			}
		});
		lblMenu_IconRegister.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblMenu_IconRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_IconRegister.setBounds(37, 29, 55, 49);
		panelMenu_MenuBar.add(lblMenu_IconRegister);
		
		JLabel lblMenu_Register = new JLabel("Cadastros");
		lblMenu_Register.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu_Register.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_Register.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblMenu_Register.setBounds(29, 78, 71, 14);
		panelMenu_MenuBar.add(lblMenu_Register);
		
		JLabel lblMenu_IconReports = new JLabel("");
		lblMenu_IconReports.setIcon(new ImageIcon(MenuView.class.getResource("/resources/img/menu-bar/reports.png")));
		lblMenu_IconReports.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu_IconReports.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMenu_IconReports.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblMenu_IconReports.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblMenu_IconReports.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_IconReports.setBounds(131, 29, 55, 49);
		panelMenu_MenuBar.add(lblMenu_IconReports);
		
		JLabel lblMenu_Reports = new JLabel("Relatórios");
		lblMenu_Reports.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu_Reports.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_Reports.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblMenu_Reports.setBounds(123, 78, 71, 14);
		panelMenu_MenuBar.add(lblMenu_Reports);
		
		panelMenu_MenuBar_Modules = new JPanel();
		panelMenu_MenuBar_Modules.setVisible(false);
		panelMenu_MenuBar_Modules.setBounds(459, 53, 425, 407);
		panelMenu_Main.add(panelMenu_MenuBar_Modules);
		panelMenu_MenuBar_Modules.setLayout(null);
		
		JLabel lblMenu_IconUserRegister = new JLabel("");
		lblMenu_IconUserRegister.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu_IconUserRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMenu_IconUserRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblMenu_IconUserRegister.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblMenu_IconUserRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_IconUserRegister.setBounds(53, 29, 55, 49);
		panelMenu_MenuBar_Modules.add(lblMenu_IconUserRegister);
		
		JLabel lblMenu_IconCustomerRegister = new JLabel("");
		lblMenu_IconCustomerRegister.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu_IconCustomerRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMenu_IconCustomerRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		JLabel lblMenu_UserRegister = new JLabel("Usuários");
		lblMenu_UserRegister.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu_UserRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_UserRegister.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblMenu_UserRegister.setBounds(45, 79, 71, 14);
		panelMenu_MenuBar_Modules.add(lblMenu_UserRegister);
		lblMenu_IconCustomerRegister.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblMenu_IconCustomerRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_IconCustomerRegister.setBounds(177, 29, 55, 49);
		panelMenu_MenuBar_Modules.add(lblMenu_IconCustomerRegister);
		
		JLabel lblMenu_IconSuppliersRegister = new JLabel("");
		lblMenu_IconSuppliersRegister.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu_IconSuppliersRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMenu_IconSuppliersRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		JLabel lblMenu_CustomerRegister = new JLabel("Clientes");
		lblMenu_CustomerRegister.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu_CustomerRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_CustomerRegister.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblMenu_CustomerRegister.setBounds(169, 79, 71, 14);
		panelMenu_MenuBar_Modules.add(lblMenu_CustomerRegister);
		lblMenu_IconSuppliersRegister.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblMenu_IconSuppliersRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_IconSuppliersRegister.setBounds(301, 29, 55, 49);
		panelMenu_MenuBar_Modules.add(lblMenu_IconSuppliersRegister);
		
		JLabel lblMenu_SuppliersRegister = new JLabel("Fornecedores");
		lblMenu_SuppliersRegister.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu_SuppliersRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_SuppliersRegister.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblMenu_SuppliersRegister.setBounds(293, 79, 71, 14);
		panelMenu_MenuBar_Modules.add(lblMenu_SuppliersRegister);
		
		updateDateLabel();
	}
	
	private void updateDateLabel() {
		String formatteDate = DateUtils.getCurrentDate();
		lblMenu_Date.setText(formatteDate);
	}
}
