
public class CarDealing {

	public static void main(String[] args) {
		
		CarDealing cd = new CarDealing();
		
		Car oldCar = new Car();
		oldCar.model = "ka";
		oldCar.price = 2000;
		
		Car saleCar = new Car();
		saleCar.model = "911";
		saleCar.price = 300000;
		
		System.out.println();
		System.out.println("Before Method");
		System.out.println("-------------");
		System.out.println(" old car details: " + oldCar.model + " " +  oldCar.price);
		System.out.println(" sale car details: " + saleCar.model + " " +  saleCar.price);
		
		cd.tradez(oldCar,saleCar);
		
		System.out.println();
		System.out.println("After Method");
		System.out.println("------------");
		System.out.println(" old car details: " + oldCar.model + " " +  oldCar.price);
		System.out.println(" sale car details: " + saleCar.model + " " +  saleCar.price);
	}
		
		public void tradez(Car oCar,Car sCar){
			Car temp = new Car();
			
			temp = oCar;
			oCar = sCar;
			sCar = temp;
			
			sCar.price = 2;
			System.out.println();
			System.out.println("During Method");
			System.out.println("-------------");
			System.out.println(" Method o car details: " + oCar.model + " " +  oCar.price);
			System.out.println(" Method s car details: " + sCar.model + " " +  sCar.price);
					
		}
		



}
