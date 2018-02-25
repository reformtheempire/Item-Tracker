package uk.co.reformtheempire.dev.itemtracker.gui.utility;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LoginWindow extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9042304114137159399L;
	private final JPanel contentPanel = new JPanel();
	private JTextField usernameBox;
	private JPasswordField passwordBox;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JButton btnCancel;
	private JButton btnLogin;
	private JButton btnForgotPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginWindow dialog = new LoginWindow();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginWindow() {
		setResizable(false);
		setBounds(100, 100, 436, 253);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblNewLabel_1 = new JLabel("Item Tracker");
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 29));
		}
		{
			lblNewLabel_2 = new JLabel("Version: [VersionID]");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		}
		{
			lblUsername = new JLabel("Username:");
			lblUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			lblUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		}
		{
			lblPassword = new JLabel("Password:");
			lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		}
		{
			usernameBox = new JTextField();
			usernameBox.setColumns(10);
		}
		{
			passwordBox = new JPasswordField();
			passwordBox.setColumns(10);
		}
		{
			btnLogin = new JButton("Login");
		}
		{
			btnCancel = new JButton("Cancel");
		}
		{
			btnForgotPassword = new JButton("Forgot Password");
		}
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(65)
					.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(usernameBox, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(65)
					.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(passwordBox, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(181)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(94)
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(12)
					.addComponent(btnForgotPassword, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(27)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addGap(33)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(4)
							.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addComponent(usernameBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(4)
							.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addComponent(passwordBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCancel)
						.addComponent(btnLogin))
					.addGap(3)
					.addComponent(btnForgotPassword))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JLabel lblNewLabel = new JLabel("Copyright ReformTheEmpire 2018 - Present");
				lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
				buttonPane.add(lblNewLabel);
			}
		}
	}
}
