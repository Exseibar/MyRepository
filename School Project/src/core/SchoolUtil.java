package core;

public class SchoolUtil {

	private static int studentNum = 0;;
	private static int classroomNum = 0;
	private static int classroomSum = 0;

	public static int getStudentNum() {
		if (studentNum == ClassRoom.getSize()) {
			studentNum = 0;
		}
		studentNum++;

		return studentNum;
	}

	public static int getClassroomNum() {
		if (classroomNum == School.getSize()) {
			classroomNum = 0;
		}
		classroomNum++;

		return classroomNum;

	}

	public static void setClassSum() {

	}

	public static Profession getRandomProfession() { // randomize teacher profession and classroom.
		return Profession.values()[(int) (Math.random() * Profession.values().length)];
	}

	public static Student getRandomStudent() {
		classroomSum = 0;
		int num = getStudentNum();
		String studentName = "Student-" + num;
		int studentAge = getRandomInt(20, 120);
		Profession[] professions = new Profession[Student.getSize()]; // all professions for each student
		for (int i = 0; i < Profession.values().length; i++) {
			professions[i] = Profession.values()[i];
		}
		int[] grades = new int[Student.getSize()];
		for (int i = 0; i < grades.length; i++) { // randomize grades.
			grades[i] = getRandomInt(40, 100);
			classroomSum += grades[i];
		}
		Student student = new Student(studentAge, studentName);
		student.setProfessions(professions);
		student.setGrades(grades);
		return student;

	}

	public static Teacher getRandomTeacher() {

		Profession profession = getRandomProfession();

		String teacherName = "Teacher for-" + profession;

		int teacherAge = getRandomInt(20, 120);

		Teacher teacher = new Teacher(teacherAge, teacherName, profession);

		return teacher;

	}

	public static ClassRoom getRandomClassroom() {
		int num = getClassroomNum();
		String name = "Class- " + num;
		Teacher teacher = getRandomTeacher();
		Student[] students = new Student[ClassRoom.getSize()];
		for (int i = 0; i < ClassRoom.getSize(); i++) {
			students[i] = getRandomStudent();
		}
		ClassRoom classroom = new ClassRoom(name, teacher, students);
		return classroom;
	}

	public static School getRandomSchool() {
		School school = new School();
		ClassRoom[] classrooms = new ClassRoom[School.getSize()];
		for (int i = 0; i < classrooms.length; i++) {
			classrooms[i] = getRandomClassroom();
		}
		school.setClassrooms(classrooms);
		return school;
	}

	public static int getRandomInt(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

}
