package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Fri Nov 18 04:00:51 BRT 2022
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
		// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		menuBar1 = new JMenuBar();

		//======== this ========
		setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
		.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder
		.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.
		awt.Font.BOLD,12),java.awt.Color.red), getBorder()))
		; addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
		){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}})
		;

		//---- label1 ----
		label1.setText("Seja bem vindo, aluno!");
		label1.setFont(new Font("Segoe UI", Font.BOLD, 26));

		//---- label2 ----
		label2.setText("Num\u00e9ro de matricula: 202240228922");
		label2.setFont(label2.getFont().deriveFont(18f));

		//---- label3 ----
		label3.setText("Num\u00e9ro de problemas enviados: 0");
		label3.setFont(label3.getFont().deriveFont(18f));

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
					.addContainerGap(271, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup()
						.addComponent(label3)
						.addGroup(layout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(label1)
								.addGap(275, 275, 275))
							.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(label2)
								.addGap(255, 255, 255)))))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGap(196, 196, 196)
					.addComponent(label1)
					.addGap(18, 18, 18)
					.addComponent(label2)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label3)
					.addContainerGap(229, Short.MAX_VALUE))
		);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - carlosdanielf541@gmail.com
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JMenuBar menuBar1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
