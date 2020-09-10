package javapro;

public class missingnumber {
	
	// Function to ind missing number 
    static int getMissingNo(int a[], int n) 
    { 
        int i, total; 
        total = (n + 1) * (n + 2) / 2; 
        for (i = 0; i < n; i++) 
            total -= a[i]; 
        return total; 
    } 
  
    /* program to test above function */
    public static void main(String args[]) 
    { 
        int a[] = { 1, 2, 4, 5, 6 }; 
        int miss = getMissingNo(a, 5); 
        System.out.println(miss); 
    } 

}


/*Approach: The length of the array is n-1. So the sum of all n elements, i.e sum of numbers from 1 to n can be calculated using the formula n*(n+1)/2. Now find the sum of all the elements in the array and subtract it from the sum of first n natural numbers, it will be the value of the missing element.
Algorithm:
Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2
create a variable sum to store the sum of array elements.
Traverse the array from start to end.
Update the value of sum as sum = sum + array[i]
print the missing number as sumtotal – sum */