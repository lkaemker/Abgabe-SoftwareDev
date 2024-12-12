public class ExerciseGroupManager {
    public int checkGroupCapacities(int totalStudents, int groupSize, int availableGroups) {
        if (groupSize <= 0 || availableGroups <= 0) {
            throw new IllegalArgumentException("Group size and available groups must be positive.");
        }
        if (totalStudents <= 0) {
            return 0;
        }

        int maxCapacity = groupSize * availableGroups;
        return Math.max(0, totalStudents - maxCapacity);
    }
}

