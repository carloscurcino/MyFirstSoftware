package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Mon Nov 21 23:01:51 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class TelaInicialLoged extends JPanel {
	public TelaInicialLoged() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Victor
		TelaLoged = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		panel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();

		//======== TelaLoged ========
		{
			TelaLoged.setBackground(Color.white);
			TelaLoged.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder ( 0
			, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
			, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,
			TelaLoged. getBorder () ) ); TelaLoged. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
			) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

			//---- label1 ----
			label1.setText("Seja bem vindo, aluno!");
			label1.setFont(new Font("Segoe UI", Font.BOLD, 26));

			//---- label2 ----
			label2.setText("Num\u00e9ro de matricula: 202240228922");
			label2.setFont(label2.getFont().deriveFont(18f));

			//---- label3 ----
			label3.setText("Num\u00e9ro de problemas enviados: 0");
			label3.setFont(label3.getFont().deriveFont(18f));

			//======== panel1 ========
			{
				panel1.setBackground(new Color(0x399ab9));

				//---- button1 ----
				button1.setText("Status");

				//---- button2 ----
				button2.setText("Resolvidos");

				//---- button3 ----
				button3.setText("Enviar");

				GroupLayout panel1Layout = new GroupLayout(panel1);
				panel1.setLayout(panel1Layout);
				panel1Layout.setHorizontalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addContainerGap(18, Short.MAX_VALUE)
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(25, Short.MAX_VALUE))
				);
				panel1Layout.setVerticalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addContainerGap(155, Short.MAX_VALUE)
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, Short.MAX_VALUE)
							.addComponent(button3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, Short.MAX_VALUE)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(177, Short.MAX_VALUE))
				);
			}

			GroupLayout TelaLogedLayout = new GroupLayout(TelaLoged);
			TelaLoged.setLayout(TelaLogedLayout);
			TelaLogedLayout.setHorizontalGroup(
				TelaLogedLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, TelaLogedLayout.createSequentialGroup()
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
						.addGroup(TelaLogedLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(label1, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
							.addComponent(label2)
							.addComponent(label3, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(173, Short.MAX_VALUE))
			);
			TelaLogedLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {label1, label2, label3});
			TelaLogedLayout.setVerticalGroup(
				TelaLogedLayout.createParallelGroup()
					.addGroup(TelaLogedLayout.createSequentialGroup()
						.addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
					.addGroup(TelaLogedLayout.createSequentialGroup()
						.addContainerGap(188, Short.MAX_VALUE)
						.addComponent(label1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(227, Short.MAX_VALUE))
			);
			TelaLogedLayout.linkSize(SwingConstants.VERTICAL, new Component[] {label1, label2, label3});
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Victor
	private JPanel TelaLoged;
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
		frame.setContentPane(new TelaInicialLoged().TelaLoged);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}
