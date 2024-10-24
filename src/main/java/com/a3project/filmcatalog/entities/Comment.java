package com.a3project.filmcatalog.entities;

public class Comment {

    private Long id;
    private String text;

    private User user;
    private Media media;

    public Comment() {}

    public Comment(String text, User user, Media media) {
        this.text = text;
        this.user = user;
        this.media = media;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }
}