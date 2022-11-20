package World.Math;
import org.junit.*;

public class MathTest {
	
	@Test
	public void TestAdd()
	{
		BasicMath bm = new BasicMath();
		int result = bm.add(1,2);
		
		
		Assert.assertEquals(result, 3);
	}
	
}
