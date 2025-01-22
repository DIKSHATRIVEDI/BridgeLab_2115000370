public class PensDistributed{
    public static void main(String[] args){
	    int pens=14;
		int students=3;
		int penTotal=pens/students;
        int leftPens=pens%students;
        System.out.println("The Pen Per Student is "+penTotal+" and the remaining pen not distributed is "+leftPens);
    }
}
