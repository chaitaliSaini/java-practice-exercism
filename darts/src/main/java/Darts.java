import java.lang.Math;

class Darts {
    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double distance_from_centre = Math.sqrt((this.x * this.x) + (this.y * this.y));
        if (distance_from_centre <= 1) {
            return 10;
        } else if (distance_from_centre <= 5) {
            return 5;
        } else if (distance_from_centre <= 10) {
            return 1;
        }
        return 0;
    }

}
