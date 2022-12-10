package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Mon Nov 21 23:01:34 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class Problema {
	public Problema() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
		Problem = new JPanel();
		label1 = new JLabel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		label2 = new JLabel();
		panel3 = new JPanel();
		label3 = new JLabel();
		panel4 = new JPanel();
		label6 = new JLabel();
		panel5 = new JPanel();
		label7 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label8 = new JLabel();

		//======== Problem ========
		{
			Problem.setBackground(Color.white);
			Problem.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
			EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing
			. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
			java. awt. Color. red) ,Problem. getBorder( )) ); Problem. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
			{ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () ))
			throw new RuntimeException( ); }} );

			//---- label1 ----
			label1.setText("Problema");
			label1.setFont(new Font("Segoe UI", Font.PLAIN, 28));

			//======== panel1 ========
			{
				panel1.setBackground(new Color(0x399ab9));

				//======== panel2 ========
				{
					panel2.setBackground(Color.blue);

					GroupLayout panel2Layout = new GroupLayout(panel2);
					panel2.setLayout(panel2Layout);
					panel2Layout.setHorizontalGroup(
						panel2Layout.createParallelGroup()
							.addGap(0, 405, Short.MAX_VALUE)
					);
					panel2Layout.setVerticalGroup(
						panel2Layout.createParallelGroup()
							.addGap(0, 0, Short.MAX_VALUE)
					);
				}

				//---- label2 ----
				label2.setText("Problema X");
				label2.setFont(new Font("Segoe UI", Font.BOLD, 20));
				label2.setForeground(Color.white);

				//======== panel3 ========
				{
					panel3.setBackground(Color.white);

					//---- label3 ----
					label3.setText("Descri\u00e7\u00e3o vem aqui");

					GroupLayout panel3Layout = new GroupLayout(panel3);
					panel3.setLayout(panel3Layout);
					panel3Layout.setHorizontalGroup(
						panel3Layout.createParallelGroup()
							.addGroup(panel3Layout.createSequentialGroup()
								.addGap(19, 19, 19)
								.addComponent(label3)
								.addContainerGap(274, Short.MAX_VALUE))
					);
					panel3Layout.setVerticalGroup(
						panel3Layout.createParallelGroup()
							.addGroup(panel3Layout.createSequentialGroup()
								.addGap(22, 22, 22)
								.addComponent(label3)
								.addContainerGap(184, Short.MAX_VALUE))
					);
				}

				//======== panel4 ========
				{
					panel4.setBackground(Color.white);

					//---- label6 ----
					label6.setText("Local vem aqui");

					GroupLayout panel4Layout = new GroupLayout(panel4);
					panel4.setLayout(panel4Layout);
					panel4Layout.setHorizontalGroup(
						panel4Layout.createParallelGroup()
							.addGroup(panel4Layout.createSequentialGroup()
								.addGap(18, 18, 18)
								.addComponent(label6)
								.addContainerGap(82, Short.MAX_VALUE))
					);
					panel4Layout.setVerticalGroup(
						panel4Layout.createParallelGroup()
							.addGroup(panel4Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(label6)
								.addContainerGap(10, Short.MAX_VALUE))
					);
				}

				//======== panel5 ========
				{
					panel5.setBackground(Color.white);

					//---- label7 ----
					label7.setText("Objeto vem aqui");

					GroupLayout panel5Layout = new GroupLayout(panel5);
					panel5.setLayout(panel5Layout);
					panel5Layout.setHorizontalGroup(
						panel5Layout.createParallelGroup()
							.addGroup(panel5Layout.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label7)
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
					panel5Layout.setVerticalGroup(
						panel5Layout.createParallelGroup()
							.addGroup(panel5Layout.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label7)
								.addContainerGap(10, Short.MAX_VALUE))
					);
				}

				//---- label4 ----
				label4.setText("Local:");
				label4.setForeground(Color.white);
				label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD, 13f));

				//---- label5 ----
				label5.setText("Objeto:");
				label5.setForeground(Color.white);
				label5.setFont(label5.getFont().deriveFont(label5.getFont().getStyle() | Font.BOLD, 13f));

				//---- label8 ----
				label8.setIcon(new ImageIcon(getClass().getResource("/clock-icon.png")));

				GroupLayout panel1Layout = new GroupLayout(panel1);
				panel1.setLayout(panel1Layout);
				panel1Layout.setHorizontalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
							.addGroup(panel1Layout.createParallelGroup()
								.addGroup(panel1Layout.createSequentialGroup()
									.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addComponent(panel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
											.addGroup(panel1Layout.createParallelGroup()
												.addComponent(label4)
												.addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGroup(panel1Layout.createParallelGroup()
												.addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(panel1Layout.createSequentialGroup()
													.addComponent(label5)
													.addGap(0, 0, Short.MAX_VALUE)))))
									.addContainerGap(76, Short.MAX_VALUE))
								.addGroup(panel1Layout.createSequentialGroup()
									.addComponent(label2, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
									.addComponent(label8)
									.addContainerGap(65, Short.MAX_VALUE))))
				);
				panel1Layout.setVerticalGroup(
					panel1Layout.createParallelGroup()
						.addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(panel1Layout.createSequentialGroup()
							.addContainerGap(27, Short.MAX_VALUE)
							.addGroup(panel1Layout.createParallelGroup()
								.addComponent(label2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label8))
							.addGap(18, 18, Short.MAX_VALUE)
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(label4)
								.addComponent(label5))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(40, Short.MAX_VALUE))
				);
			}

			GroupLayout ProblemLayout = new GroupLayout(Problem);
			Problem.setLayout(ProblemLayout);
			ProblemLayout.setHorizontalGroup(
				ProblemLayout.createParallelGroup()
					.addGroup(ProblemLayout.createSequentialGroup()
						.addContainerGap(45, Short.MAX_VALUE)
						.addGroup(ProblemLayout.createParallelGroup()
							.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGroup(GroupLayout.Alignment.TRAILING, ProblemLayout.createSequentialGroup()
								.addComponent(label1)
								.addGap(389, 389, 389)))
						.addContainerGap(66, Short.MAX_VALUE))
			);
			ProblemLayout.setVerticalGroup(
				ProblemLayout.createParallelGroup()
					.addGroup(ProblemLayout.createSequentialGroup()
						.addContainerGap(23, Short.MAX_VALUE)
						.addComponent(label1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(62, Short.MAX_VALUE))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
	private JPanel Problem;
	private JLabel label1;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel label2;
	private JPanel panel3;
	private JLabel label3;
	private JPanel panel4;
	private JLabel label6;
	private JPanel panel5;
	private JLabel label7;
	private JLabel label4;
	private JLabel label5;
	private JLabel label8;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new Problema().Problem);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}
