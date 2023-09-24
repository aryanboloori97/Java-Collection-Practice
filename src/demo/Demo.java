package demo;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
public static void main(String[] args) {

	
	
	List<Integer> arrayList1 =  new ArrayList<Integer>();
	List<Integer> linkedList1 = new LinkedList<Integer>();
	
	for (int i=0;i<100;i++) {
		
		arrayList1.add(i);
		linkedList1.add(i);
		
	}		
	
	System.out.println(arrayList1);
	addElementsToMiddle(arrayList1, 50);
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
System.out.println(list);


}
	
	
}
	
	


