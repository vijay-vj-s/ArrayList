import java.util.ArrayList;
public class ArrayList3{
		public static void main(String[]args){

        ArrayList<Integer>arrayList=new ArrayList<Integer>();
	
		try{
		arrayList.add(Integer.parseInt(args[0]));
		arrayList.add(Integer.parseInt(args[1]));
		arrayList.add(Integer.parseInt(args[2]));
		arrayList.add(Integer.parseInt(args[3]));
		arrayList.add(Integer.parseInt(args[4]));
		System.out.println("Array list is :"+arrayList);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println(" Enter the Five arguments :");
		}
		catch(NumberFormatException e){
			
			System.out.println(" Enter only Integers :");
		}
		int size=arrayList.size();
		System.out.println("Size of the Array is :"+size);
		}



}