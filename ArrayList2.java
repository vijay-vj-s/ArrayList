import java.util.ArrayList;
public class ArrayList2{
		public static void main(String[]args){

        ArrayList<Integer>arrayList=new ArrayList<Integer>();
	
		try{
		arrayList.add(args[0]);
		arrayList.add(args[1]);
		arrayList.add(args[2]);
		arrayList.add(args[3]);
		arrayList.add(args[4]);
		System.out.println(arraylist);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Enter the Five arguments");
		}
		
		int size=arrayList.size();
		System.out.println("Size of the Array is :"+size);
		}



}