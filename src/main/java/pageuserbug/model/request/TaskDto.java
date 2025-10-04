package pageuserbug.model.request;

public class TaskDto {
    public String title;
    public String description;

    public TaskDto() {}

    public TaskDto(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
