import java.util.Comparator;
import java.util.List;

public class FastestRescueStrategy implements RescueStrategy {
    @Override
    public Person selectPerson(List<Person> people) {
        return people.stream()
                .min(Comparator.comparingInt(Person::getRescueTime))
                .orElseThrow(() -> new IllegalArgumentException("No people to rescue"));
    }
}
