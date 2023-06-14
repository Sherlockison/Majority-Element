import java.util.*;
class Assignment1 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {2, 4, 5, 5, 5, 5, 5}));    //input & output
    }
    public static int majorityElement(int[] arr) {
        int n = 0;                               //counter initialised
        Arrays.sort(arr);                        //array is first sorted
        for(int i=0; i<arr.length; i++) {        //to hover on all the elements of array
            if(i>0 && arr[i-1]==arr[i]) {        //to check whether the previous element of array is same
                n++;                             //if true then couneter is increased
                if(n>arr.length/2) {             //check if counter has reached n/2 or not
                    return arr[i];               //if true then return the value
                }                                
            }
            else {
                n=0;                              //if false then initialised counter
            }
        }
        return -1;                                //if no value is repeated n/2 times then return -1
    }
}
