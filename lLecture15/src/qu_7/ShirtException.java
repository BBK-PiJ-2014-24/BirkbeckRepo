package qu_7;

public class ShirtException extends ClothingException {

	public ShirtException(){
		System.out.println("ShirtException Basic Constructor Warning Message");
	}
	
	public ShirtException(String msg){
		super(msg);
	}
}
