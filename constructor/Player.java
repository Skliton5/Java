package constructor;

public class Player {
	int id;
	String name;
	public Player(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println(this.id+"----"+this.name);
	}

	public static void main(String[] args) {
		Player p1 = new Player(10, "Sachin");
		Player p2 = new Player(45, "Rohit");
		Player p3= new Player(18, "Virat");
		Player p4 = new Player(7, "Dhoni");
		
	}

}
