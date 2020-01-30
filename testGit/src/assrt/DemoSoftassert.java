package assrt;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftassert
{
@Test
public void m1()
{
	String s1="araj";
	String s2="raj";
	
	System.out.println("m1 start");
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(s1, s2);
	
	System.out.println("end");
System.out.println("finish");
	sa.assertAll();
	
}
}
