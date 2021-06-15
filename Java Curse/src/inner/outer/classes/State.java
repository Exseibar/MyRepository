package inner.outer.classes;

public class State {

	private String name;
	private int population;
	public static int worldPopulation;

	public State(String name, int population) {
		this.name = name;
		this.population = population;
		worldPopulation += population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public static int getWorldPopulation() {
		return worldPopulation;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + "]";
	}

	public class Citizen {

		private int id;
		private String name;
		{
			worldPopulation++;
		}

		public Citizen(String name) {
			this.name = name;
			this.id = population++;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStateName() {
			return State.this.name;
		}

		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Citizen [id=" + id + ", name=" + name + ", state=" + State.this.name + "]";
		}

	}

}
