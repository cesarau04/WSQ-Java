package wsq08;

public class MyRange {
    private int lowerV;
    private int upperV;
    private int finalCountNP = 0, finalCountPAL = 0, finalCountLyc =0;

    void setMyRange(int lowerV, int upperV){ //SET VALUES
        this.lowerV = lowerV;
        this.upperV = upperV;
    }
        
    public int getLowerV(){ //OBTAIN LOWER VALUE
        return lowerV;
    }
    
    public int getUpperV(){ //OBTAIN UPPER VALUE
        return upperV;
    }
    
    public void myRangeIs(){  //RETURNS YOUR RANGE
        System.out.println("Your range is between "+this.lowerV+" and "+this.upperV);
    }
    
    public void doProgram(int lowerV, int upperV){  //CALL THE OTHER METHODS AND DO THE PROGRAM
    	int countNP = 0, reverse = 0; 
    	long actNumber = this.lowerV;
    	myRangeIs();
    	while(actNumber != (upperV+1)){
    		countNP = isNaturalPalindrome(actNumber, reverse);
    		
    		if (countNP == 0){
    			isPalindrome(actNumber);
    		}else{
    			
    		}
    		actNumber++;
    	}
    	System.out.println("Palindromos Naturales: " + finalCountNP);
    	System.out.println("Palindromos Eventuales: " + finalCountPAL);
    	System.out.println("Numeros Candidato Lychrels: " + finalCountLyc);
    }
    
    public long reversedNumber(long actNumber){     //THIS METHOD RETURN THE REVERSE NUMBER
    	long n = actNumber;
		long reverse = 0;
    	while (n > 0){
    		reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
    	}
    	return reverse;
    }
    
    public boolean areEqual(long originalNumber, long reverse){
    	if (originalNumber == reverse){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    public int isNaturalPalindrome(long actNumber, long reverse){  //THIS METHOD RETURNS HOW MANY NATURAL PALINDROMES ARE
    	long originalNumber = actNumber;
    	reverse = reversedNumber(actNumber);
    	if (areEqual(originalNumber, reverse) == true){
    		finalCountNP++;
    		return 1;
    	}else{
    		return 0;
    	}
    }
    
    public int isPalindrome(long actNumber){     //THIS METHOD CHECK 30 TIMES IF IT IS OR NOT A LYCHREL/PALINDROME
    	long invertNumber;
		long suma=0, numberToTest;
		long reversedSuma;
    	numberToTest=actNumber;
    	for (int i=0; i<30; i++){
    		invertNumber = reversedNumber(numberToTest); //91
    		suma = numberToTest + invertNumber; //19 + 91= 110
    		reversedSuma = reversedNumber(suma); // 011
    		if (areEqual(suma, reversedSuma) == true){ // 110 != 11
    			return finalCountPAL++;
    		}
    		numberToTest = suma;
    	}
    	System.out.println("Lychrel Number FOUND!" + actNumber);
    	return finalCountLyc++;
    }
}
