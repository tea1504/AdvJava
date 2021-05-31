package advjava.view;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import advjava.view.lop.LopGUI;

@SuppressWarnings("serial")
public class App extends JFrame {
	JMenuBar menubar = new JMenuBar();
	JMenu menu = new JMenu("Quản lý danh mục");
	JMenuItem menuitem = new JMenuItem("Lớp");
	JLabel lbl;
	public App() {
		ImageIcon icon = new ImageIcon(this.getClass().getResource("ql.png"));
		menuitem.setIcon(icon);
		menuitem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LopGUI();
			}
		});
		menu.add(menuitem);
		menubar.add(menu);
		setSize(800, 500);
//		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
//		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
//		gbc.fill = GridBagConstraints.HORIZONTAL;
//		gbc.gridx = 0;
//		gbc.gridy = 0;
//		gbc.weightx = 1.0;
//		gbc.weighty = 0.0;
		add(menubar, BorderLayout.NORTH);
		icon = new ImageIcon(this.getClass().getResource("bg.jpg"));
		lbl = new JLabel(new ImageIcon(icon.getImage().getScaledInstance(getBounds().width, getBounds().height, Image.SCALE_AREA_AVERAGING)));
		add(lbl, BorderLayout.CENTER);
		setVisible(true);
		addComponentListener(new ComponentListener() {
			
			@Override
			public void componentShown(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				System.out.println(getBounds());
				ImageIcon icon = new ImageIcon(this.getClass().getResource("bg.jpg"));
				lbl = new JLabel(new ImageIcon(icon.getImage().getScaledInstance(getBounds().width, getBounds().height, Image.SCALE_AREA_AVERAGING)));
			}
			
			@Override
			public void componentMoved(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void componentHidden(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
