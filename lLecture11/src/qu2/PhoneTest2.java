
/*
 * For this exercise, you will need to use again some classes and interfaces you created last day: 
 * Phone, OldPhone, MobilePhone, SmartPhone.
 * 
 * 2.1 Start
 * Create a script that builds a new SmartPhone with the line: Smartphone myPhone = new Smartphone();
 * and then uses all its methods.
 * 
 * 2.2 Direct upcasting
 * Change the script so that the SmartPhone is created with the line: 
 * Mobilephone myPhone = new Smartphone();
 * Compile your code again. Are there any problems? Why do this problems happen? 
 * What are the possible solutions?
 * 
 * 
 * 2.3 Indirect upcasting when calling a method
 * Pass this object to a method testPhone(Phone) that has only one parameter of type Phone. 
 * What methods can you call on the object inside the method?
 * 
 * 2.4 Downcasting
 * Inside the former method, downcast the object to Smartphone so that you can use all the 
 * public methods of Smartphone.
 * 
 * 2.5 Casting exception
 * Create a MobilePhone object and then pass it to method testPhone(Phone). What happens?
 */
package qu2;

import qu1_4.*;
import qu1_4.MobilePhone;
import qu1_4.SmartPhone;

public class PhoneTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			PhoneTest2 pTest = new PhoneTest2();
			pTest.launch();
			
			SmartPhone sp = new SmartPhone("Samsung");
			MobilePhone mp = new MobilePhone("Motorola");
			System.out.println("\nUsing testPhone Method");
			pTest.testPhone(sp);
			pTest.testPhone(mp); // Can't Do As Wrong DownCasting
			
			
	} // end main
	
	public void launch(){
		
		SmartPhone s = new SmartPhone("iPhone");
		s.getBrand();
		s.browseWeb("Amazon.com");
		s.findPoistion();
		s.call("222-2222");
		s.call("00-333-3333");
		
		System.out.println("\nDirect Upcasting:");
		MobilePhone s1 = new SmartPhone("iPhone");
		s1.getBrand();
		((SmartPhone) s1).browseWeb("Amazon.com");  // VERY  IMPORTANT !!!!
		((SmartPhone)s1).findPoistion();				// VERY  IMPORTANT !!!!
		s1.call("222-2222");
		s1.call("00-333-3333");
		
		
	}
	
	
	public void testPhone(OldPhone p){
		System.out.println("\nIndirect DownCasting via Method Call ");
		p.call("111-1111");
		((SmartPhone) p).call("00-333-3333");			// VERY  IMPORTANT !!!!
		((SmartPhone) p).getBrand();
		((SmartPhone) p).findPoistion();
		
	
	}

} // end class
