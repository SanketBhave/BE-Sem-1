import io.*;
import java.util.Scanner;

class Binary{
};

class BinarySearch{
 int array[10];
public:
	 int sort(int &low,int &high,int &pivot){
	int temp;
	int left=low,right=high-1;
  while (true){
  	while(array[left++]<=pivot){}
		
	while(array[right--]>pivot && right>=0){}
	
	if(left>=right)
		break;
	else{
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		}
	
}
	temp=left;
	left=right;
	right=temp;
	return left;
}
};
 public static void main(){
 
  int l,h,partition,pivot;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter array elements");
  for(int i=0;i<10;i++)  
 	array[i]=sc.nextInt();
 l=0; h=10;
 pivot=array[9];
 BinarySearch obj;
 partition=obj.sort(l,h,pivot);
 sort(l,partiton-1);
 sort(partition,h-1);
 for(int i=0;i<h;i++)
 	System.out.println(array[i]);
 }

