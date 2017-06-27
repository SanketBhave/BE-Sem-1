import java.util.Scanner;
import java.io.*;
import java.util.Random;;

class Search extends Sort{
	int mid,key;
	//Scanner sc=new Scanner(System.in);
	
	Search(){
		
	//	System.out.println("Enter element to be searched");
		key=523;
		//sc.close();
	}
	public int search(int low,int high){
		/*mid=(low+high)/2;
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
		return -1;*/
		
		while(low<high){
			mid=(low+high)/2;
			if(key==array[mid])
				return mid;
			else if(key<array[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
	
}
 class Sort{
	static int[] array;
	int partition,pivot;
	
	Sort(){
		try{
			File file = new File("input.txt");
			byte[] bytes = new byte[(int) file.length()];
			FileInputStream fis = new FileInputStream(file);
			fis.read(bytes);
			fis.close();
			String[] valueStr = new String(bytes).trim().split("\\s+");
			 array = new int[valueStr.length];
			for (int i = 0; i < valueStr.length; i++) 
			    array[i] = Integer.parseInt(valueStr[i]);
			quickSort(0,(valueStr.length-1));
		}catch(Exception e){}
		  /*System.out.println("Enter array elements");*/
		  /*for(int i=0;i<10;i++){
			 array[i]=r.nextInt(100);
			 }*/
		  
		 
	}

	
    private void quickSort(int lowerIndex, int higherIndex) {
        
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[higherIndex];
        // Divide into two arrays
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
            	int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    
	public void print()
	{
		for(int i=0;i<1000;i++)
			System.out.println(array[i]);
	}
	
}
public class Binary {
 


	 public static void main(String args[]) throws IOException{
	 
		 int pos;
		 Random r=new Random();
		// Scanner sc1=new Scanner(System.in);
		/* System.out.println("Enter how many elements you want to search in:");
		 int num=sc1.nextInt();
		 sc1.close();*/
		 
		 try{
			 
			 PrintWriter out = new PrintWriter(new File("input.txt"));
			 for(int i=0;i<1000;i++){
			 out.print(r.nextInt(100)+"\n");
			 }
			 out.close();
			 
		 }catch(Exception e){
			 System.out.println(e);
		 }
		Search obj=new Search();
		obj.print();
		long starttime=System.nanoTime();
		pos=obj.search(0, 999);
		long endtime=System.nanoTime();
		System.out.println("Element found at "+pos);
		System.out.println("Execution time "+(endtime-starttime)/1000+"ms");
	 }

}