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
	public AdmProblemas(){
		initComponents();
	}
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
		AdmProblemas = new JPanel();
		label1 = new JLabel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		label2 = new JLabel();
		comboBox1 = new JComboBox<>();

		//======== AdmProblemas ========
		{
			AdmProblemas.setBackground(Color.white);
			AdmProblemas.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
			border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER
			, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font
			.BOLD ,12 ), java. awt. Color. red) ,AdmProblemas. getBorder( )) ); AdmProblemas. addPropertyChangeListener (
			new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order"
			.equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

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

					//---- comboBox1 ----
					comboBox1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
						"Aguardando resolu\u00e7\u00e3o",
						"Em andamento",
						"Resolvido"
					}));

					GroupLayout panel2Layout = new GroupLayout(panel2);
					panel2.setLayout(panel2Layout);
					panel2Layout.setHorizontalGroup(
						panel2Layout.createParallelGroup()
							.addGroup(panel2Layout.createSequentialGroup()
								.addContainerGap(32, Short.MAX_VALUE)
								.addComponent(label2)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
								.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(45, Short.MAX_VALUE))
					);
					panel2Layout.setVerticalGroup(
						panel2Layout.createParallelGroup()
							.addGroup(panel2Layout.createSequentialGroup()
								.addContainerGap(29, Short.MAX_VALUE)
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
						.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
							.addContainerGap(29, Short.MAX_VALUE)
							.addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(29, Short.MAX_VALUE))
				);
				panel1Layout.setVerticalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
							.addContainerGap(29, Short.MAX_VALUE)
							.addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(353, Short.MAX_VALUE))
				);
			}

			GroupLayout AdmProblemasLayout = new GroupLayout(AdmProblemas);
			AdmProblemas.setLayout(AdmProblemasLayout);
			AdmProblemasLayout.setHorizontalGroup(
				AdmProblemasLayout.createParallelGroup()
					.addGroup(AdmProblemasLayout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addGroup(AdmProblemasLayout.createParallelGroup()
							.addComponent(label1)
							.addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(95, Short.MAX_VALUE))
			);
			AdmProblemasLayout.setVerticalGroup(
				AdmProblemasLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, AdmProblemasLayout.createSequentialGroup()
						.addContainerGap(42, Short.MAX_VALUE)
						.addComponent(label1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
						.addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap(49, Short.MAX_VALUE))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
	private JPanel AdmProblemas;
	private JLabel label1;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel label2;
	private JComboBox<String> comboBox1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new AdmProblemas().AdmProblemas);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}
