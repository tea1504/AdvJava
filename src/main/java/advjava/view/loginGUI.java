package advjava.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class loginGUI extends JFrame implements ActionListener {
	private JLabel header = new JLabel();
	public loginGUI() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.
		setSize(500, 700);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
