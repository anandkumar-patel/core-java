package anand.office.help;

public class JavaCallBy {

	public static void main(String[] args) {

		ChargeDTO obj1 = new ChargeDTO();

		ChargeDTO obj2 = doChange(obj1);

		System.out.println("obj1 :" + obj1);
		System.out.println("obj2 :" + obj2);

	}

	public static ChargeDTO doChange(ChargeDTO obj1) {
		ChargeDTO obj2 = obj1;
		obj2.setBillNo("bill002");
		return obj2;
	}

}

class ChargeDTO {

	private String chargeId;
	private String billNo;
	
	public ChargeDTO() {
		this.chargeId = "ch01";
		this.billNo = "bill001";
	}

	public ChargeDTO(String chargeId, String billNo) {
		this.chargeId = chargeId;
		this.billNo = billNo;
	}

	public String getChargeId() {
		return chargeId;
	}

	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Override
	public String toString() {
		return "ChargeDTO [chargeId=" + chargeId + ", billNo=" + billNo + "]";
	}
}
