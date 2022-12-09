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
		// Generated using JFormDesigner Evaluation license - Victor
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
			Login.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
			(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing.border
			.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
			.Color.red),Login. getBorder()));Login. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void
			propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
			;}});

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
					.addGroup(GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
						.addContainerGap(415, Short.MAX_VALUE)
						.addGroup(LoginLayout.createParallelGroup()
							.addGroup(LoginLayout.createSequentialGroup()
								.addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(99, 99, 99))
							.addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(LoginLayout.createSequentialGroup()
								.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(37, 37, 37))
							.addComponent(passwordField1, GroupLayout.Alignment.TRAILING)
							.addComponent(textField2, GroupLayout.Alignment.TRAILING)
							.addComponent(textField1, GroupLayout.Alignment.TRAILING)
							.addComponent(button1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(LoginLayout.createSequentialGroup()
								.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(132, 132, 132))
							.addGroup(LoginLayout.createSequentialGroup()
								.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(37, 37, 37))
							.addGroup(LoginLayout.createSequentialGroup()
								.addComponent(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(13, 13, 13)))
						.addContainerGap(372, Short.MAX_VALUE))
			);
			LoginLayout.setVerticalGroup(
				LoginLayout.createParallelGroup()
					.addGroup(LoginLayout.createSequentialGroup()
						.addContainerGap(91, Short.MAX_VALUE)
						.addComponent(label4, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
						.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(textField1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(textField2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(2, 2, 2)
						.addComponent(passwordField1)
						.addGap(18, 18, 18)
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label6, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
						.addGap(129, 129, 129))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Victor
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
