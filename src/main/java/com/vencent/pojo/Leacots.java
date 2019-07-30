package com.vencent.pojo;

import java.util.Date;

public class Leacots {
    private Integer leacotsId;

    private Date leacotsDate;

    private Integer userId;

    private String usernick;

    private Integer leacotsTo;

    private String leacotsDetail;

    public Integer getLeacotsId() {
        return leacotsId;
    }

    public void setLeacotsId(Integer leacotsId) {
        this.leacotsId = leacotsId;
    }

    public Date getLeacotsDate() {
        return leacotsDate;
    }

    public void setLeacotsDate(Date leacotsDate) {
        this.leacotsDate = leacotsDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsernick() {
        return usernick;
    }

    public void setUsernick(String usernick) {
        this.usernick = usernick == null ? null : usernick.trim();
    }

    public Integer getLeacotsTo() {
        return leacotsTo;
    }

    public void setLeacotsTo(Integer leacotsTo) {
        this.leacotsTo = leacotsTo;
    }

    public String getLeacotsDetail() {
        return leacotsDetail;
    }

    @Override
    public String toString() {
        return "Leacots{" +
                "leacotsId=" + leacotsId +
                ", leacotsDate=" + leacotsDate +
                ", userId=" + userId +
                ", usernick='" + usernick + '\'' +
                ", leacotsTo=" + leacotsTo +
                ", leacotsDetail='" + leacotsDetail + '\'' +
                '}';
    }

    public void setLeacotsDetail(String leacotsDetail) {
        this.leacotsDetail = leacotsDetail == null ? null : leacotsDetail.trim();
    }
}