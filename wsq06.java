//WSQ06 Cesar Augusto Garcia Perez  	A01153737
//WSQ06 Cesar Augusto Cortez 		A01226862
//WSQ06 Jose Andres Choza Castro	A01113487
class GCD{
	private int n = 2; 
	private int result = 1;
	
	public GCD(){
	}
	
	public int isDivisible(int x, int y){
		while (n < x){
			if (x%n==0 && y%n==0){
				x = x/n;
				y = y/n;
				result = n*result;
				isDivisible(x,y);
			}else{
				n++;
				isDivisible(x,y);
				}
		}
		return result;
	}
		

	public static void main(String[] args){
		GCD myNumber = new GCD();
		System.out.println("The GCD is: " + myNumber.isDivisible(60, 98));
	}
}
