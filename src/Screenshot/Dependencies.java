package Screenshot;

import org.testng.Assert;
import org.testng.annotations.Test;

public class  Dependencies
{
@Test
public void compose()
{
	System.out.println("Compose");
}
@Test(dependsOnMethods="compose")
public void sentitems()
{
	System.out.println("sentitems");
	Assert.fail();
}
@Test(dependsOnMethods="sentitems")
public void draft()
{
	System.out.println("Draft");
}
}
