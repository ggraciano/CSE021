package arraylist;

import java.util.ArrayList;

// the symbol 'CLASS' will stand for the class of elements that
// the ArrayList was declared with
public class TrackedArrayList<CLASS> extends ArrayList<CLASS> {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int ret2 = 0;
	
	public int maxSizeSoFar() {
		//return 0;
		int ret1 = super.size();
		if (ret1 > ret2) {
			ret2 = ret1;			
		}
		return ret2;
	} 

	
	//This is how you would override the remove method
	@Override
	public boolean remove(Object element) {
		// inside, you can use 'element' as you need
		boolean ret = super.remove(element);
		return ret;
	}
	

	// This is how you override the add method.  We can use the 
	// symbol 'CLASS' because we used it above, when we defined
	// TrackedArrayList
	@Override
	public boolean add(CLASS element) {
		// inside, you can use 'element' as necessary
		boolean ret = super.add(element);
		return ret;
	} 
	
	

	

	
}
