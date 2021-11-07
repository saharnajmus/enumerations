package be.intecbrussel;

public class PlanetApp {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.print("Mass of " + planet.name() + " is " + planet.getMass());
            System.out.println(" and distance from sun is " + planet.getDistanceFromSun() + " kilometers ");

        }
    }
}
