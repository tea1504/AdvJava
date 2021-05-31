package advjava.view;

import java.awt.EventQueue;

import advjava.view.lop.LopGUI;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new App();
			}
		});
	}

}
