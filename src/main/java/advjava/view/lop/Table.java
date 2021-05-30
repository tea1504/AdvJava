package advjava.view.lop;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import advjava.DAO.GiangVienDAO;
import advjava.bean.GiangVien;

@SuppressWarnings("serial")
public class Table extends JPanel {
	private LopSetTableModel model = new LopSetTableModel();
	private JTable table;
	private final ThongTin tt;
	private JScrollPane pane;

	public Table(ThongTin _tt) {
		tt = _tt;
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 18));
		table.setRowHeight(30);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		pane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setLayout(new BorderLayout());
		add(pane, BorderLayout.CENTER);
		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				int r = table.getSelectedRow();
				tt.txtMaLop.setText(table.getValueAt(r, 0).toString());
				tt.txtTenLop.setText(table.getValueAt(r, 2).toString());
				String ma = table.getValueAt(r, 1).toString();
				GiangVienDAO gvdao = new GiangVienDAO();
				ArrayList<GiangVien> list = gvdao.getGiangVien();
				int index = -1;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getMa().compareTo(ma) == 0)
						index = i;
				}
				tt.cboGiangVien.setSelectedIndex(index);
				tt.txtSiSo.setText(table.getValueAt(r, 3).toString());
			}
		});
	}
}
