package ObjectOrientedProgramme;
interface vehicle{
	void start();
	default void stop()
	{
		System.out.println("Vehcle is stopping");
	}
	static void fuelType() {
		System.out.println("Diesel or petrol");
	}
}
class car implements vehicle{
	 public void start() {
			System.out.println("Car is Starting");
			
	}
	
}
public class Default_Static_Method {

	public static void main(String[] args) {
car marurti = new car();
marurti.start();
marurti.stop();
vehicle.fuelType();
	}

}
