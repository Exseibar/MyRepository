package core;

import java.util.Arrays;

public class School {

	private static final int SIZE = 5;

	private ClassRoom[] classrooms = new ClassRoom[SIZE];

	public static int getSize() {
		return SIZE;
	}

	public ClassRoom[] getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(ClassRoom[] classrooms) {
		this.classrooms = classrooms;
	}

	@Override
	public String toString() {
		return "Classrooms=" + Arrays.toString(classrooms);
	}

}
