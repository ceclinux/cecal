import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

public class NumberType extends ButtonType {
	public static final int[] NONZERO_DIGITS = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	// private static final int DEFAULT_WIDTH=80;
	// private static final int DEFAULT_HEIGHT=80;
	public static final Color COLOR = null;
	private static final int FONTSIZE = 35;
	Font font = new Font("Ubuntu", Font.PLAIN, FONTSIZE);

	int name;

	@Override
	public String getDescription() {
		return "The number " + name;
	}

	@Override
	public Font getFont() {
		return font;
	}

	public NumberType(int n) {
		name = n;
		// setColor(Color.RED);
		setName(n + "");

	}

	@Override
	public void buttonAction() {
		System.out.println(name);
	}

	public NumberType getType() {
		return this;
	}

	public int getXLocation() {
		// if(name>0){
		// return (name-1)%3;
		// }
		// else{
		// return 0;
		// }
		return name > 0 ? (name - 1) % 3 : 0;
	}

	public int getYLocation() {
		return name > 0 ? (9 - name) / 3 : 3;
	}

	public int getWidth() {
		return name > 0 ? 1 : 2;
	}
	// public static Dimension getSize(){
	// return new Dimension( DEFAULT_WIDTH,DEFAULT_HEIGHT);
	// }

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return name+"";
	}
}
