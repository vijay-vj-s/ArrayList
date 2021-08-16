import java.util.ArrayList;
public class ArrayList20{
		public static void main(String[]args){
		
		ArrayList<String>arrayList=new ArrayList<>();
		try{
		arrayList.add(args[0]);
		arrayList.add(args[1]);
		arrayList.add(args[2]);
		arrayList.add(args[3]);
		arrayList.add(args[4]);
			
	     if(arrayList.contains(args[5])){
		   
		 	System.out.println("Given String is present in the arrayList");
		 }
		 else
		     {
			   System.out.println("Given String is not present in the Array List ");
		 }
		int size=arrayList.size();
		System.out.println("Size of the Array is :"+size);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Enter Five Inputs");
			
		}
		
		}

}