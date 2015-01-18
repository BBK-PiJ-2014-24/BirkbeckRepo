package qu_7;

public class ClothingException extends Exception{
	
	public ClothingException(){
		System.out.println("Basic ClothingException Constructor Warning Msg");
	}
	
	public ClothingException(String msg){
		super(msg);
	}

}
