package dad.codesignal;

public class EdgeOfTheOcean {
	int adjacentElementsProduct(int[] inputArray) {
	    int x = 0;
	    int num1 = inputArray[x];
	    int num2 = inputArray[++x];
	    int prod = num1*num2;
	    
	    while (x < inputArray.length-1){
	        num1 = inputArray[x];
	        num2 = inputArray[++x];
	        prod = ((num1*num2) > prod) ? num1*num2 : prod;
	    }
	    
	    return prod;
	}
	
	int shapeArea(int n) {
	    return ((n-1)*(n-1)) + (n*n);
	}
}
