import java.util.Random;
public class OTP{
    public static void main(String[] args){
	    int[] otps=new int[10];
		for(int i=0;i<10;i++)otps[i]=generateOTP();
		if(uniqueOTP(otps))System.out.println("All OTPs are unique.");
		else System.out.println("Some OTPs are duplicates.");
    }
	public static int generateOTP(){
        Random rand=new Random();
		return rand.nextInt(900000)+100000;
	}
	public static boolean uniqueOTP(int[] otps){
	    for(int i=0;i<otps.length-1;i++){
		    for(int j=i+1;j<otps.length;j++){
			    if(otps[i]==otps[j])return false;
			}
		}
	    return true;
    }
}