package com.CAQAS.pojo;

import java.util.Date;

public class Answer {
    private Integer answId;

    private String answTitle;

    private String keyWords;

    private Date answTime;

    private String answContent;

    public Integer getAnswId() {
        return answId;
    }

    public void setAnswId(Integer answId) {
        this.answId = answId;
    }

    public String getAnswTitle() {
        return answTitle;
    }

    public void setAnswTitle(String answTitle) {
        this.answTitle = answTitle == null ? null : answTitle.trim();
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords == null ? null : keyWords.trim();
    }

    public Date getAnswTime() {
        return answTime;
    }

    public void setAnswTime(Date answTime) {
        this.answTime = answTime;
    }

    public String getAnswContent() {
        return answContent;
    }

    public void setAnswContent(String answContent) {
        this.answContent = answContent == null ? null : answContent.trim();
    }
}