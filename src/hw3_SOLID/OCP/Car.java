package hw3_SOLID.OCP;

public class Car extends Vehicle{
    public Car(int maxSpeed) {

        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed(){
        return super.getMaxSpeed() * 0.8;
    }
}
