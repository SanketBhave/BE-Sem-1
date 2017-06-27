import java.util.Scanner;
import java.io.*;
import java.util.Random;;

class Search extends Sort{
	int mid,key;
	Scanner sc=new Scanner(System.in);
	
	Search(){
		
		System.out.println("Enter element to be searched");
		key=sc.nextInt();
		sc.close();
	}
	public int search(int low,int high){
		mid=(low+high)/2;
		if(Sort.array[mid]==key){
			System.out.println("Element found at "+mid);
			return mid;
		}
		else if (key<Sort.array[mid]){
			search(low,mid-1);
		}
		else
		{
			search(mid+1,high);
		}
		return -1;
	}
	
}
 class Sort{
	static int[] array;
	Random r=new Random();
	int partition,pivot;
	
	Sort(){
		/*try{
			File file = new File("input.txt");
			byte[] bytes = new byte[(int) file.length()];
			FileInputStream fis = new FileInputStream(file);
			fis.read(bytes);
			fis.close();
			String[] valueStr = new String(bytes).trim().split("\\s+");
			 array = new int[valueStr.length];
			for (int i = 0; i < valueStr.length; i++) 
			    array[i] = Integer.parseInt(valueStr[i]);
			quickSort(0,valueStr.length);
		}catch(Exception e){}*/
		  /*System.out.println("Enter array elements");*/
		array=new int[10];
		  for(int i=0;i<10;i++){
			 array[i]=r.nextInt(100);
			 }
		  quickSort(0,9);
		  
		 
	}

	
	public int sort(int low,int high,int pivot){
		int temp;
		int left=low,right=high;
	  while (true){
	  	while(array[left]<=pivot){left++;}
			
		while(array[right]>pivot && right>=0){right--;}
		
		if(left>right)
			break;
		else{
			temp=array[left];
			array[left]=array[right];
			array[right]=temp;
			}
		
	}
		temp=left;
		left=right;
		right=temp;
		return left ;
	}
	public void quickSort(int left,int right)
	 {
		 if(right-left<=0)
			 return;
		 else{
		 pivot=array[right];
		 partition=sort(left,right,pivot);
		 quickSort(left,partition-1);
		 quickSort(partition,right-1);
		 }
	 }
	public void print()
	{
		for(int i=0;i<10;i++)
			System.out.println(array[i]);
	}
	
}
public class Binary {
 


	 public static void main(String args[]) throws IOException{
	 
		 int pos;
		// Random r=new Random();
		// Scanner sc1=new Scanner(System.in);
		/* System.out.println("Enter how many elements you want to search in:");
		 int num=sc1.nextInt();
		 sc1.close();*/
		 
		 try{
			 
			 FileWriter out=new FileWriter("input.txt");
			 //for(int i=0;i<1000;i++){
			 //int random=
			// System.out.print(r.nextInt(100));
			 //out.write(random);
			 //}
			 out.close();
			 
		 }catch(Exception e){
			 System.out.println(e);
		 }
		Search obj=new Search();
		obj.print();
		pos=obj.search(0, 9);
		System.out.println("Element found at "+pos);
		 
	 }

}