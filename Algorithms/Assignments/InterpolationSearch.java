
/**
 * Write a description of class InterpolationSearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InterpolationSearch
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class InterpolationSearch
     */
    public InterpolationSearch()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static String search(int[] collection, int item)
    {
        int mid, high, low, initialHigh, initialLow;
        String found = "";
        // initialLow {0,1,2,3,4,5,6,7,8,9,10}
        collection = bubbleSort(collection);
        high =collection.length - 1;
        low = 0;
        mid = low + ((high - low)/(collection[high] - collection[low]))*(item - collection[low] );
        // put your code here
        while(low<=high) {
            if (collection[mid] < item) {
                low = mid+1;
            }
            else if (collection[mid] == item) {
                 found = item + " found in index " + mid + " of sorted array";
                 break;
             } 
            else if(collection[mid] > item) {
                high = mid-1;
            }
        }
        if (high <= low) {
            found = item + " not found";
        
        }
        return found;
    }
    public static int[ ] bubbleSort( int [ ] num )
    {  
     int j;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( flag )
     {
        flag= false;    //set flag to false awaiting a possible swap
        for( j=0;  j < num.length -1;  j++ )
        {
            if ( num[ j ] > num[j+1] )   // change to > for ascending sort
            {
                temp = num[ j ];                //swap elements
                num[ j ] = num[ j+1 ];
                num[ j+1 ] = temp;
                flag = true;              //shows a swap occurred  
            } 
        } 
        }
        return num;
    } 

    public static void main(String[] args){
        int[] collection = {0,1,2,3,4,5,6,7,8,9,10};
       
        int item = 3;

        String result = search(collection, item);
        System.out.println(result);
    }

}
