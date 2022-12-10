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
public class Cad{
	public Cad() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
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
			test.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
			. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax
			. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
			12 ), java. awt. Color. red) ,test. getBorder( )) ); test. addPropertyChangeListener (new java. beans
			. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .
			getPropertyName () )) throw new RuntimeException( ); }} );

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
						.addGap(331, 331, 331)
						.addGroup(testLayout.createParallelGroup()
							.addGroup(testLayout.createParallelGroup()
								.addComponent(label4, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
								.addComponent(label1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
								.addComponent(passwordField1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
								.addComponent(textField2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
								.addComponent(textField1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
								.addComponent(button1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
								.addComponent(label2, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
								.addGroup(testLayout.createSequentialGroup()
									.addComponent(label5, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
									.addGap(0, 0, Short.MAX_VALUE)))
							.addGroup(testLayout.createSequentialGroup()
								.addComponent(label3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
								.addGap(183, 183, 183)))
						.addGap(290, 290, 290))
			);
			testLayout.setVerticalGroup(
				testLayout.createParallelGroup()
					.addGroup(testLayout.createSequentialGroup()
						.addGap(116, 116, 116)
						.addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
						.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
						.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(textField2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(passwordField1)
						.addGap(18, 18, Short.MAX_VALUE)
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(142, 142, 142))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
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
		frame.setContentPane(new Cad().test);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}