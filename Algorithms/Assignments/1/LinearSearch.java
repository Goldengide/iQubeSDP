
/**
 * Write a description of class LinearSearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinearSearch
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class LinearSearch
     */
    public LinearSearch()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static String search(String[] collection, String item) {
        //the search algorithm goes here
        int countArray = collection.length;
        int i = 0;
        String found = "";
        if(countArray == 0){
            return "array is empty!";
        }
        else if(countArray == 1) {
             if(item.equals(collection[0])){
                 return "found "+ item + " in array";
                 
             }
             else{
                return item + " can not be found!";
             }
        }
        else{
            while(i<=(countArray-1)){
                
                if(item.equals(collection[i])){
                   if(found.equals("")){
                    found = i + "";
                    }
                    else{
                    found = found + " and " + i;
                    }
                }
                i++;
            }
            if(found.equals("")){
                return item + " can not be found!";
            }
            else{
             return "found "+ item + " in " +"index " + found + " of array";
            }

        
        }

    }
    public static void main(String[] args) {
        String[] collection = {"a", "b", "c", "d", "e","f", "a"};
        String result = search( collection, "i");
        System.out.println(result);
    }
}


