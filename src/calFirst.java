import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.TextField;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class calFirst extends JFrame {
	JButton[] numberButton = new JButton[NumberType.NONZERO_DIGITS.length];
	private static final int DEFAULT_WIDTH = 500;
	private static final int DEFAULT_HEIGHT = 600;

	private static final int GRID_WIDTH = 100;
	private static final int GRID_HEIGHT = 100;
	private int row_addtion = 2;

	/**
	 * @param args
	 * @throws UnsupportedLookAndFeelException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {
		// TODO Auto-generated method stub
		new calFirst();
	}

	public calFirst() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		// JFrame jf=new JFrame();
		// jf.setSize(300,300);
		// jf.setVisible(true);
		// jf.add(this,BorderLayout.NORTH);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);

		setVisible(true);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		add(new TextField(),
				new GBC(0, 0, 4, 1).setFill(GBC.BOTH).setAnchor(GBC.EAST)
						.setWeight(100, 100));
		for (int i = 0; i < 3; i++) {
			add(new Button(),
					new GBC(i, 1, 1, 1).setFill(GBC.BOTH).setWeight(100, 100));
		}
		add(new JButton(new SimpleAction(new delBioOpea())),
				new GBC(3, 1, 1, 1).setFill(GBC.BOTH).setWeight(100, 100));
		add(new JButton(new SimpleAction(new addBioOpea())),
				new GBC(3, 2, 1, 2).setFill(GBC.BOTH).setWeight(100, 100));
		add(new Button(),
				new GBC(3, 4, 1, 2).setFill(GBC.BOTH).setWeight(100, 100));
		for (int i : NumberType.NONZERO_DIGITS) {
			NumberType nt = new NumberType(i);
			Action numberAction = new SimpleAction(nt);
			numberButton[i] = new JButton(numberAction);
			add(numberButton[i], new GBC(nt.getXLocation(), nt.getYLocation()
					+ row_addtion, nt.getWidth(), 1).setFill(GBC.BOTH)
					.setWeight(GRID_WIDTH, GRID_WIDTH));
			numberButton[i].setBackground(NumberType.COLOR);
			numberButton[i].setFont(nt.getFont());
			// numberButton[i].setPreferredSize(NumberType.getSize());
			// System.out.println(NumberType.getSize());
			// numberButton[i].setLocation(nt.getLocation());
			// buttonPanel.add(numberButton[i],BorderLayout.NORTH);

		}
		// add(new JButton("0"),new
		// GBC(0,5,2,1).setFill(GBC.BOTH).setWeight(100, 100));
		add(new JButton("."),
				new GBC(2, 5, 1, 1).setFill(GBC.BOTH).setWeight(100, 100));
		// Action numberAction=new SimpleAction(new
		// NumberType(1)).setWeight(100, 100);
		// buttonPanel.add(new JButton(numberAction));
		add(buttonPanel);
	}

	private JPanel buttonPanel = new JPanel();

}
