/**
 * Write a description of class MergeSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] collection = {2, 6, 3,8,7, 3, 5, 1};
        String sorted = "";
        int[] result = bubbleSort(collection);
        for(int i=0;i<result.length;i++){
            sorted = sorted + ", "+result[i];
        }
        System.out.println(sorted);
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
    
 }
