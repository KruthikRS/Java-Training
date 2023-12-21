package inheritance;

public class country {
	    String name;
	    long population;

	    public Country(String name, long population) {
	        this.name = name;
	        this.population = population;
	    }

	    public void displayDetails() {
	        System.out.println("Country: " + name);
	        System.out.println("Population: " + population);
	    }
	}

public class State extends Country {
	    String stateCapital;

	    public State(String name, long population, String stateCapital) {
	        super(name, population);
	        this.stateCapital = stateCapital;
	    }

	    public void displayStateDetails() {
	        super.displayDetails();
	        System.out.println("State Capital: " + stateCapital);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Country country = new Country("United States", 331000000);

	        country.displayDetails();

	        State state = new State("California", 39510000, "Sacramento");

	        state.displayStateDetails();
	    }
	}

}
