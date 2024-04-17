/** for Class Design - IntList  */

public class IntList {   //or IntList, caps at 100 elements with no bullet-proofing or bounds checks, etc.
 	private int numElements = 0;
 	private int[] data = new int[100];

 	public void add(int num) {
 		data[numElements++] = num;
 	}

 	public String toString() {
 		String retVal = "";
 		for(int i = 0; i < numElements; i++) {
 			retVal += data[i];
 		}
 		return retVal;
 	}

	public int sum(){
		int sum = 0;
		for(int i = 0; i < numElements; i++){
			sum += data[i];
		}
		return sum;
	}

	public int indexOf(int target){
		for(int i = 0; i < numElements; i++){
			if(data[i] == target){
				return i;
			}
		}
		return -1;
	}

 	//main goes here from the lab
}
