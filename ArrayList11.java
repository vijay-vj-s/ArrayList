import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayList11{
		public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String>arrayList1=new ArrayList<String>();
		
		    for(int i=0;i<args.length;i++){
			  arrayList1.add(args[i]);
			  System.out.println("First ArrayList Is :"+arrayList1);
	
		
			 
		   }
		   
		   List<String>arrayList2=arrayList1.subList(3,8);
		     System.out.println("Second ArrayList is :"+arrayList2);
		
		
		}



}