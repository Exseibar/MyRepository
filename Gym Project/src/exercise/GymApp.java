package exercise;

public class GymApp {
	public static void main(String[] args) {

		GymStatistics GS;
		Gym gym = Gym.getGym();

		GS = new GymStatistics(gym);

	}
}