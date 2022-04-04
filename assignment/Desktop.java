package week3.ass.assignment;

public  class Desktop implements Hardware,Software{

	
	public void desktopModels() {
		System.out.println("hello");
	}
	
	public void hardwareResources() {
		System.out.println("hi hardware");
	}
	
	public void softwareResources() {
		System.out.println("hi software");
	}
	public static void main(String[] args) {
		
		
		Desktop des = new Desktop();
		des.desktopModels();
		des.hardwareResources();
		des.softwareResources();
		
		
	}

	public void hardwareResourcs() {
		// TODO Auto-generated method stub
		
	}
	
	
}
