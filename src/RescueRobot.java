import java.util.List;
import java.util.Objects;

public class RescueRobot {
    private RescueStrategy strategy;

    public RescueRobot(RescueStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(RescueStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "Strategy must not be null");
    }

    public Person selectNextPerson(List<Person> people) {
        return strategy.selectPerson(people);
    }
}
