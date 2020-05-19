import java.util.Arrays;

public class StalinSort {
    public static void main(String[] args){
        int[] arrayWithRands=new int[10];
        fillArrayWithRandomInts(arrayWithRands);
        System.out.println("Before Stalin Sort:");
        System.out.println(Arrays.toString(arrayWithRands));
        printPatterns(arrayWithRands);
        System.out.println("After Stalin Sort:");
        //create new array that is length [getLengthOfNewArray]
        int lengthOfSorted=getLengthOfNewArray(arrayWithRands);
        int[] sortedArray=new int[lengthOfSorted];
        fillArrayWithSortedInts(arrayWithRands, sortedArray);
        System.out.println(Arrays.toString(sortedArray));
        printPatterns(sortedArray);

    }
    public static void printPatterns(int[] arrayWithRands){
        int currentValue=0;
        while(currentValue<arrayWithRands.length){
            for(int j=0;j<arrayWithRands[currentValue];j++){
                System.out.print("* ");
            }
            System.out.println();
            currentValue++;
        }
    }
    
    public static int[] fillArrayWithRandomInts(int[] arrayWithRands){
        for(int i=0; i<arrayWithRands.length;i++){
            int randomValue=(int) (Math.random()*9)+1;
            arrayWithRands[i]=randomValue;
        }
        return arrayWithRands;
    }

    
    //method gets the amount of times that the next height is greater than the previous height
    public static int getLengthOfNewArray(int[] arrayWithRands){
        int lengthValues=1;
        //create a for loop to go through all the values in the array and add one to var if true
        int previousHeight=arrayWithRands[0];
        for(int i=1; i<arrayWithRands.length;i++){
            if(arrayWithRands[i]>=previousHeight){
                lengthValues++;
                previousHeight=arrayWithRands[i];
            }
            else{
                continue;
            }
        }
        return lengthValues;
    }

    //method that sorts the values into the sorted array
    public static void fillArrayWithSortedInts(int[] arrayWithRands, int[] sortedArray){
        int previousHeight=arrayWithRands[0];
        sortedArray[0]=arrayWithRands[0];
        int indexOfSortedArray=1;
        for(int i=1; i<arrayWithRands.length;i++){
            if(arrayWithRands[i]>=previousHeight){
                //arrayWithRands[i]=sortedArray[indexOfSortedArray];
                sortedArray[indexOfSortedArray]=arrayWithRands[i];
                previousHeight=arrayWithRands[i];
                indexOfSortedArray++;
                if(indexOfSortedArray==sortedArray.length){
                    break;
                }
            }
            else{
                continue;
            }
        }
        indexOfSortedArray++;
        
    }
    

    
}