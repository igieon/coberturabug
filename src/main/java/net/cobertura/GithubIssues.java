package net.cobertura;

import java.lang.reflect.Field;

public class GithubIssues {

	public String createBoundField(final Field field) {
		if (((boolean.class).equals(field.getClass()) || (Boolean.class).equals(field.getClass())) && field.getAnnotation(SerializeAsNumber.class) != null) {
			return "boolean with annotation";
		}
		return "nothing";
	}
}
