package qu_7;

public class Laundry {


	
	public Laundry(String clotheItem){
		System.out.println("Open Laundry");
	}
	
	public void doTShirtLaundry(Clothes c) throws TShirtException{
			
		String ClotheItem = c.getClotheType();
		if(ClotheItem.equals("TShirt")){
			System.out.println("Washing TShirt");
		}
		else{
			throw new TShirtException(); 
		}
		
		
	}

}
