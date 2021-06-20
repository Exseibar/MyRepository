package core;

public class Teacher extends Person {

	private Profession profession;

	// CTOR
	public Teacher(int age, String name, Profession profession) {
		super(age, name);
		this.profession = profession;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "[" + name + " age=" + age + "]" + '\n';
	}

}
