package net.cobertura;

import java.beans.Transient;
import java.lang.reflect.Field;

public class GithubIssues {
	boolean test;

	public boolean createBoundField(final Field field) {
		Class<?> primitive = boolean.class;
		if (((primitive).equals(field.getType()) || (Boolean.class).equals(field.getType())) && field.getAnnotation(SerializeAsNumber.class) != null) {
			return true;
		}
		return false;
	}

	@Transient
	public void noTestAnnoation() {
		if (test) {
			System.out.print("test");
		} else {
			System.out.print("test2");
		}
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}
}
