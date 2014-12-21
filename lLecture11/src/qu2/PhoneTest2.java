
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
 */
package qu2;

import qu1_4.MobilePhone;
import qu1_4.SmartPhone;

public class PhoneTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			PhoneTest2 p = new PhoneTest2();
			p.launch();
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
		((SmartPhone) s1).browseWeb("Amazon.com");
		((SmartPhone)s1).findPoistion();
		s1.call("222-2222");
		s1.call("00-333-3333");
		
		
	}

} // end class
