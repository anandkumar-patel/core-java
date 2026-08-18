package anand.office.help;

public class BestWayToCode {
private static final String ACT_DESCRIPTION_ID ="Demo";
	public static void main(String[] args) {
		
		// CASE-1 boolean condition check
		Boolean isdrgCodeChanged = false;
		ChargeBean chgBean = new ChargeBean();
		String drgCode = "Demo";
	    if (!drgCode.equals(chgBean.get(ACT_DESCRIPTION_ID)))
	      isdrgCodeChanged = true;
	   
	    //SOLUTION-1
	    System.out.println(isdrgCodeChanged);
	    Boolean isDrgCodeChanged = !drgCode.equals(chgBean.get(ACT_DESCRIPTION_ID));
	    System.out.println(isDrgCodeChanged);
	    
	    
	    //CASE-2 String empty check
	    String data = null ;
	    if("".equals(data)){
	    	System.out.println("Empty String");
	    } else {
	    	System.out.println("Not empty String");
	    }
	    
	    

	}

}

class ChargeBean {
	public String get(String act_id) {
		return act_id;
	}
}
