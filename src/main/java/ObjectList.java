public class ObjectList {
    private int numElements = 0;
 	private Object[] myShapes = new Object[100];

 	public void add(Object shape) {
 		myShapes[numElements++] = shape;
 	}

 	public String toString() {
 		String retVal = "";
 		for(int i = 0; i < numElements; i++) {
 			retVal += myShapes[i].toString();
 		}
 		return retVal;
 	}
}
