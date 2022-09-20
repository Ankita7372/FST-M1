package activities;

public class Activity1 {
    public static void main(String [] args){
        Car Hcity = new Car();
        Hcity.make=2014;
        Hcity.color= "Black";
        Hcity.transmission="Manual";

        Hcity.displayCharacteristics();
        Hcity.accelarate();
        Hcity.brake();

    }
}
