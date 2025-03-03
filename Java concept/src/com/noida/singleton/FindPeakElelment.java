package com.noida.singleton;

public class FindPeakElelment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr[]	= {10, 20, 15, 2, 23, 90, 80} ;
	
	
		int j = findPeak (arr) ;
	System.out.println("the value is "+ j);

	}
	public static int findPeak (int a[]) 
	{
	   
	        // code here
	    int len  = a.length ;
			int index = 0 ;
			// edge case 
			if (len == 1 )
				index = 0 ;
		if (len > 1)	 {    // here the case has been failed 
			if (a[0] > a[1])
				index = 0 ;
			if (a[0] < a[1])
				index = 1 ;
			// check for last elemment 
			if (a[len-1] > a[len-2])
				index = len -1 ;
		}
			
			for (int i = 1 ; i < len -1 ; i++ )
			{
				if ((a[i]> a[i-1]) && (a[i]> a[i+1]))
					index = i ;
			}
		
			return index ;
	     
	}

}
