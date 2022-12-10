package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Mon Nov 21 23:02:40 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class Login extends JPanel {
	public Login() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
		Login = new JPanel();
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		button1 = new JButton();
		label3 = new JLabel();
		passwordField1 = new JPasswordField();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();

		//======== Login ========
		{
			Login.setBackground(Color.white);
			Login.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
			EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing
			.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
			java.awt.Color.red),Login. getBorder()));Login. addPropertyChangeListener(new java.beans.PropertyChangeListener()
			{@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))
			throw new RuntimeException();}});

			//---- label1 ----
			label1.setText("Nome:");

			//---- textField1 ----
			textField1.setBackground(new Color(0xd9d9d9));

			//---- label2 ----
			label2.setText("Matricula:");

			//---- textField2 ----
			textField2.setBackground(new Color(0xd9d9d9));

			//---- button1 ----
			button1.setText("Entrar");
			button1.setBackground(new Color(0x399ab9));

			//---- label3 ----
			label3.setText("Senha:");

			//---- passwordField1 ----
			passwordField1.setBackground(new Color(0xd9d9d9));

			//---- label4 ----
			label4.setText("NotWorking");
			label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD, label4.getFont().getSize() + 20f));

			//---- label5 ----
			label5.setText("Esqueceu senha?");

			//---- label6 ----
			label6.setText("N\u00e3o possui conta? Crie agora");

			GroupLayout LoginLayout = new GroupLayout(Login);
			Login.setLayout(LoginLayout);
			LoginLayout.setHorizontalGroup(
				LoginLayout.createParallelGroup()
					.addGroup(LoginLayout.createSequentialGroup()
						.addContainerGap(417, Short.MAX_VALUE)
						.addGroup(LoginLayout.createParallelGroup()
							.addGroup(LoginLayout.createSequentialGroup()
								.addComponent(label4, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
								.addGap(0, 350, Short.MAX_VALUE))
							.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
							.addGroup(LoginLayout.createSequentialGroup()
								.addGroup(LoginLayout.createParallelGroup()
									.addGroup(LoginLayout.createSequentialGroup()
										.addGroup(LoginLayout.createParallelGroup()
											.addComponent(label5, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
											.addComponent(label6, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
											.addComponent(button1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
											.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
										.addGap(0, 334, Short.MAX_VALUE))
									.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap())))
			);
			LoginLayout.setVerticalGroup(
				LoginLayout.createParallelGroup()
					.addGroup(LoginLayout.createSequentialGroup()
						.addContainerGap(95, Short.MAX_VALUE)
						.addComponent(label4, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
						.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label6, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
						.addContainerGap(122, Short.MAX_VALUE))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
	private JPanel Login;
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JButton button1;
	private JLabel label3;
	private JPasswordField passwordField1;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new Login().Login);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}
