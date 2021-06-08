package advanced.exercises;

public class Array {

	public static void main(String[] args) {
		int[][] studentGrades = new int[20][10];
		int classAvgSum = 0;
		int student = 1;

		for (int i = 0; i < studentGrades.length; i++) {

			int sum = 0;

			for (int j = 0; j < studentGrades[i].length; j++) {
				studentGrades[i][j] = (int) (Math.random() * 31) + 70;
				sum += studentGrades[i][j];
			}
			System.out.println("student " + student + " average " + sum / 10);
			student++;
			classAvgSum += sum / 10;
		}

		System.out.println("Class average: " + (classAvgSum / 20));

	}
}
