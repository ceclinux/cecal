public class addBioOpea extends BioOperType {

/*
 * (non-Javadoc)
 * @see ButtonType#getDescription()
 */
	@Override
	public String getDescription() {
		return "add,can't be used as plus sign";
	}

	@Override
	public String getName() {
		return "+";
	}
	// @Override
	// public void buttonAction(){
	// System.out.println(getName());
	// }
	// public addBioOpea(){
	// setName(getName());
	// setDescription(getDescription());
	// }
}
