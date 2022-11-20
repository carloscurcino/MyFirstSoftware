package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Fri Nov 18 04:17:03 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class EnviarProblema extends JPanel {
	public EnviarProblema() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
		textArea1 = new JTextArea();
		label1 = new JLabel();
		textArea2 = new JTextArea();
		textArea3 = new JTextArea();
		textArea4 = new JTextArea();
		textArea5 = new JTextArea();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		button1 = new JButton();
		label6 = new JLabel();

		//======== this ========
		setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
		. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax
		. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
		12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
		. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
		getPropertyName () )) throw new RuntimeException( ); }} );

		//---- label1 ----
		label1.setText("Enviar Problema");
		label1.setFont(new Font("Segoe UI", Font.PLAIN, 28));

		//---- label2 ----
		label2.setText("Titulo");

		//---- label3 ----
		label3.setText("Local");

		//---- label4 ----
		label4.setText("Objeto");

		//---- label5 ----
		label5.setText("Urg\u00eancia");

		//---- button1 ----
		button1.setText("Enviar");
		button1.setBackground(new Color(0x399ab9));

		//---- label6 ----
		label6.setText("Adicionar descri\u00e7\u00e3o:");

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
							.addGap(85, 85, 85)
							.addGroup(layout.createParallelGroup()
								.addComponent(textArea1, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE)
								.addComponent(button1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
								.addComponent(label6))
							.addGap(28, 28, 28)
							.addGroup(layout.createParallelGroup()
								.addComponent(textArea5, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
								.addComponent(textArea3, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
								.addComponent(textArea4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup()
										.addComponent(label3)
										.addComponent(label5)
										.addComponent(label4))
									.addGap(0, 165, Short.MAX_VALUE))))
						.addGroup(layout.createSequentialGroup()
							.addGap(112, 536, Short.MAX_VALUE)
							.addGroup(layout.createParallelGroup()
								.addComponent(label2)
								.addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))))
					.addGap(59, 59, 59))
				.addGroup(layout.createSequentialGroup()
					.addGap(320, 320, 320)
					.addComponent(label1)
					.addContainerGap(335, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGap(30, 30, 30)
					.addComponent(label1)
					.addGap(51, 51, 51)
					.addComponent(label2)
					.addGap(14, 14, 14)
					.addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label6)
					.addGap(1, 1, 1)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup()
							.addComponent(label3)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(textArea5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(33, 33, 33)
							.addComponent(label4)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(textArea4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label5)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(textArea3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addComponent(textArea1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
	private JTextArea textArea1;
	private JLabel label1;
	private JTextArea textArea2;
	private JTextArea textArea3;
	private JTextArea textArea4;
	private JTextArea textArea5;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JButton button1;
	private JLabel label6;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
