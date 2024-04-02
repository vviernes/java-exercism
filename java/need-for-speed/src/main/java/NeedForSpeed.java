class NeedForSpeed {
    private int distanceDriven = 0;
    private int battery = 100;
    private int speed;
    private int batteryDrain;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }

    public void drive() {
        if (!this.batteryDrained()) {
            this.distanceDriven += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        float numberOfDrives = 100 / car.getBatteryDrain();
        float maxDistanceTravelled = car.getSpeed() * numberOfDrives;  

        return maxDistanceTravelled >= this.distance;
    }
}
