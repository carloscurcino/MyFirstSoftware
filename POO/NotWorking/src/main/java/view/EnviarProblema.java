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
		// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
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
			enviarP.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
			. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder
			. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .
			awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,enviarP. getBorder () ) )
			; enviarP. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
			) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
			;

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
					.addGroup(enviarPLayout.createSequentialGroup()
						.addGap(58, 58, 58)
						.addGroup(enviarPLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addGroup(enviarPLayout.createSequentialGroup()
								.addGroup(enviarPLayout.createParallelGroup()
									.addComponent(textArea1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
									.addComponent(button1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
									.addGroup(enviarPLayout.createSequentialGroup()
										.addComponent(label6, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
								.addGroup(enviarPLayout.createParallelGroup()
									.addGroup(enviarPLayout.createSequentialGroup()
										.addGroup(enviarPLayout.createParallelGroup()
											.addComponent(textArea4, GroupLayout.Alignment.TRAILING)
											.addComponent(textArea3)
											.addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(textArea5, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
									.addGroup(enviarPLayout.createSequentialGroup()
										.addGroup(enviarPLayout.createParallelGroup()
											.addComponent(label5, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
											.addComponent(label4, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
										.addGap(0, 0, Short.MAX_VALUE))))
							.addComponent(label1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
							.addGroup(enviarPLayout.createSequentialGroup()
								.addComponent(button2, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
								.addGroup(enviarPLayout.createParallelGroup()
									.addComponent(label2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
									.addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
								.addGap(0, 27, Short.MAX_VALUE)))
						.addGap(21, 21, 21))
			);
			enviarPLayout.setVerticalGroup(
				enviarPLayout.createParallelGroup()
					.addGroup(enviarPLayout.createSequentialGroup()
						.addContainerGap(15, Short.MAX_VALUE)
						.addComponent(label1, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
						.addComponent(label2, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(enviarPLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(button2, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
							.addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
						.addComponent(label6, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(enviarPLayout.createParallelGroup()
							.addGroup(enviarPLayout.createSequentialGroup()
								.addComponent(label3, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(textArea5, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
								.addComponent(label4, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(textArea4, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
								.addComponent(label5, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(textArea3, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
							.addComponent(textArea1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, Short.MAX_VALUE)
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
						.addContainerGap(13, Short.MAX_VALUE))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
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
