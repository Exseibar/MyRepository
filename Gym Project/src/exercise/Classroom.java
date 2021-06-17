package exercise;

public class Classroom {

	private final int MAX_MEMBERS = 10;
	private Member[] members;
	private Type type;
	private Trainer trainer;
	private int id;

	public Classroom(Trainer trainer, Type type, int id) {

		members = new Member[MAX_MEMBERS];
		this.trainer = trainer;
		this.type = type;
		this.id = id;
	}

	public double getClassPayment() {
		int totalClassPayment = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				totalClassPayment += members[i].getMonthlyPayment();
			}
		}
		return totalClassPayment;
	}

	public Member[] getMembers() {
		return members;
	}

	public void setMembers(Member[] members) {
		this.members = members;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Classroom [type=" + type + ", id=" + id + "]";
	}

}
