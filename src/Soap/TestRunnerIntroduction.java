package Soap;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class TestRunnerIntroduction {

	public static void main(String[] args) throws Exception {
		SoapUITestCaseRunner tcr=new SoapUITestCaseRunner();
		tcr.setProjectFile("C:\\Users\\M1047284\\Desktop\\201 Courses\\WebServices\\SampleXMLFile\\LibraryAPI.xml");
		boolean status=tcr.run();
		System.out.println(status);
	}
	
}
