import java.util.Scanner;
import java.util.Random;;

class Search extends Sort{
	int mid,key;
	Random r;
	Search(){
		int random=r.nextInt();
		System.out.println("Enter element to be searched");
		key=Sort.sc.nextInt();
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
	static int[] array=new int[10];
	static Scanner sc=new Scanner(System.in);
	int partition,pivot;
	
	Sort(){
		
		  System.out.println("Enter array elements");
		  for(int i=0;i<10;i++)  
		 	array[i]=sc.nextInt();
		  
		 quickSort(0,9);
	}

	
	public int sort(int low,int high,int pivot){
		int temp;
		int left=low,right=high;
	  while (true){
	  	while(array[left]<=pivot){left++;}
			
		while(array[right]>pivot && right>=0){right--;}
		
		if(left>=right)
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
		return left;
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
 


	 public static void main(String args[]){
	 
		 int pos;
		Search obj=new Search();
		obj.print();
		pos=obj.search(0, 9);
		System.out.println("Element found at "+pos);
		 
	 }

}

