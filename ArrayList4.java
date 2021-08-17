import java.util.ArrayList;

public class ArrayList4{
	
		public static void main(String[]args){
			
		
		ArrayList<ArrayList4>arrayList=new ArrayList<>();
	   
	     ArrayList4 newArrayList1=new ArrayList4();	 
         ArrayList4 newArrayList2=new ArrayList4();	 
          arrayList.add(newArrayList1);
		  arrayList.add(newArrayList2);
	  
		
		
		System.out.println("Array List is :"+arrayList);
		int size=arrayList.size();
		System.out.println("Size of the ArrayList is :"+size);

		
		}
		


}