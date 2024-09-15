package ru.netologia.homework;

public class Meeting extends Task {
    protected String start;
    protected String topic;
    protected String project;

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.start = start;
        this.topic = topic;
        this.project = project;
    }

    public String getStart() {
        return start;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        return project.contains(query);
    }
}
