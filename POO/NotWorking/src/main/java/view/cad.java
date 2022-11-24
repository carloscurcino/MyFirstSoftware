package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Wed Nov 09 21:29:06 BRT 2022
 */

import model.BusinesRule;



/**
 * @author carlosdanielf541@gmail.com
 */
public class cad implements BusinesRule{
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
		label5 = new JLabel();

		//======== test ========
		{
			test.setBackground(Color.white);
			test.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
			javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
			. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
			.awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
			. Color. red) ,test. getBorder( )) ); test. addPropertyChangeListener (new java. beans.
			PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
			equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

			//---- label1 ----
			label1.setText("Nome:");

			//---- label2 ----
			label2.setText("Matricula:");

			//---- button1 ----
			button1.setText("Cadastrar");
			button1.setBackground(new Color(0x399ab9));

			//---- label3 ----
			label3.setText("Senha:");

			//---- label4 ----
			label4.setText("Cadastre-se");
			label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD, label4.getFont().getSize() + 20f));

			//---- label5 ----
			label5.setText("J\u00e1 possui conta? Entre agora");

			GroupLayout testLayout = new GroupLayout(test);
			test.setLayout(testLayout);
			testLayout.setHorizontalGroup(
				testLayout.createParallelGroup()
					.addGroup(testLayout.createSequentialGroup()
						.addGap(345, 345, 345)
						.addGroup(testLayout.createParallelGroup()
							.addGroup(testLayout.createSequentialGroup()
								.addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(40, 40, 40))
							.addGroup(testLayout.createSequentialGroup()
								.addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(14, 14, 14))
							.addGroup(testLayout.createSequentialGroup()
								.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(37, 37, 37))
							.addGroup(testLayout.createSequentialGroup()
								.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(37, 37, 37))
							.addComponent(passwordField1, GroupLayout.Alignment.TRAILING)
							.addComponent(textField2, GroupLayout.Alignment.TRAILING)
							.addComponent(textField1, GroupLayout.Alignment.TRAILING)
							.addComponent(button1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(testLayout.createSequentialGroup()
								.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(132, 132, 132)))
						.addGap(362, 362, 362))
			);
			testLayout.setVerticalGroup(
				testLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, testLayout.createSequentialGroup()
						.addGap(113, 113, 113)
						.addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(33, 33, 33)
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
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(146, 146, 146))
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
	private JLabel label5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new cad().test);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}