package wsq08;

public class WSQ08 {

	public static void main(String[] args) {
        MyRange myNewRange = new MyRange();
        myNewRange.setMyRange(1, 200);
        int lowerV = myNewRange.getLowerV();
        int upperV = myNewRange.getUpperV();
        myNewRange.doProgram(lowerV, upperV);
	}

}
