package anand.java8.util.optional.problem;

public class HouseLoan {
	private int loadnNo;
	private String loanDetails;
	
	public HouseLoan(int loadnNo, String loanDetails) {
		super();
		this.loadnNo = loadnNo;
		this.loanDetails = loanDetails;
	}
	public int getLoadnNo() {
		return loadnNo;
	}
	public void setLoadnNo(int loadnNo) {
		this.loadnNo = loadnNo;
	}
	public String getLoanDetails() {
		return loanDetails;
	}
	public void setLoanDetails(String loanDetails) {
		this.loanDetails = loanDetails;
	}
}
