package map;

public class MyMap implements SimpleMap {

	// Fields
	// ------
	
	private int[] keyArray;
	private String[] strArray;
	private int index;
	private int size;
	
	// Constructors
	// ------------
	public MyMap(int size){
		keyArray = new int[size];
		strArray = new String[size];
		index = 0;
		this.size = size;
	}
	
	// put
	// ---
	@Override
	public void put(int key, String name) {
		keyArray[index] = key;
		strArray[index] = name;
		index++;
	}
	
	
	// get()
	// -----
	@Override
	public String get(int key) {
		int i=0;
		while(i<size){
			if(key==keyArray[i])
				return strArray[i];
			else
				i++;
		}
		return "ERROR: Key Not found";
	} // end get

	
	// remove()
	// --------
	@Override
	public void remove(int key) {
		int i=0;
		while(i<size){
			if(key == keyArray[i]){
				keyArray[i] = 0;
				strArray[i] = null;
				index --;
			}
			else
				i++;
		}
	}  //end remove

	
	// isEmpty()
	@Override
	public boolean isEmpty() {
		if(index == 0)
			return true;
		else
			return false;
	} // end isEmpty
} // end Class