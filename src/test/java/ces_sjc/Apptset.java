package ces_sjc;

import cse_sjc.App;

public class Apptset {
	@Test
	Run|Debug
	public void testlogin()
	{
		App myapp=new App();
		{
			Assert.assertEquals(0,myapp.userLogin("abc", "abc@123"));
		}
		@Test
		Run|Debug
		public void testlogin()
		{
			App myapp=new App();
			{
				Assert.assertEquals(1,myapp.userLogin("abc", "abc@123"));
			}
		}
	}

}
