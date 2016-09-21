import java.util.Scanner;
import java.util.Random;
public class BubbleSort {
    
    
    public static void main(String [] args){
        int elements;
        Scanner in= new Scanner(System.in);
        int [] array;
        Random r= new Random();
        int swap;
        
        
        
        System.out.println("enter number of elements");
        elements=in.nextInt();
        
        array= new int[elements];
        
        for (int i=0;i<elements;i++){
            array[i]=r.nextInt(50);
        }
        System.out.println("before");
        for (int i=0;i<elements;i++){
            System.out.print(array[i]+", ");
        }
        
        
        
//--------------------------------------------------------------        
           for (int i=0;i<elements-1;i++){
    for (int j=0;j<elements-i-1;j++){
        
        
        if (array[j]>array[j+1]){
            swap=array[j];
            array[j]=array[j+1];
            array[j+1]=swap;
            
        }
        
        
    }
}
 //-------------------------------------------------------       
        System.out.println("\n\nafter");
           for (int i=0;i<elements;i++){
            System.out.print(array[i]+", ");
        } 
    }
    
    
    
    
 
}
