import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList16 extends ArrayList<Long>{
		public static void main(String[]args){
	try{
		ArrayList16 arrayList=new ArrayList16();
		for(int i=0;i<args.length;i++){
			arrayList.add(Long.parseLong(args[i]));
		}
			
	 arrayList.removeRange(4,8);
		int size=arrayList.size();
		System.out.println("size of the list is :"+size);
		System.out.println("After Removed one of the value"+arrayList);
		System.out.println("New Array List is :"+arrayList);		
	}
	catch(NumberFormatException e){
		System.out.println("Enter Only Float values");
		
		
	}
		}

}