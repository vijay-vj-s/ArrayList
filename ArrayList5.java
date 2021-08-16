import java.util.ArrayList;
  public class ArrayList5{
	  public static void main(String[]args){
	  ArrayList<Object> arrayList=new ArrayList<>();
	 
	   ArrayList5 newArrayList1=new ArrayList5();
	   ArrayList5 newArrayList2=new ArrayList5();
	 
	   arrayList.add(1);
	   arrayList.add(2);
	   arrayList.add("A");
	   arrayList.add("B");
	   arrayList.add(newArrayList1);
	   arrayList.add(newArrayList2);
	
	    
	 
		System.out.println("Array List is :"+arrayList);
		int size=arrayList.size();
		System.out.println("Size of the Array list is :"+size);
		
	                
	  }  
	  
  }