import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ForensicReport {

	private Map<String,Date> reportMap=new HashMap<String,Date>();

	public Map<String, Date> getReportMap() {
		return reportMap;
	}

	public void setReportMap(Map<String, Date> reportMap) {
		this.reportMap = reportMap;
	}

    public void addReportDetails(String reportingOfficer, Date reportFiledDate) {
		//Fill the code here
		
	}

	public List<String> getOfficersWhoFiledReportsOnDate(Date reportFiledDate){

		//Fill the code here
		
		return null;
	}
}
