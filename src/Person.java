public class Person {
    private final String name;
    private final int distance;
    private final int dangerLevel;
    private final int rescueTime;

    public Person(String name, int distance, int dangerLevel, int rescueTime) {
        this.name = name;
        this.distance = distance;
        this.dangerLevel = dangerLevel;
        this.rescueTime = rescueTime;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public int getRescueTime() {
        return rescueTime;
    }
}
