package qu6;

import java.awt.image.BufferedImage;
import java.util.Date;

class MutableIDCard{
    
	// Fields   // make Fields Final!!
	// ------
	private final String name;      
    private final Date dateOfBirth;
    private final BufferedImage photo;
    
    // Constructor
    // -----------
    public MutableIDCard(String name,Date dateOfBirth,BufferedImage photo){
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.photo=photo;
    }
    
    // Setter     // Immutable Classes CANNOT HAVE SETTERS
    // ------
    public void set(String name,Date dateOfBirth,BufferedImage photo) {
        check(name,dateOfBirth,photo);
      
  /*    synchronized(this){
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.photo = photo;
        } 
      */     
    }
    
    
    // getter - getName
    // -----------------
    public synchronized String getName(){
        return name;
    }
    
    // getter - getDateOfBirth
    // -----------------------
    public synchronized Date getDateOfBirth(){
        return dateOfBirth;
    }
    
    // getter - Photo
    // -----------------------  
    public synchronized BufferedImage getPhoto(){
        return photo;
    }
    
    
    // check()
    // -------
    
    public void check(String name,Date dateOfBirth,BufferedImage photo){
        
    	if (name==null || name.equals("")){
            throw new IllegalArgumentException();
        }
        
    	if (dateOfBirth==null){
            throw new IllegalArgumentException();
        }
    	
        long age=getAge(dateOfBirth);
        
        if (dateOfBirth == null || age<=0){
        	throw new IllegalArgumentException(); 
        }

        if (photo==null){
        	throw new IllegalArgumentException();
        }
    }
    
    
    
    private long getAge(Date dateOfBirth)
    {
        long now = new Date().getTime();
        long age = now - dateOfBirth.getTime();
        return age;
    }
}