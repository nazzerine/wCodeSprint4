/**
 * This class provides a solution to the Extra Sweet problem from HackerRank's Women's CodeSprint 4
 * 
 * Difficulty Level: Medium
 * 
 * @author Nazzerine Waldon
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // length of chocolate bar
        int s = in.nextInt(); // number of students
        String[] array = new String[n];
        for(int a0 = 0; a0 < s; a0++){
            int l = in.nextInt(); 
            int r = in.nextInt();
            int sweetVal = 0;
            
            if (l == r) {
            	sweetVal += l; // increment sweet value
            	array[l] = "used"; //"removing" it from the array by using "used" String
            } else {
            	sweetVal = l + r; //increment sweet value
            	array[l] = "used";
                array[r] = "used";
            }
            
            //for loop for each index in between l and r
            //add them to sweet value
            for (int i = l+1; i < r; i++) {
            	sweetVal += i;
            	array[i] = "used";
            }
            
            //if the extra left value has not been "removed" from the array
            //add the index to the sweet value
            if (array[l-1] != "used") {
            	sweetVal += (l-1);
            	array[l-1] = "used"; //"remove" the extra left index
            } else {
            	for (int i = l - 2; i > 0; i--) { //for loop to find extra left index to add
            		 if (array[i] != "used") {
            			 sweetVal += i;
            			 array[i] = "used"; //"remove" the extra left index
            			 break; //if we reach the break statement, the extra left has been found
            		 }
            	}
            }
            
            if (r+1 < n) { //if the r index is not the end of the array
	            if (array[r+1] != "used") {
	            	sweetVal += (r+1); //increment the sweet value by the extra right index
	            	array[r+1] = "used"; //"remove" the extra right index
	            }
            }
            
            //print out the sweet value for each student
            System.out.println(sweetVal);
        }
        in.close();
    }
}