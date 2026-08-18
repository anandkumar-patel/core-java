package anand.java8.util.optional.problem;

public class House {
	private String houseName;
	private HouseLoan houseLone;
	
	public House(String houseName, HouseLoan houseLone) {
		super();
		this.houseName = houseName;
		this.houseLone = houseLone;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public HouseLoan getHouseLone() {
		return houseLone;
	}
	public void setHouseLone(HouseLoan houseLone) {
		this.houseLone = houseLone;
	}
}
