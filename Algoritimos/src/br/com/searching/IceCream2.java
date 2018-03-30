/*
 * Here have the solution O(n)
 */
package br.com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class IceCream2 {

	    public IceCreamType[] menu;
	    public int n;
	    public int m;
	    
	    public IceCream2(IceCreamType[] menu, int n, int m) {
	        this.menu = menu;
	        Arrays.sort(this.menu);
	        this.n = n;
	        this.m = m;
	    }
	    
	    public int binarySearch(int min, int max, int search) {
	        
	        int middle = (min + max) >> 1;
	        
	        while(min <= max) {
	            // Search value is found
	            if( menu[middle].cost == search ) {
	                if(max - min <= 1 ) {
	                    return menu[middle].id;
	                }
	                
	                // else, continue searching
	                max = middle;
	            }
	            // Else, continue looking for search value
	            else {
	                if ( menu[middle].cost < search ) {
	                    // Continue searching right
	                    min = middle + 1;  
	                }
	                else {
	                    // Continue searching left
	                    max = middle - 1;
	                }
	            }
	            
	            // Set new middle at halfway point
	            middle = (min + max) >> 1;
	            
	        } // END WHILE, first > last
	        
	        // No price matching 'search' exists in the menu
	        return -1;
	    }
	    
	    public void solve() {
	        // Search menu for a valid pair of prices
	        for(int i = 0; i < n - 1 ; i++) {
	            // Set desired price that will match the cost at index i
	            int search = m - menu[i].cost;

	            // If search < menu[i], then no match exists for that cost because the menu array is sorted
	            if(search >= menu[i].cost) {    
	                
	                // Search for the desired value starting at the first index to the right of the flavor at index i
	                int index = binarySearch(i + 1, n - 1, search);

	                // Index of valid second flavor was returned by binary search 
	                if( index != -1 ) {
	                    System.out.println( Math.min(menu[i].id, index) + " " + Math.max(menu[i].id, index));
	                    break;
	                }
	                // Else, continue looping and check the next value.
	            }
	        }   
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	 
	        int t = scanner.nextInt();
	        while(t-- > 0) {       
	            int m = scanner.nextInt();
	            int n = scanner.nextInt(); 
	            IceCreamType[] menu = new IceCreamType[n];
	            
	            // Fill flavor menu and sort
	            for (int i = 0; i < n; i++) {
	                menu[i] = new IceCreamType(scanner.nextInt(), i + 1);
	            }
	            
	            IceCream2 solution = new IceCream2(menu, n, m);
	            solution.solve();
	        }   
	        scanner.close();
	    }                       
	}

class IceCreamType implements Comparable{
	public int cost;
	public int id;

	public IceCreamType(int cost, int index) {
		this.cost = cost;
		this.id = index;
	}
	
	@Override
	public int compareTo(Object o) {
		IceCreamType iceCream = (IceCreamType) o;
        
		return this.cost - iceCream.cost;
	}

	@Override
	public boolean equals(Object o){
		IceCreamType iceCream = (IceCreamType) o;
        
		return iceCream.cost == this.cost;
	}

	@Override
	public String toString() {
		return "IceCreamType [cost=" + cost + ", id=" + id + "]";
	}
	
        
}
