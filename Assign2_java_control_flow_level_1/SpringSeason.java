public class SpringSeason{
    public static void main(String[] args){
        if(args.length<2){
            System.out.println("Provide the variable as command-line arguments.");
            return;
        }
        try{
            int month=Integer.parseInt(args[0]);
            int day=Integer.parseInt(args[1]);
            if(month<1||month>12){
                System.out.println("Invalid month");
                return;
            }
            if(day<1||day>31){
                System.out.println("Invalid day");
		return;
            }
	    boolean flag=(month==3 && day>=20 && day<=31)||(month==4 && day>=1 && day<=30)||(month==5 && day>=1 && day<=31)||(month==6 && day>=1 && day<=20);
	    if(flag)System.out.println("It's a Spring Season.");
            else System.out.println("Not a Spring Season.");
        }
 	catch(NumberFormatException e){
	    System.out.println("Invalid input, enter numeric values for month and day.");
        }
    }
}
