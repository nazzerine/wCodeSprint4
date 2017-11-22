/**
 * This class provides a solution to the LEGOs problem from HackerRank's Women's CodeSprint 4
 * 
 * Difficulty Level: Easy
 * 
 * @author Nazzerine Waldon
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	
	/**
	 * Find the product of the two LEGO pieces which represents the number of 
	 * two-piece LEGO combos Sarah is able to make
	 * 
	 * @param a, b, c, d, p, q are integer types from user input
	 * 
	 * @return total which is the product of the two LEGO pieces left
	 */
    static int productOfLegoTypes(int a, int b, int c, int d, int p, int q) {
    	int r = 0;
    	int s = 0;
    	// series of if, else-if, and else statements in order to figure out which pieces belong to Sarah
    	if (a == p) {
    		if (b == q) {
    			r = c;
    			s = d;
    		} else if (c == q) {
    			r = b;
    			s = d;
    		} else if (d == q) {
    			r = b;
    			s = c;
    		}
    	} else if (b == p) {
    		if (a == q) {
    			r = c;
    			s = d;
    		} else if (c == q) {
    			r = a;
    			s = d;
    		} else if (d == q) {
    			r = a;
    			s = c;
    		}
    	} else if (c == p) {
    		if (a == q) {
    			r = b;
    			s = d;
    		} else if (b == q) {
    			r = a;
    			s = d;
    		} else if (d == q) {
    			r = a;
    			s = b;
    		}
    	} else {
    		if (a == q) {
    			r = b;
    			s = c;
    		} else if (b == q) {
    			r = a;
    			s = c;
    		} else {
    			r = a;
    			s = b;
    		}
    	}
    	
    	// return the product of the LEGOs Sarah owns
    	int total = r*s;
    	return total;
    }
        
    

    // running class
    public static void main(String[] args) {
    	//read in user input
        Scanner in = new Scanner(System.in);
        //the first integer in user input denotes the number of times productOfLegoTypes will be called
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        	//read in each integer for 1 test case at a time
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int p = in.nextInt();
            int q = in.nextInt();
            //print out r*s
            int answer = productOfLegoTypes(a, b, c, d, p, q);
            System.out.println(answer);
        }
        in.close();
    }
}
