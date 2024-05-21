package sit707_tasks;

import java.util.ArrayList;
import java.util.List;


public class Main {

	  public static void main(String[] args) {
	        // Example usage
	        List<Task> codeTasks = onTrack.viewTasksForSubject("Code6.1");
	        displayTasks(codeTasks);

	        List<Task> mathgameTasks = onTrack.viewTasksForSubject("MathGame-9.1");
	        displayTasks(mathgameTasks);
	    }

	    private static void displayTasks(List<Task> tasks) {
	        for (Task task : tasks) {
	            System.out.println("Task ID: " + task.getTaskId());
	            System.out.println("Title: " + task.getTitle());
	            System.out.println("Due Date: " + task.getDueDate());
	            System.out.println("Status: " + task.getStatus());
	            System.out.println("Description: " + task.getDescription());
	            System.out.println();
	        }
	    }
	}
