//todo : Write a Program to compute the volume of Earth in km^3 and miles^3
//! Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
//! O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____


public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378;
        double volumeOfSphere = (4/3) * Math.PI * Math.pow(radius, 3);
        double cubicKmToMiles = 0.239913;
        double cubicMiles = volumeOfSphere * cubicKmToMiles;
        System.out.println("The volumne of earth in cubic kilometers is " + volumeOfSphere + " and cubic miles is " + cubicMiles);
    }
    
}