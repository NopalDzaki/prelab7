class Bus {

    //attributes
    private int passengerCount;
    private int capacity;

    //constructor
    public Bus(int passengerCount, int capacity) {
        this.passengerCount = passengerCount;
        this.capacity = capacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countTrips(int passengers, int capacity) {
        //recursive method
        if (passengers <= 0) {
            return 0;
        } else if (passengers <= capacity) {
            return 1;
        } else {
            return 1 + countTrips(passengers - capacity, capacity);
        }
    }
}