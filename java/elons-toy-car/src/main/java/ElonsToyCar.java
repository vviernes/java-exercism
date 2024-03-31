public class ElonsToyCar {
    public int distanceDriven = 0;
    public int batteryPercent = 100;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    public String batteryDisplay() {
        return batteryPercent == 0 ? "Battery empty":"Battery at " + this.batteryPercent + "%";
    }

    public void drive() {
        if (batteryPercent > 0) {
            this.distanceDriven += 20;
            this.batteryPercent -= 1; 
        }
    }
}
