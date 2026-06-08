class Motorcycle {

    //attributes
    private int fuelCapacity;
    private int mileage;

    //constructor
    public Motorcycle(int fuelCapacity, int mileage) {
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getMileage() {
        return mileage;
    }

    public double maxDistance() {
        return fuelCapacity * mileage;
    }

    public double fuelNeeded(int distance) {
        return (double) distance / mileage;
    }
}