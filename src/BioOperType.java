import java.awt.Color;
import java.awt.Font;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class BioOperType extends ButtonType {
	// public static String[] BIOFUNCTION={"/","*","-","+"};
	public Map<String, String> buttonDesc = createFuncDescrp();
	// public static int OPEA=BioOperType
	public static final Color COLOR = null;
	private static final int FONTSIZE = 35;
	Font font = new Font("Ubuntu", Font.PLAIN, FONTSIZE);
	String name;

	public static void main(String[] args) {
//		BioOperType bi = new BioOperType();
//		bi.createOpea();
	}

	@Override
	ButtonType getType() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public String getDescription() {
//		return buttonDesc.get(name);
//
//	}

	// public int getXLocation(){
	// return buttonDesc.entrySet();
	//
	// }
	@Override
	public void buttonAction() {
		System.out.println(getName());
	}

	private Map createFuncDescrp() {
		Map<String, String> bd = new LinkedHashMap<String, String>();
		bd.put("*", "multiply");
		bd.put("/", "divide,use decimal divison");
		bd.put("-", "subtract,can't be used  as minus");
		return bd;

	}

	public BioOperType() {
		setName(getName());
		setDescription(getDescription());
	}

	private int[] createOpea() {
		Set<String> bioOpea = buttonDesc.keySet();
		Iterator<String> i = bioOpea.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		return null;
	}

}
