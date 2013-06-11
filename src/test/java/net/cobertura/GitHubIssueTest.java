package net.cobertura;

import java.lang.reflect.Field;

import org.junit.Before;
import org.junit.Test;

public class GitHubIssueTest {

	public class TestBoolean {
		@SerializeAsNumber
		boolean boss;

		Boolean no;

	}
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		GithubIssues test = new GithubIssues();
		for (Field field : TestBoolean.class.getFields()) {
			test.createBoundField(field);
		}
	}

}
