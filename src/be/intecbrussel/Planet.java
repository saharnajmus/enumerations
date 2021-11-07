package be.intecbrussel;

public enum Planet {
    MERCURY(3.3 * Math.pow(10, 23), 5.7 * Math.pow(10, 6)),
    VENUS(4.87 * Math.pow(10, 24), 10.8 * Math.pow(10, 6)),
    EARTH(5.98 * Math.pow(10, 24), 14.9 * Math.pow(10, 6)),
    MARS(6.42 * Math.pow(10, 23), 22.7 * Math.pow(10, 6)),
    JUPITER(1.8 * Math.pow(10, 27), 77.8 * Math.pow(10, 6)),
    SATURN(5.6 * Math.pow(10, 26), 14.3 * Math.pow(10, 7)),
    URANUS(8.6 * Math.pow(10, 25), 28.7 * Math.pow(10, 7)),
    NEPTUNE(10.2 * Math.pow(10, 25), 44.9 * Math.pow(10, 7));

    private double mass, distanceFromSun;

    Planet(double mass, double distance) {
        this.mass = mass;
        this.distanceFromSun = distance;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getMass() {
        return mass;
    }
}

