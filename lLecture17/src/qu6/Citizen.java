package qu6;

import java.util.Random;


class Citizen implements Runnable{
    
	// Fields
	// -------
	private MutableIDCard id;
	
	// Constructor
	// -----------
    public Citizen(MutableIDCard id){
        this.id = id;
    }
    
    
    // Thread run()
    // ------------
    public void run(){
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(2000));
        }
        catch (InterruptedException e) {e.printStackTrace();}
        
        String message = "";
        message += "the name on this id is "+id.getName()+"\n";
        message += "and the date of birth is "+id.getDateOfBirth();
        System.out.println(message);
    }
}