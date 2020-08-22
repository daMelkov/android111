package com.astra.melkovhw111;

public class Task {
    private String title;
    private String subTitle;
    private String description;
    private int screenshot;

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getDescription() {
        return description;
    }

    public int getScreenshot() {
        return screenshot;
    }

    public Task(String title, String subTitle, String description, int screenshot) {
        this.title = title;
        this.subTitle = subTitle;
        this.description = description;
        this.screenshot = screenshot;
    }
}