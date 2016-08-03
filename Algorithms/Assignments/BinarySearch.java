
/**
 * Write a description of class BinarySearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinarySearch
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class BinarySearch
     */
    public BinarySearch()
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
        String found = "hh";
        // initialLow {0,1,2,3,4,5,6,7,8,9,10}
        high =collection.length - 1;
        low = 0;
        mid = low + (high - low)/2;
        // put your code here4
        while(low<=high) {
            if (collection[mid] < item) {
                low = mid+1;
                mid = low + (high - low)/2;
            }
            else if (collection[mid] == item) {
                 found = item + " found in index " + mid + " of array";
                 break;
             } 
            else if(collection[mid] > item) {
                high = mid-1;
                mid = low + (high - low)/2;
            }
        }
        if (high < low) {
            return found = item + " not found";
        
        }
        return found;
    }

    public static void main(String[] args){
        int[] collection = {0,1,2,3,4,5,6,7,8,9,10};
        int item = 2;

        String result = search(collection, item);
        System.out.println(result);
    }

}
