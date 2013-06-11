package net.cobertura;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;

import org.junit.Before;
import org.junit.Test;

public class GitHubIssueTest {

	public static class TestBoolean {
		@SerializeAsNumber
		boolean boss;

		Boolean no;

		Integer in;

		public boolean isBoss() {
			return boss;
		}

		public void setBoss(boolean boss) {
			this.boss = boss;
		}

		public Boolean getNo() {
			return no;
		}

		public void setNo(Boolean no) {
			this.no = no;
		}

		public Integer getIn() {
			return in;
		}

		public void setIn(Integer in) {
			this.in = in;
		}

	}
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		GithubIssues test = new GithubIssues();
		for (Field field : TestBoolean.class.getDeclaredFields()) {
			if ("boss".equals(field.getName())) {
				assertEquals(true, test.createBoundField(field));
			} else {
				assertEquals(false, test.createBoundField(field));
			}
		}
	}

}
