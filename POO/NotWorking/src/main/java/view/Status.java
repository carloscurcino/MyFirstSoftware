package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Wed Nov 23 22:50:48 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class Status  {

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
		Stats = new JPanel();
		label1 = new JLabel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		label2 = new JLabel();
		label3 = new JLabel();

		//======== Stats ========
		{
			Stats.setBackground(Color.white);
			Stats.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
			.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing
			.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
			Font("D\u0069alog",java.awt.Font.BOLD,12),java.awt.Color.red
			),Stats. getBorder()));Stats. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
			public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName(
			)))throw new RuntimeException();}});

			//---- label1 ----
			label1.setText("Status");
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
					label3.setText("Status de resolu\u00e7\u00e3o");
					label3.setFont(new Font("Segoe UI", Font.PLAIN, 16));

					GroupLayout panel2Layout = new GroupLayout(panel2);
					panel2.setLayout(panel2Layout);
					panel2Layout.setHorizontalGroup(
						panel2Layout.createParallelGroup()
							.addGroup(panel2Layout.createSequentialGroup()
								.addGap(95, 95, 95)
								.addComponent(label2)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
								.addComponent(label3)
								.addGap(72, 72, 72))
					);
					panel2Layout.setVerticalGroup(
						panel2Layout.createParallelGroup()
							.addGroup(panel2Layout.createSequentialGroup()
								.addGap(29, 29, 29)
								.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
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
							.addGap(32, 32, 32)
							.addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(175, Short.MAX_VALUE))
				);
				panel1Layout.setVerticalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addGap(28, 28, 28)
							.addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(354, Short.MAX_VALUE))
				);
			}

			GroupLayout StatsLayout = new GroupLayout(Stats);
			Stats.setLayout(StatsLayout);
			StatsLayout.setHorizontalGroup(
				StatsLayout.createParallelGroup()
					.addGroup(StatsLayout.createSequentialGroup()
						.addGap(131, 131, 131)
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(StatsLayout.createSequentialGroup()
						.addGap(518, 518, 518)
						.addComponent(label1))
			);
			StatsLayout.setVerticalGroup(
				StatsLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, StatsLayout.createSequentialGroup()
						.addContainerGap(48, Short.MAX_VALUE)
						.addComponent(label1)
						.addGap(32, 32, 32)
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(48, 48, 48))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
	private JPanel Stats;
	private JLabel label1;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel label2;
	private JLabel label3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new Status().Stats);
		frame.setSize(895, 560);
		frame.setVisible(true);
	} 
}
