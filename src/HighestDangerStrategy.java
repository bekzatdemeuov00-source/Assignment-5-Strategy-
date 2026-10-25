import java.util.Comparator;
import java.util.List;

public class HighestDangerStrategy implements RescueStrategy {
    @Override
    public Person selectPerson(List<Person> people) {
        return people.stream()
                .max(Comparator.comparingInt(Person::getDangerLevel))
                .orElseThrow(() -> new IllegalArgumentException("No people to rescue"));
    }
}
