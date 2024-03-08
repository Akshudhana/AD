package gitHubMavenProjetPractice;

import org.testng.annotations.Test;

public class Maven_2_project {
@Test(groups = "Smoke")
public void add1()
{
	System.out.println("---mave2_project---");
}

@Test(groups = "Regrassion")
public void add() {
	System.out.println("------");
}

@Test(groups = "Regrassion")
public void sub() {
	System.out.println("====");
}

@Test(groups = "Smoke")
public void addw() {
	System.out.println("----");
	System.out.println("====");
}
}
