package com.vencent.pojo;

import java.util.Date;

public class Reply {
    private Integer replyId;

    private Integer replyFrom;

    private Date replyDate;

    private Integer textId;

    private Integer whisperId;

    private String replyDetail;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getReplyFrom() {
        return replyFrom;
    }

    public void setReplyFrom(Integer replyFrom) {
        this.replyFrom = replyFrom;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public Integer getTextId() {
        return textId;
    }

    public void setTextId(Integer textId) {
        this.textId = textId;
    }

    public Integer getWhisperId() {
        return whisperId;
    }

    public void setWhisperId(Integer whisperId) {
        this.whisperId = whisperId;
    }

    public String getReplyDetail() {
        return replyDetail;
    }

    public void setReplyDetail(String replyDetail) {
        this.replyDetail = replyDetail == null ? null : replyDetail.trim();
    }
}