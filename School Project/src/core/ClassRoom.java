package core;

import java.util.Arrays;

public class ClassRoom {

	private static final int SIZE = 15;

	private String name;
	private Teacher teacher;
	private Student[] students;

	public ClassRoom(String name, Teacher teacher, Student[] students) {
		this.name = name;
		this.teacher = teacher;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public static int getSize() {
		return SIZE;
	}

	@Override
	public String toString() {
		return name + " " + teacher + Arrays.toString(students) + "]" + '\n';
	}

}
