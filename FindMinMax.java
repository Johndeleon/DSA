public class FindMinMax {
    
    public static void main (String[] args){
        
        int [] numbers = {88,33,55,23,64,123};
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]<min)
                min=numbers[i];
            
            if (numbers[i]>max)
                max=numbers[i];
            
        }
        System.out.println("smallest number is"+min);
        System.out.println("largest number is"+max);
    }
    
}
