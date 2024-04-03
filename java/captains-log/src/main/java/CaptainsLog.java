import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return this.PLANET_CLASSES[this.random.nextInt(10)];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + String.valueOf(1_000 + this.random.nextInt(9_000));
    }

    double randomStardate() {
        return this.random.nextDouble(1_000) + 41_000;
    }
}
