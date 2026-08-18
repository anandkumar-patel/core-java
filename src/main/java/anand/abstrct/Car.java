package anand.abstrct;

public abstract  class Car extends FourWheeler {

	@Override
	public String getSound() {
		return "roar";
	}

	@Override
	public String getClassification() {
		return null;
	}

}
