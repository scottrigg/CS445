package srigg.Delectable.objects;

public class Report {

	private int RID;
	private String report_name;
	
	public Report(int rid, String name)
	{
		RID=rid;
		report_name=name;
	}
	
	public String getReportName()
	{
		return report_name;
	}
	
	public int getRID()
	{
		return RID;
	}
	
	public boolean matchesRID(int rid)
	{
		return rid==RID;
	}
	
}
