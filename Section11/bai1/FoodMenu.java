package bai1;

public enum FoodMenu {
	CAFE(1,"Cafe"), MILK_TEA(2,"Milk Tea");
	
	private int id;
	private String name;
	
	private FoodMenu(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		for(FoodMenu fm : FoodMenu.values()) {
			System.out.println(fm.getId() + " - " + fm.getName());
		}
	}

}
