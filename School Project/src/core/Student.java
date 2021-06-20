package core;

import java.util.Arrays;

public class Student extends Person {

	private static final int SIZE = 6;

	private int[] grades;
	private Profession[] classes;

	public Student(int age, String name) {
		super(age, name);
		grades = new int[SIZE];

	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public Profession[] getProfessions() {
		return classes;
	}

	public void setProfessions(Profession[] classes) {
		this.classes = classes;
	}

	public static int getSize() {
		return SIZE;
	}

	@Override
	public String toString() {
		return name + " age= " + age + " " + Arrays.toString(grades) + '\n';
	}

}
