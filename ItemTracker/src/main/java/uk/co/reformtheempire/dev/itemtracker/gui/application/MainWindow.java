package uk.co.reformtheempire.dev.itemtracker.gui.application;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MainWindow {

	private JFrame mainFrame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setResizable(false);
		mainFrame.setTitle("Item Tracker - [Version]");
		mainFrame.setBounds(100, 100, 677, 381);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBounds(527, 0, 145, 360);

		JButton newLoanButton = new JButton("New Loan");

		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton administratorButton = new JButton("Administrator");

		JButton printButton = new JButton("Print");

		JTextPane welcomePane = new JTextPane();
		welcomePane
				.setText("Welcome, [Username],\n\nYou have [x] number of devices on loan,\n[x] of which are overdue.");
		welcomePane.setBackground(SystemColor.window);

		JButton btnSettings = new JButton("Profile");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup().addGap(6)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(printButton, GroupLayout.DEFAULT_SIZE, 127,
																Short.MAX_VALUE)
														.addContainerGap())
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(btnSettings, GroupLayout.DEFAULT_SIZE, 127,
																Short.MAX_VALUE)
														.addContainerGap())
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(administratorButton, GroupLayout.PREFERRED_SIZE,
																128, Short.MAX_VALUE)
														.addGap(5))))
								.addGroup(Alignment.LEADING,
										gl_panel.createSequentialGroup().addGap(6)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(searchButton, Alignment.TRAILING,
																GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
														.addComponent(newLoanButton, Alignment.TRAILING,
																GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
												.addContainerGap())))
				.addGroup(gl_panel.createSequentialGroup().addGap(14)
						.addComponent(welcomePane, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(26, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(searchButton)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(newLoanButton).addGap(18)
						.addComponent(welcomePane, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
						.addGap(1).addComponent(printButton).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnSettings).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(administratorButton).addContainerGap(23, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		mainFrame.getContentPane().setLayout(null);

		JLabel titleLabel = new JLabel("Devices on loan: [Active Loans]");
		titleLabel.setBounds(10, 6, 254, 21);
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		mainFrame.getContentPane().add(titleLabel);
		mainFrame.getContentPane().add(panel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 30, 517, 323);
		mainFrame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
