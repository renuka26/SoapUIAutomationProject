package Soap;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner.Status;

import junit.framework.Assert;

public class Runner {

	
	public static void main(String[] args) {
		
		try {
			
			WsdlProject project=new WsdlProject("C:\\Users\\M1047284\\Desktop\\201 Courses\\WebServices\\SampleXMLFile\\LibraryAPI.xml");
			System.out.println(project.getTestSuiteList());
			
			WsdlTestSuite requiredTestSuiteName=project.getTestSuiteByName("LibrarySuite");
			
			for(int testcase=0;testcase<=requiredTestSuiteName.getTestCaseCount();testcase++)
			{
				WsdlTestCase tc=requiredTestSuiteName.getTestCaseAt(testcase);
				System.out.println(" Test case :"+tc);
				WsdlTestCaseRunner status=tc.run(new PropertiesMap(), false);//tc.run(new PropertiesMap(), false);
				Assert.assertEquals(Status.FINISHED, status);
				
			}
			//System.out.println("heloo..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
