package anand.java8.util.optional.solution;

import java.util.Optional;

public class House {
	private String houseName;
	private Optional<HouseLoan> houseLone;
	
	public House(String houseName, Optional<HouseLoan> houseLone) {
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
	public Optional<HouseLoan> getHouseLone() {
		return houseLone;
	}
	public void setHouseLone(Optional<HouseLoan> houseLone) {
		this.houseLone = houseLone;
	}
	@Override
	public String toString() {
		return "House [houseName=" + houseName + "]";
	}
}
