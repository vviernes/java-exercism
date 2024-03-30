public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        switch (speed) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 221 * speed;
            case 5:
            case 6:
            case 7:
            case 8:
                return 221 * speed * 0.90;
            case 9: 
                return 221 * speed * 0.80;
            case 10:
                return 221 * speed * 0.77;
            default:
                return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) /60;
    }
}
