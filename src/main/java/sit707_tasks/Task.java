package sit707_tasks;

public class Task {
	 private String taskId;
	    private String title;
	    private String dueDate;
	    private String status;
	    private String description;

	    public Task(String taskId, String title, String dueDate, String status, String description) {
	        this.taskId = taskId;
	        this.title = title;
	        this.dueDate = dueDate;
	        this.status = status;
	        this.description = description;
	    }

	    public String getTaskId() {
	        return taskId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getDueDate() {
	        return dueDate;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public String getDescription() {
	        return description;
	    }
	}



