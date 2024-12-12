public class ExerciseGroup {
    private int groupId;
    private int capacity;
    private String timeSlot;
    private Course course;

    public ExerciseGroup(int groupId, int capacity, String timeSlot, Course course) {
        this.groupId = groupId;
        this.capacity = capacity;
        this.timeSlot = timeSlot;
        this.course = course;
    }
    public int getGroupId() {
        return groupId;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getTimeSlot() {
        return timeSlot;
    }
    public Course getCourse() {
        return course;
    }
}
