package demo;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
public static void main(String[] args) {

	
	
	List<Integer> arrayList1 =  new ArrayList<Integer>();
	List<Integer> linkedList1 = new LinkedList<Integer>();
	
	for (int i=1;i<=100;i++) {
		
		arrayList1.add(i);
		linkedList1.add(i);
		
	}		
	removeElementsFromEnd(arrayList1, 10);
	
	System.out.println(arrayList1);
	}
	
public static void addElementsToBeginning(List<Integer> list, int numberOfElements) {

	
		
		for (int i=0; i<numberOfElements; i++) {
			list.add(i, i);
		}



}
public static void addElementsToMiddle(List<Integer> list, int numberOfElements) {

	
	
	int indexToAdd = (int)(list.size()/2);
	for (int i=0;i<numberOfElements; i++) {
		System.out.println(indexToAdd);
		list.add(indexToAdd, i);
		indexToAdd++;
	}

}

public static void addElementsToEnd(List<Integer> list, int numberOfElements) {

	
	
	for (int i=0; i<numberOfElements; i++) {
		
		
		list.add(i);
	}


}

public static void removeElementsFromBeginning(List<Integer> list, int numberOfElements) {
	
	for (int i=0; i<numberOfElements;i++) {
		
		list.remove(0);
		
		
	}
	
	
}
public static void removeElementsFromMiddle(List<Integer> list, int numberOfElements) {
	int indexToRemove = (int)(list.size()/2);
	for (int i=0; i<numberOfElements;i++) {
		list.remove(indexToRemove);
	
		
	}
	
	
}
public static void removeElementsFromEnd(List<Integer> list, int numberOfElements) {
	
	for (int i=0; i<numberOfElements;i++) {
		
		list.remove(list.size()-1);
		
		
	}
	
	
}
	
}
	
	


