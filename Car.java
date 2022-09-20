package activities;

public class Car {
    public String color;
    public String transmission;
    public int make;
    public int tyres;
    public int doors;

    public Car(){
        this.tyres=4;
        this.doors=4;
    }

    public void displayCharacteristics(){
        System.out.println("Car color : "+color+"\nCar Transmission : "+transmission+
                "\nCar Make : "+make+"\nCar tyres : "+tyres+"\nCar doors : "+doors);
    }

    public void accelarate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Car has stopped");
    }
}
