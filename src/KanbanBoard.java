public class KanbanBoard {
    // Declare arrays
    String[] developers = new String[10]; // Adjust size as needed
    String[] taskNames = new String[10];   // Adjust size as needed
    int[] taskIDs = new int[10];            // Adjust size as needed

    // Method to add a developer
    public void addDeveloper(String name, int index) {
        if (index < developers.length) {
            developers[index] = name;
        } else {
            System.out.println("Array index out of bounds for developers");
        }
    }

    // Method to add a task
    public void addTask(String taskName, int taskId, int index) {
        if (index < taskNames.length && index < taskIDs.length) {
            taskNames[index] = taskName;
            taskIDs[index] = taskId;
        } else {
            System.out.println("Array index out of bounds for tasks");
        }
    }

    // Method to display task report
    public void displayTaskReport() {
        System.out.println("Task Report:");
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i] != null) { // Check for null values
                System.out.println("Task ID: " + taskIDs[i] + ", Task Name: " + taskNames[i] + ", Assigned Developer: " + developers[i]);
            }
        }
    }

    // Getters for unit tests (optional)
    public String[] getDevelopers() {
        return developers;
    }

    public String[] getTaskNames() {
        return taskNames;
    }

    public int[] getTaskIDs() {
        return taskIDs;
    }
}
