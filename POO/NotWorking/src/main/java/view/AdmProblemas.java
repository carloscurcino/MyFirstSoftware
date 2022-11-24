package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Wed Nov 23 23:13:35 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class AdmProblemas  {

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
		AdmProblemas = new JPanel();
		label1 = new JLabel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		label2 = new JLabel();
		comboBox1 = new JComboBox();

		//======== AdmProblemas ========
		{
			AdmProblemas.setBackground(Color.white);
			AdmProblemas.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
			swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border
			. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067"
			,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,AdmProblemas. getBorder
			( )) ); AdmProblemas. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
			.beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException
			( ); }} );

			//---- label1 ----
			label1.setText("Problemas a resolver");
			label1.setFont(new Font("Segoe UI", Font.PLAIN, 28));

			//======== panel1 ========
			{
				panel1.setBackground(new Color(0xd9d9d9));

				//======== panel2 ========
				{
					panel2.setBackground(new Color(0x399ab9));

					//---- label2 ----
					label2.setText("Titulo do problema");
					label2.setForeground(Color.white);
					label2.setFont(new Font("Segoe UI", Font.PLAIN, 20));

					GroupLayout panel2Layout = new GroupLayout(panel2);
					panel2.setLayout(panel2Layout);
					panel2Layout.setHorizontalGroup(
						panel2Layout.createParallelGroup()
							.addGroup(panel2Layout.createSequentialGroup()
								.addGap(95, 95, 95)
								.addComponent(label2)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
								.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(40, 40, 40))
					);
					panel2Layout.setVerticalGroup(
						panel2Layout.createParallelGroup()
							.addGroup(panel2Layout.createSequentialGroup()
								.addGap(29, 29, 29)
								.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(label2)
									.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(30, Short.MAX_VALUE))
					);
				}

				GroupLayout panel1Layout = new GroupLayout(panel1);
				panel1.setLayout(panel1Layout);
				panel1Layout.setHorizontalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addGap(102, 102, 102)
							.addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(105, Short.MAX_VALUE))
				);
				panel1Layout.setVerticalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addGap(29, 29, 29)
							.addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(353, Short.MAX_VALUE))
				);
			}

			GroupLayout AdmProblemasLayout = new GroupLayout(AdmProblemas);
			AdmProblemas.setLayout(AdmProblemasLayout);
			AdmProblemasLayout.setHorizontalGroup(
				AdmProblemasLayout.createParallelGroup()
					.addGroup(AdmProblemasLayout.createSequentialGroup()
						.addGap(131, 131, 131)
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(46, 46, 46))
					.addGroup(GroupLayout.Alignment.TRAILING, AdmProblemasLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label1)
						.addGap(347, 347, 347))
			);
			AdmProblemasLayout.setVerticalGroup(
				AdmProblemasLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, AdmProblemasLayout.createSequentialGroup()
						.addContainerGap(42, Short.MAX_VALUE)
						.addComponent(label1)
						.addGap(38, 38, 38)
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(48, 48, 48))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
	private JPanel AdmProblemas;
	private JLabel label1;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel label2;
	private JComboBox comboBox1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new AdmProblemas().AdmProblemas);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}
