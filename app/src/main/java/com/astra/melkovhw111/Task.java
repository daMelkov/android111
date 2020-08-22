package com.astra.melkovhw111;

public class Task {
    private String title;
    private String subTitle;
    private int screenshot;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return subTitle;
    }

    public int getScreenshot() {
        return screenshot;
    }

    public Task(String title, String subTitle, int screenshot) {
        this.title = title;
        this.subTitle = subTitle;
        this.screenshot = screenshot;
    }
}