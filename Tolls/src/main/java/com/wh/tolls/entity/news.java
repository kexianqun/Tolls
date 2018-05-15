package com.wh.tolls.entity;

public class news {
	public static final String  ENTITY_DISPLAY_NAME = "新闻";
	
    private Integer newsId;

    private String title;

    private String content;

    private String publisher;

    private String author;

    private String addtime;

    private Integer deleted;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "news{" +
                "newsId=" + newsId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author='" + author + '\'' +
                ", addtime='" + addtime + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}