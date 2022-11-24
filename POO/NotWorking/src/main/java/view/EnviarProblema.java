package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Mon Nov 21 22:59:05 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class EnviarProblema {
	public EnviarProblema() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
		enviarP = new JPanel();
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
		button2 = new JButton();

		//======== enviarP ========
		{
			enviarP.setBackground(Color.white);
			enviarP.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
			. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax
			. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,
			12 ), java. awt. Color. red) ,enviarP. getBorder( )) ); enviarP. addPropertyChangeListener (new java. beans
			. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .
			getPropertyName () )) throw new RuntimeException( ); }} );

			//---- textArea1 ----
			textArea1.setBackground(new Color(0xd9d9d9));

			//---- label1 ----
			label1.setText("Enviar Problema");
			label1.setFont(new Font("Segoe UI", Font.PLAIN, 28));

			//---- textArea2 ----
			textArea2.setBackground(new Color(0xd9d9d9));

			//---- textArea3 ----
			textArea3.setBackground(new Color(0xd9d9d9));

			//---- textArea4 ----
			textArea4.setBackground(new Color(0xd9d9d9));

			//---- textArea5 ----
			textArea5.setBackground(new Color(0xd9d9d9));

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

			//---- button2 ----
			button2.setText("Carregar arquivo de imagem");
			button2.setBackground(new Color(0xd9d9d9));

			GroupLayout enviarPLayout = new GroupLayout(enviarP);
			enviarP.setLayout(enviarPLayout);
			enviarPLayout.setHorizontalGroup(
				enviarPLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, enviarPLayout.createSequentialGroup()
						.addGap(85, 85, 85)
						.addGroup(enviarPLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addGroup(enviarPLayout.createSequentialGroup()
								.addGroup(enviarPLayout.createParallelGroup()
									.addComponent(textArea1)
									.addGroup(enviarPLayout.createSequentialGroup()
										.addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(308, 308, 308))
									.addGroup(enviarPLayout.createSequentialGroup()
										.addComponent(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(364, 364, 364)))
								.addGap(28, 28, 28)
								.addGroup(enviarPLayout.createParallelGroup()
									.addComponent(textArea5)
									.addComponent(textArea3)
									.addComponent(textArea4, GroupLayout.Alignment.TRAILING)
									.addGroup(enviarPLayout.createSequentialGroup()
										.addGroup(enviarPLayout.createParallelGroup()
											.addGroup(enviarPLayout.createSequentialGroup()
												.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(19, 19, 19))
											.addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGroup(enviarPLayout.createSequentialGroup()
												.addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(11, 11, 11)))
										.addGap(165, 165, 165))))
							.addGroup(enviarPLayout.createSequentialGroup()
								.addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(240, 240, 240)
								.addGroup(enviarPLayout.createParallelGroup()
									.addGroup(enviarPLayout.createSequentialGroup()
										.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(230, 230, 230))
									.addComponent(textArea2))))
						.addGap(59, 59, 59))
					.addGroup(enviarPLayout.createSequentialGroup()
						.addGap(320, 320, 320)
						.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(335, 335, 335))
			);
			enviarPLayout.setVerticalGroup(
				enviarPLayout.createParallelGroup()
					.addGroup(enviarPLayout.createSequentialGroup()
						.addGap(30, 30, 30)
						.addComponent(label1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
						.addGap(51, 51, 51)
						.addComponent(label2, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
						.addGap(15, 15, 15)
						.addGroup(enviarPLayout.createParallelGroup()
							.addGroup(enviarPLayout.createSequentialGroup()
								.addComponent(textArea2, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addGap(8, 8, 8))
							.addGroup(enviarPLayout.createSequentialGroup()
								.addGap(1, 1, 1)
								.addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
						.addComponent(label6, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
						.addGap(1, 1, 1)
						.addGroup(enviarPLayout.createParallelGroup()
							.addGroup(enviarPLayout.createSequentialGroup()
								.addComponent(label3, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(textArea5, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addGap(33, 33, 33)
								.addComponent(label4, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(textArea4, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
								.addGap(38, 38, 38)
								.addComponent(label5, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(textArea3, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
							.addComponent(textArea1, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
						.addGap(26, 26, 26))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
	private JPanel enviarP;
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
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new EnviarProblema().enviarP);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}
