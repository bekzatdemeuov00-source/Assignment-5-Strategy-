import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alex", 5, 4, 6),
                new Person("Dana", 15, 9, 8),
                new Person("Sam", 10, 6, 2)
        );

        RescueRobot robot = new RescueRobot(new NearestPersonStrategy());
        System.out.println("Nearest first: " + robot.selectNextPerson(people).getName());

        robot.setStrategy(new HighestDangerStrategy());
        System.out.println("Highest danger first: " + robot.selectNextPerson(people).getName());

        robot.setStrategy(new FastestRescueStrategy());
        System.out.println("Fastest rescue first: " + robot.selectNextPerson(people).getName());
    }
}
