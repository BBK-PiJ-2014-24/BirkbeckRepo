package qu6;

import java.util.Date;
import java.util.StringTokenizer;
import java.util.Random;
import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ImmutableExample{
    
	// main()
	// ------
	public static void main(String[] args) {
        String name = DataGenerator.getNextName();
        Date dateOfBirth = DataGenerator.getNextDate();
        BufferedImage photo = DataGenerator.getNextPhoto();
        MutableIDCard id = new MutableIDCard(name,dateOfBirth,photo);
        
        Runnable officer = new Officer(id);
        Runnable citizen = new Citizen(id);
        
        Thread t1 = new Thread(officer);
        Thread t2 = new Thread(citizen);
        t1.start();
        t2.start();
    }
}
	


