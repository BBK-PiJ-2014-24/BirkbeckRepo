package qu6;

import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.Random;

class Officer implements Runnable{
   
	// Fields
	// ------
	private MutableIDCard id;
    
	// Constructor
	// -----------
	public Officer(MutableIDCard id){
        this.id=id;
    }
	
	// Thread run()
	// -------------
    public void run(){
        Random r=new Random();
        try {
            Thread.sleep(r.nextInt(2000));
        }
        catch (InterruptedException e){e.printStackTrace();}

        String name = DataGenerator.getNextName();
        Date dateOfBirth = DataGenerator.getNextDate();
        BufferedImage photo = DataGenerator.getNextPhoto();
        id.set(name, dateOfBirth, photo);   // This Will Now Be A Check, Not a SET
    }
}