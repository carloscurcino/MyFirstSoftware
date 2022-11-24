package view;
import java.awt.*;
import java.awt.Component;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
/*
 * Created by JFormDesigner on Wed Nov 23 23:10:49 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class AdmTelaInicial  {

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
		AdmTela = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		panel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();

		//======== AdmTela ========
		{
			AdmTela.setBackground(Color.white);
			AdmTela.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
			border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER
			,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font
			. BOLD ,12 ) ,java . awt. Color .red ) ,AdmTela. getBorder () ) ); AdmTela. addPropertyChangeListener(
			new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order"
			.equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

			//---- label1 ----
			label1.setText("Seja bem vindo, T\u00e9cnico!");
			label1.setFont(new Font("Segoe UI", Font.BOLD, 26));

			//---- label2 ----
			label2.setText("Num\u00e9ro de matricula: 1337");
			label2.setFont(label2.getFont().deriveFont(18f));

			//---- label3 ----
			label3.setText("Num\u00e9ro de problemas resolvidos: 0");
			label3.setFont(label3.getFont().deriveFont(18f));

			//======== panel1 ========
			{
				panel1.setBackground(new Color(0x399ab9));

				//---- button1 ----
				button1.setText("Status");

				//---- button2 ----
				button2.setText("Resolvidos");

				//---- button3 ----
				button3.setText("Problemas enviados");

				GroupLayout panel1Layout = new GroupLayout(panel1);
				panel1.setLayout(panel1Layout);
				panel1Layout.setHorizontalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addGap(18, 18, 18)
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(25, Short.MAX_VALUE))
				);
				panel1Layout.setVerticalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addGap(155, 155, 155)
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(button3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(177, Short.MAX_VALUE))
				);
			}

			GroupLayout AdmTelaLayout = new GroupLayout(AdmTela);
			AdmTela.setLayout(AdmTelaLayout);
			AdmTelaLayout.setHorizontalGroup(
				AdmTelaLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, AdmTelaLayout.createSequentialGroup()
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(110, 110, 110)
						.addGroup(AdmTelaLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(label2)
							.addComponent(label3, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
							.addComponent(label1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
						.addGap(133, 133, 133))
			);
			AdmTelaLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {label2, label3});
			AdmTelaLayout.setVerticalGroup(
				AdmTelaLayout.createParallelGroup()
					.addGroup(AdmTelaLayout.createSequentialGroup()
						.addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
					.addGroup(AdmTelaLayout.createSequentialGroup()
						.addGap(188, 188, 188)
						.addComponent(label1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(227, Short.MAX_VALUE))
			);
			AdmTelaLayout.linkSize(SwingConstants.VERTICAL, new Component[] {label1, label2, label3});
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
	private JPanel AdmTela;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new AdmTelaInicial().AdmTela);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}
