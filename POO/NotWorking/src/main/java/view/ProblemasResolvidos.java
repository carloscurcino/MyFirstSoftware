package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Wed Nov 23 16:01:08 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class ProblemasResolvidos  {
	public ProblemasResolvidos(){
		initComponents();
	}
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
		problemResolv = new JPanel();
		label1 = new JLabel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		label2 = new JLabel();
		label3 = new JLabel();

		//======== problemResolv ========
		{
			problemResolv.setBackground(Color.white);
			problemResolv.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
			swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border
			. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog"
			,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,problemResolv. getBorder
			( )) ); problemResolv. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
			.beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException
			( ); }} );

			//---- label1 ----
			label1.setText("Problemas Resolvidos");
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

					//---- label3 ----
					label3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
					label3.setIcon(new ImageIcon(getClass().getResource("/checkResized.png")));

					GroupLayout panel2Layout = new GroupLayout(panel2);
					panel2.setLayout(panel2Layout);
					panel2Layout.setHorizontalGroup(
						panel2Layout.createParallelGroup()
							.addGroup(panel2Layout.createSequentialGroup()
								.addContainerGap(22, Short.MAX_VALUE)
								.addComponent(label2)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
								.addComponent(label3)
								.addContainerGap(35, Short.MAX_VALUE))
					);
					panel2Layout.setVerticalGroup(
						panel2Layout.createParallelGroup()
							.addGroup(panel2Layout.createSequentialGroup()
								.addContainerGap(29, Short.MAX_VALUE)
								.addGroup(panel2Layout.createParallelGroup()
									.addComponent(label2)
									.addComponent(label3))
								.addContainerGap(31, Short.MAX_VALUE))
					);
				}

				GroupLayout panel1Layout = new GroupLayout(panel1);
				panel1.setLayout(panel1Layout);
				panel1Layout.setHorizontalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addContainerGap(32, Short.MAX_VALUE)
							.addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(32, Short.MAX_VALUE))
				);
				panel1Layout.setVerticalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addContainerGap(28, Short.MAX_VALUE)
							.addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(354, Short.MAX_VALUE))
				);
			}

			GroupLayout problemResolvLayout = new GroupLayout(problemResolv);
			problemResolv.setLayout(problemResolvLayout);
			problemResolvLayout.setHorizontalGroup(
				problemResolvLayout.createParallelGroup()
					.addGroup(problemResolvLayout.createSequentialGroup()
						.addContainerGap(95, Short.MAX_VALUE)
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(90, Short.MAX_VALUE))
					.addGroup(problemResolvLayout.createSequentialGroup()
						.addGap(321, 321, 321)
						.addComponent(label1)
						.addContainerGap(350, Short.MAX_VALUE))
			);
			problemResolvLayout.setVerticalGroup(
				problemResolvLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, problemResolvLayout.createSequentialGroup()
						.addContainerGap(64, Short.MAX_VALUE)
						.addComponent(label1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(39, Short.MAX_VALUE))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
	private JPanel problemResolv;
	private JLabel label1;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel label2;
	private JLabel label3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setContentPane(new ProblemasResolvidos().problemResolv);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}
