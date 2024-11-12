import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExerciseGroupManagerTest {

    @Test
    public void testExactFit() {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        int totalStudents = 30;
        int groupSize = 10;
        int availableGroups = 3;

        // Should return 0 as all students can be assigned with no remainder.
        assertEquals(0, manager.checkGroupCapacities(totalStudents, groupSize, availableGroups));
    }

    @Test
    public void testExceedCapacity() {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        int totalStudents = 35;
        int groupSize = 10;
        int availableGroups = 3;

        // Should return 5 as there is overflow with 5 students unassigned.
        assertEquals(5, manager.checkGroupCapacities(totalStudents, groupSize, availableGroups));
    }

    @Test
    public void testBelowCapacity() {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        int totalStudents = 20;
        int groupSize = 10;
        int availableGroups = 3;

        // Should return 0 as all students fit within available capacity.
        assertEquals(0, manager.checkGroupCapacities(totalStudents, groupSize, availableGroups));
    }

    @Test
    public void testZeroStudents() {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        int totalStudents = 0;
        int groupSize = 10;
        int availableGroups = 3;

        // Should return 0 as there are no students to assign.
        assertEquals(0, manager.checkGroupCapacities(totalStudents, groupSize, availableGroups));
    }

    @Test
    public void testInvalidInput() {
        ExerciseGroupManager manager = new ExerciseGroupManager();

        // Testing invalid group size
        assertThrows(IllegalArgumentException.class, () -> {
            manager.checkGroupCapacities(30, 0, 3);
        });

        // Testing invalid available groups
        assertThrows(IllegalArgumentException.class, () -> {
            manager.checkGroupCapacities(30, 10, -1);
        });
    }
}

