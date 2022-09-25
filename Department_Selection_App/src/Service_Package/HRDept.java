package Service_Package;

public class HRDept extends SuperDept {

	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today's worksheet & mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}

}
