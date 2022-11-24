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
		// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
		NoLogin = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();

		//======== NoLogin ========
		{
			NoLogin.setBackground(Color.white);
			NoLogin.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
			( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border
			. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt
			. Color. red) ,NoLogin. getBorder( )) ); NoLogin. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
			propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( )
			; }} );

			//---- label1 ----
			label1.setText("Fa\u00e7a login");
			label1.setFont(new Font("Segoe UI", Font.BOLD, 26));

			//---- label2 ----
			label2.setText("Para utilizar \u00e9 necess\u00e1rio ter conta!");
			label2.setFont(label2.getFont().deriveFont(18f));

			GroupLayout NoLoginLayout = new GroupLayout(NoLogin);
			NoLogin.setLayout(NoLoginLayout);
			NoLoginLayout.setHorizontalGroup(
				NoLoginLayout.createParallelGroup()
					.addGroup(NoLoginLayout.createSequentialGroup()
						.addGap(272, 272, 272)
						.addGroup(NoLoginLayout.createParallelGroup()
							.addComponent(label2)
							.addGroup(NoLoginLayout.createSequentialGroup()
								.addGap(76, 76, 76)
								.addComponent(label1)))
						.addContainerGap(287, Short.MAX_VALUE))
			);
			NoLoginLayout.setVerticalGroup(
				NoLoginLayout.createParallelGroup()
					.addGroup(NoLoginLayout.createSequentialGroup()
						.addGap(167, 167, 167)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(label2)
						.addContainerGap(250, Short.MAX_VALUE))
			);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
	private JPanel NoLogin;
	private JLabel label1;
	private JLabel label2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.pack();
		frame.setContentPane(new NoLogin().NoLogin);
		frame.setSize(895, 560);
		frame.setVisible(true);
	}
}
