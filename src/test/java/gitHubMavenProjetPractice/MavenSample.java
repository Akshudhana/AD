package gitHubMavenProjetPractice;

import org.testng.annotations.Test;

public class MavenSample {

	@Test(groups = "smoke")
	public void msample()
	{
		System.out.println("--mavenSample1--");
	}
	
	
	@Test(groups = "regrassion")
	public void mavenSample() {
		System.out.println("--mavenSample2--");
		System.out.println("-------");
	}
}
