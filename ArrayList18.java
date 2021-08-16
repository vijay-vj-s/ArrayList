import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList18{
		public static void main(String[]args){
		ArrayList<String>arrayList1=new ArrayList<>();
		for(int i=0;i<5;i++){
		arrayList1.add(args[i]);
	    }
		
	  System.out.println("First Array List is :"+arrayList1);
		
		ArrayList<String>arrayList2=new ArrayList<>();
		
	   arrayList2.add(args[5]);
	   arrayList2.add(args[6]);
	   arrayList2.add(args[7]);
	   System.out.println("Second arrayList is :"+arrayList2);
	   arrayList1.retainAll(arrayList2);
	   int size=arrayList1.size();
	   System.out.println("size of the arrayList is :"+size);
	   System.out.println("After removing duplicate Elements :"+arrayList1);
	   
		}



}