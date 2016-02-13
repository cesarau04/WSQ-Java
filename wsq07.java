//WSQ06 Cesar Augusto Garcia Perez  A01153737
//WSQ06 Cesar Augusto Cortez 		    A01226862
//WSQ06 Jose Andres Choza Castro	  A01113487

class BabyM{
	double multiNum; double numPow =1.0; double preRoot; double root;
	
	public BabyM(){		
	}
	
	public double BabySqrt(double in){
		while (multiNum < in){
			multiNum = numPow * numPow;
			numPow++;
		}
		root= numPow + (numPow-1)/2; //4.5
		for (double x= 0; x<10;x++){
			preRoot= in/root; //4.6
			root= (preRoot + root)/2; //4.55	
		}
		return root;
	}

	
	public static void main(String [] args){
		BabyM result= new BabyM();
		System.out.println(result.BabySqrt(2.0));
		
	}
}
