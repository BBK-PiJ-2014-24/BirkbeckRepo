
public enum CoinEnum {

	// List of ENUM Constant Types Objects
	// -----------------------------------	
	
    PENNY(1), 
    NICKLE(5), 
    DIME(10), 
    QUARTER(25);
    
	// List Enum Constant Fields (Properties)
	// ---------------------------------------
    private final int value$;

    
	// Constructor (Note no modifier at all, as instantiates internally))
	// -----------
	
    CoinEnum(int v){
    	value$ = v;
    }
    
    // getter
    // ------
    
    public int getCoinValue(){
    	return value$;
    }
	
    
	
}
