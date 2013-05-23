import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;

public class SimpleAction extends AbstractAction {
	ButtonType bt;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public SimpleAction(ButtonType bt) {
		this.bt = bt;
		putValue(Action.NAME, bt.getName());
		putValue(Action.SHORT_DESCRIPTION, bt.getDescription());

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		bt.buttonAction();

	}

}
