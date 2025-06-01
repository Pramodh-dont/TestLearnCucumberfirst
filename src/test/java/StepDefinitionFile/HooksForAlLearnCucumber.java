package StepDefinitionFile;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksForAlLearnCucumber{
	@Before
	public void FirstOfEveryStep() {
		System.out.println("******************************\n start here");
	}
	
	@After
	public void LastOfEveryStep() {
		System.out.println("******************************\n end here");
	}
}
