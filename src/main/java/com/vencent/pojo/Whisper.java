package com.vencent.pojo;

import java.util.Date;

public class Whisper {
    private Integer whisperId;

    private Date whisperDate;

    private Integer userId;

    private Integer click;

    private String whisperText;

    public Integer getWhisperId() {
        return whisperId;
    }

    public void setWhisperId(Integer whisperId) {
        this.whisperId = whisperId;
    }

    public Date getWhisperDate() {
        return whisperDate;
    }

    public void setWhisperDate(Date whisperDate) {
        this.whisperDate = whisperDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public String getWhisperText() {
        return whisperText;
    }

    public void setWhisperText(String whisperText) {
        this.whisperText = whisperText == null ? null : whisperText.trim();
    }
}