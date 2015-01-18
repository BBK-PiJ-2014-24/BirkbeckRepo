package qu_7;

public class TShirtException extends ShirtException{

	public TShirtException(){
		System.out.println("TShirtException Basic Constructor Exception");
	}
	
	
	public TShirtException(String msg){
		super(msg);
	}
	
}
