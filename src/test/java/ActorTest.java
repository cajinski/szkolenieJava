import Models.Aktor;
import Models.Person;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ActorTest {
    @Test //adnotacja
    void shouldCalculateCorrectSalary()
    {
        Person tomCruise = new Person("tomCruise", "Tom", 100, 8);
        int actual = tomCruise.calculateSalary(3, 8)
    }
}
