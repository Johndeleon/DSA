import java.util.*;
public class BinarySearch {


	public static void main(String []args){
		
		int maxEl ;
		int [] arr= new int[10];
		int searchnum, index;
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter number of elements");
		maxEl=input.nextInt();
		
		System.out.println("enter elements");
		
		for(int i=0;i<maxEl;i++){
			arr[i]=input.nextInt();
			
		}
		
		System.out.println("enter number to be searched");
		searchnum=input.nextInt();
		
		index=bSearch(arr,searchnum);
		
		
		if (index != -1){
			System.out.println("found at index "+index);
		}
		else{
			System.out.println("not found");
		}
		
	}
	
	public static int bSearch( int[]search,int find){
	
		int start,end,mid;
		start=0;
		end=search.length-1;
		
		while(start<=end){
			
			mid=(start+end)/2;
			
			if(search[mid]==find){
			return mid;	
		}
		
		else if (search[mid]<find){
			start=mid+1;
		}
		else{
			end=mid-1;
			
			
		}	

	}
		return -1;
	}
}
	
	
	
	
	
	
	
	
	
