package sit707_tasks;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;

public class onTrackTest {

    @Test
    public void testViewTasksForValidCodeSubject() {
        List<Task> tasks = onTrack.viewTasksForSubject("Code6.1");
        Assert.assertNotNull("List of tasks should not be null for valid subject", tasks);
        Assert.assertFalse("List of tasks should not be empty for valid subject", tasks.isEmpty());

        Task firstTask = tasks.get(0);
        Assert.assertEquals("Unexpected task ID for the first task of valid Code6.1 subject", "1", firstTask.getTaskId());
        Assert.assertEquals("Unexpected title for the first task of valid Code6.1 subject", "Code coverage", firstTask.getTitle());
        Assert.assertEquals("Unexpected due date for the first task of valid Code6.1 subject", "2024-06-01", firstTask.getDueDate());
        Assert.assertEquals("Unexpected status for the first task of valid Code6.1 subject", "pending", firstTask.getStatus());
        Assert.assertEquals("Unexpected description for the first task of valid Code6.1 subject", "Solve code problems", firstTask.getDescription());

        Task secondTask = tasks.get(1);
        Assert.assertEquals("Unexpected task ID for the second task of valid Code6.1 subject", "2", secondTask.getTaskId());
        Assert.assertEquals("Unexpected title for the second task of valid Code6.1 subject", "Testing Quiz", secondTask.getTitle());
        Assert.assertEquals("Unexpected due date for the second task of valid Code6.1 subject", "2024-06-15", secondTask.getDueDate());
        Assert.assertEquals("Unexpected status for the second task of valid Code6.1 subject", "submitted", secondTask.getStatus());
        Assert.assertEquals("Unexpected description for the second task of valid Code6.1 subject", "Complete the quiz on testing", secondTask.getDescription());
    }

    @Test
    public void testViewTasksForValidMathGameSubject() {
        List<Task> tasks = onTrack.viewTasksForSubject("MathGame-9.1");
        Assert.assertNotNull("List of tasks should not be null for valid subject", tasks);
        Assert.assertFalse("List of tasks should not be empty for valid subject", tasks.isEmpty());

        Task firstTask = tasks.get(0);
        Assert.assertEquals("Unexpected task ID for the first task of valid MathGame-9.1 subject", "1", firstTask.getTaskId());
        Assert.assertEquals("Unexpected title for the first task of valid MathGame-9.1 subject", "STEM math game", firstTask.getTitle());
        Assert.assertEquals("Unexpected due date for the first task of valid MathGame-9.1 subject", "2024-06-10", firstTask.getDueDate());
        Assert.assertEquals("Unexpected status for the first task of valid MathGame-9.1 subject", "graded", firstTask.getStatus());
        Assert.assertEquals("Unexpected description for the first task of valid MathGame-9.1 subject", "Submit report on test cases", firstTask.getDescription());
    }

    @Test
    public void testViewTasksForInvalidSubject() {
        List<Task> tasks = onTrack.viewTasksForSubject("InvalidSubject");
        Assert.assertNotNull("List of tasks should not be null for invalid subject", tasks);
        Assert.assertTrue("List of tasks should be empty for invalid subject", tasks.isEmpty());
    }
}
