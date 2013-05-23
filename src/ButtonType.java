import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public abstract class ButtonType {
	protected Font font;

	public Font getFont() {
		return font;
	}

	public void setFont(Font f) {
		this.font = f;
	}

	abstract ButtonType getType();

	abstract String getName() ;

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	abstract void buttonAction();

	private String name;
	private Color color;
	private String description;

	abstract String getDescription() ;

	public void setDescription(String description) {
		this.description = description;
	}

}
