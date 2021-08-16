import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList15{
		public static void main(String[]args){
		
		ArrayList<Float>arrayList=new ArrayList<>();
		try{
		for(int i=0;i<args.length;i++){
			arrayList.add(Float.parseFloat(args[0]));
						
		}
				
		arraylist.remove(3);
		int size=arrayList.size();
		System.out.println("size of the list is :"+size);
		System.out.println("After Removed one of the value"+arrayList);
		
		}
		catch(Exception e){
			
			System.out.println("Enter the proper inputs");
		}
		
		
		
		
		
		}



}