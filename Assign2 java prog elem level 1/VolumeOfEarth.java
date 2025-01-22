public class VolumeOfEarth{
    public static void main(String[] args){
        double pi=3.14159;
        double radius=6378;
        double volumeInKm=(4.0/3.0)*pi*Math.pow(radius,3);
        double volumeInMiles=volumeInKm/4.168;
        System.out.println("The volume of earth in cubic kilometers is "+volumeInKm+" and cubic miles is "+volumeInMiles);
    }
}

    








