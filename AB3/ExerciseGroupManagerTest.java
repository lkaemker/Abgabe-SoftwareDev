import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class ExerciseGroupManagerTest {

    @ParameterizedTest
    @DisplayName("Test valid input cases")
    @CsvSource({
            "30, 10, 3, 0",    // Exact fit: 30 students, 10 per group, 3 groups -> no remainder
            "35, 10, 3, 5",    // Overflow: 35 students, 10 per group, 3 groups -> 5 unassigned
            "20, 10, 3, 0",    // Below capacity: 20 students, 10 per group, 3 groups -> no remainder
            "0, 10, 3, 0"      // Zero students: 0 students, 10 per group, 3 groups -> no students to assign
    })
    public void testValidInputs(int totalStudents, int groupSize, int availableGroups, int expected) {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        assertEquals(expected, manager.checkGroupCapacities(totalStudents, groupSize, availableGroups));
    }

    @ParameterizedTest
    @DisplayName("Test invalid input cases")
    @MethodSource("provideInvalidInputs")
    public void testInvalidInputs(int totalStudents, int groupSize, int availableGroups) {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        assertThrows(IllegalArgumentException.class, () -> {
            manager.checkGroupCapacities(totalStudents, groupSize, availableGroups);
        });
    }

    @Test
    @DisplayName("Test negative total students")
    public void testNegativeStudents() {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        int totalStudents = -30; // Negative students
        int groupSize = 10;
        int availableGroups = 3;

        // Should return 0 according to the method's specification
        assertEquals(0, manager.checkGroupCapacities(totalStudents, groupSize, availableGroups));
    }

    // Stream of invalid inputs for the invalid input test

    private static Stream<Arguments> provideInvalidInputs() {
        return Stream.of(
                Arguments.of(30, 0, 3),   // Invalid group size (0)
                Arguments.of(30, 10, -1), // Invalid number of groups (-1)
                Arguments.of(30, -10, 3)  // Negative group size
        );
    }
}



