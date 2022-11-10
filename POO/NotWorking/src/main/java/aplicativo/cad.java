package aplicativo;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Wed Nov 09 21:29:06 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class cad {
	public cad() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
		test = new JPanel();
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		button1 = new JButton();
		label3 = new JLabel();
		passwordField1 = new JPasswordField();
		label4 = new JLabel();

		//======== test ========
		{
			test.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
			. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder
			. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .
			awt .Font .BOLD ,12 ), java. awt. Color. red) ,test. getBorder( )) )
			; test. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
			) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
			;

			//---- label1 ----
			label1.setText("Nome:");

			//---- label2 ----
			label2.setText("Matricula:");

			//---- button1 ----
			button1.setText("Cadastrar");
			button1.setBackground(Color.blue);
			button1.setForeground(Color.white);

			//---- label3 ----
			label3.setText("Senha:");

			//---- label4 ----
			label4.setText("NotWorking");
			label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD, label4.getFont().getSize() + 20f));
			label4.setForeground(Color.blue);

			GroupLayout testLayout = new GroupLayout(test);
			test.setLayout(testLayout);
			testLayout.setHorizontalGroup(
				testLayout.createParallelGroup()
					.addGroup(testLayout.createSequentialGroup()
						.addContainerGap(400, Short.MAX_VALUE)
						.addGroup(testLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.TRAILING, testLayout.createSequentialGroup()
								.addGroup(testLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addComponent(label1, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
									.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
									.addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField2, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
									.addComponent(label3, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
									.addComponent(button1, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
									.addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
								.addGap(395, 395, 395))
							.addGroup(GroupLayout.Alignment.TRAILING, testLayout.createSequentialGroup()
								.addComponent(label4)
								.addGap(372, 372, 372))))
			);
			testLayout.setVerticalGroup(
				testLayout.createParallelGroup()
					.addGroup(testLayout.createSequentialGroup()
						.addGap(128, 128, 128)
						.addComponent(label4)
						.addGap(35, 35, 35)
						.addComponent(label1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(label2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label3)
						.addGap(2, 2, 2)
						.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(221, Short.MAX_VALUE))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
	private JPanel test;
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JButton button1;
	private JLabel label3;
	private JPasswordField passwordField1;
	private JLabel label4;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new cad().test);
		frame.setSize(1440, 900);
		frame.setVisible(true);
	}
}
