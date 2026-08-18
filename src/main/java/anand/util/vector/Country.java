package anand.util.vector;

public class Country implements Comparable<Country>{
	private int cid;
	private String cname;
	private Long population;
	
	public Country(int id, String name, Long pop) {
		this.cid = id;
		this.cname = name;
		this.population = pop;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cnmae) {
		this.cname = cnmae;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", population=" + population + "]";
	}
	@Override
	public int compareTo(Country obj) {
		if (this.cid == obj.cid) {
			return 0;
		} else if (this.cid > obj.cid) {
			return 1;
		} else {
			return -1;
		}
	}
}
