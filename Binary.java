import java.util.Scanner;

class Sort{
	static Binary o;
	static Sort obj;
	int partition,pivot;
	
	public int sort(int low,int high,int pivot){
		int temp;
		int left=low,right=high-1;
	  while (true){
	  	while(o.array[left++]<=pivot){}
			
		while(o.array[right--]>pivot && right>=0){}
		
		if(left>=right)
			break;
		else{
			temp=o.array[left];
			o.array[left]=o.array[right];
			o.array[right]=temp;
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
		 pivot=o.array[right];
		 partition=obj.sort(left,right,pivot);
		 obj.quickSort(left,partition-1);
		 obj.quickSort(partition,right-1);
		 }
	 }
	
}

class Binary{
static	Sort obj;
static int[] array=new int[10];



 public static void main(String args[]){
 
  int l,h;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter array elements");
  for(int i=0;i<10;i++)  
 	array[i]=sc.nextInt();
  sc.close();
 l=0; h=10;
 obj.quickSort(l,h);
 for(int i=0;i<h;i++)
 	System.out.println(array[i]);
 }
 
};