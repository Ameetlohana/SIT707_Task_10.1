package sit707_tasks;

import java.util.ArrayList;
import java.util.List;

public class onTrack {
	public static List<Task> viewTasksForSubject(String subjectId) {
        List<Task> tasks = new ArrayList<>();

        // Mock data for demonstration purposes
        if ("Code6.1".equals(subjectId)) {
            tasks.add(new Task("1", "Code coverage", "2024-06-01", "pending", "Solve code problems"));
            tasks.add(new Task("2", "Testing Quiz", "2024-06-15", "submitted", "Complete the quiz on testing"));
        } else if ("MathGame-9.1".equals(subjectId)) {
            tasks.add(new Task("1", "STEM math game", "2024-06-10", "graded", "Submit report on test cases"));
        }

        return tasks;
    }
}

