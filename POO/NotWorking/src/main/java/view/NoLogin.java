package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Mon Nov 21 23:01:57 BRT 2022
 */



/**
 * @author carlosdanielf541@gmail.com
 */
public class NoLogin extends JPanel {
	public NoLogin() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
		NoLogin = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		loginIco = new JLabel();

		//======== NoLogin ========
		{
			NoLogin.setBackground(Color.white);
			NoLogin.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(
			new javax.swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion"
			,javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
			,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12)
			,java.awt.Color.red),NoLogin. getBorder()));NoLogin. addPropertyChangeListener(
			new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
			){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
			;}});

			//---- label1 ----
			label1.setText("Fa\u00e7a login");
			label1.setFont(new Font("Segoe UI", Font.BOLD, 26));

			//---- label2 ----
			label2.setText("Para utilizar \u00e9 necess\u00e1rio ter conta!");
			label2.setFont(label2.getFont().deriveFont(18f));

			//---- loginIco ----
			loginIco.setIcon(new ImageIcon(getClass().getResource("/NicePngResized.png.png")));

			GroupLayout NoLoginLayout = new GroupLayout(NoLogin);
			NoLogin.setLayout(NoLoginLayout);
			NoLoginLayout.setHorizontalGroup(
				NoLoginLayout.createParallelGroup()
					.addGroup(NoLoginLayout.createSequentialGroup()
						.addContainerGap(290, Short.MAX_VALUE)
						.addGroup(NoLoginLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.TRAILING, NoLoginLayout.createSequentialGroup()
								.addComponent(loginIco)
								.addGap(37, 37, 37))
							.addGroup(GroupLayout.Alignment.TRAILING, NoLoginLayout.createSequentialGroup()
								.addGroup(NoLoginLayout.createParallelGroup()
									.addComponent(label2)
									.addComponent(label1))
								.addContainerGap(269, Short.MAX_VALUE))))
			);
			NoLoginLayout.setVerticalGroup(
				NoLoginLayout.createParallelGroup()
					.addGroup(NoLoginLayout.createSequentialGroup()
						.addGap(25, 25, 25)
						.addComponent(loginIco)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label2)
						.addContainerGap(254, Short.MAX_VALUE))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Carlos Daniel Curcino Mendes
	private JPanel NoLogin;
	private JLabel label1;
	private JLabel label2;
	private JLabel loginIco;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new NoLogin().NoLogin);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}
