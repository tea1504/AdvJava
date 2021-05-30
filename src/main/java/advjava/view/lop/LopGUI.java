package advjava.view.lop;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class LopGUI extends JFrame{
	ThongTin thongtin;
	Table table;
	public LopGUI() {
		thongtin = new ThongTin();
		table = new Table(thongtin);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 500);
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.PAGE_START;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.4;
		getContentPane().add(thongtin, gbc);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx++;
		gbc.weightx = 0.6;
		getContentPane().add(table, gbc);
		setVisible(true);
	}

}
