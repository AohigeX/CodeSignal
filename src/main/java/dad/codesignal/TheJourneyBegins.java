package dad.codesignal;

public class TheJourneyBegins {
	
	int add(int param1, int param2) {
	    return param1+param2;
	}

	int centuryFromYear(int year) {
	    int ret = (year/100f % 1 == 0) ?  year/100 : (year/100)+1;
        return ret;
    }
	
	boolean checkPalindrome(String inputString) {
	    String word = "";
	    for (int x = inputString.length()-1; x >= 0; x--){
	        word += inputString.charAt(x);
	    }
	    
	    return (word.equals(inputString)) ? true : false;
	}
}
