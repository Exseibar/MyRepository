package exercise;

public class Gym {

	private final int MAX_CLASSES = 5;

	private Classroom[] classrooms;

	// Gym is a Singleton////////////////////////////////////////////////////
	private Gym() {
		Classroom[] classrooms = new Classroom[MAX_CLASSES];
	}

	private static Gym gym = new Gym();

	public static Gym getGym() {
		return gym;
	}

	////////////////////////////////////////////////////////////////////////

	public Classroom[] getClassrooms() {
		return this.classrooms;

	}

}
