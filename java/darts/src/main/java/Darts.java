class Darts {
    int score(double xOfDart, double yOfDart) {
        double distance = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
        int score = 0;
        if (distance <= 1) {
            score = 10;
        } else if (distance <= 5) {
            score = 5;
        } else if (distance <= 10) {
            score = 1;
        } 
        return score;
    }
}
