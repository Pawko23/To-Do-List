public class Task {
    private String name;
    private boolean completed;
    private String description;
    
    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.completed = false;
    }

    @Override
    public String toString() {
        String temp = "";
        if(completed == false) {
            temp = "in progress";
        } else {
            temp = "Done";
        }
        return name + ": " + description + "    " + temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
