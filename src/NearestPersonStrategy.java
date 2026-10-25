import java.util.Comparator;
import java.util.List;

public class NearestPersonStrategy implements RescueStrategy {
    @Override
    public Person selectPerson(List<Person> people) {
        return people.stream()
                .min(Comparator.comparingInt(Person::getDistance))
                .orElseThrow(() -> new IllegalArgumentException("No people to rescue"));
    }
}
