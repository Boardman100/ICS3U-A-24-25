package pract;

public class Car {

    //Attribute Definitions
    private String make;
    private String model;
    private int year;
    private double mileage;

    //Constructor
    public Car(String make, String model, int year, double mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    //Getters
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public double getMileage(){
        return mileage;
    }

    //Setters
    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMileage(double mileage){
        this.mileage = mileage;
    }

    //Additional Methods
    public void displayCarDetails(){
        System.out.println("Make: " + make + "Model: " + model +  "Year: " + year + "Mileage: " + mileage);
    }

    public void drive(double milesDriven){
        this.mileage += milesDriven;
        System.out.println(this.mileage);
    }
}
