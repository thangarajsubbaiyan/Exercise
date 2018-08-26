package oops.coding;



import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringExerciseTest {
	
	static StringExercise stringExercise = null;
	
	@BeforeClass
	public static void executeBeforeTest(){
		System.out.println("Before==========");
		 stringExercise = new StringExercise();
	}

	
	@Test
	public void testHasUniqueCharcters(){
		Assert.assertTrue(stringExercise.hasUniqueCharcters("thang"));
		
	}
	
	@Test
	public void testNotHasUniqueCharcters(){
		Assert.assertFalse(stringExercise.hasUniqueCharcters("thangaa"));
		String first ="first";
		String second =new String("first");
		Assert.assertEquals(first, second);
		
	}

}
