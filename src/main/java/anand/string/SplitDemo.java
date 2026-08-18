package anand.string;

public class SplitDemo {

	public static void main(String[] args) {
		String demo= "http://localhost:8080/insta/pages/servicerevenue.do?screenId=service_builder&reportName=Services+Report&method="
				+"getReport&outputMode=pdf&_searchMethod=getScreen&_parent_report_name=Services+Report+Builder&selDateRange=pf&srjsFile"
				+"=null&reptDescFile=Services.srjs&reportGroup=Services+Reports&current_user=InstaAdmin&print_title=Services+Report"
				+"&_myreport=nosearch&reportType=list&dateFieldSelection=presc_date&_sel=pf&fromDate=01-04-2016&toDate=31-03-2017&"
				+"avlbListFlds=cond_time&listFields=mr_no&listFields=patient_id&listFields=patient_name&listFields=service_name&"
				+"listFields=presc_date&listFields=pres_doctor&listFields=conducted&listFields=conducteddate&listFields=quantity&"
				+"baseFontSize=10&listGroups=&listGroups=&listGroups=&sumGroupHoriz=&sumGroupVert=&sumGroupVertSub=&trendType=day&"
				+"trendGroupVert=&trendGroupVertSub=&vtrendGroupHoriz=&vtrendType=day&vtrendGroupVertSub=&customOrder1=&customOrder2"+
				"=&filter.1=&filterOp.1=eq&_report_name=&_actionId=service_builder&pdfcstm_option=un_needed&userNameNeeded=Y&"
				+"pdfcstm_option=dt_needed&dt_needed=true&pdfcstm_option=hsp_needed&hsp_needed=true&hsp_needed_h=false&"
				+"pdfcstm_option=pgn_needed&pgn_needed=true&grpn_needed=false&skip_repeated_values=false&pdfcstm_option=filterDesc_needed"
				+"&filterDesc_needed=true";
		String aarr[]=demo.split("&");
		for(int i=0;i<aarr.length;i++)
			System.out.println(aarr[i]);
	}

}
