package com.vencent.pojo;

public class Album {
    private Integer photoId;

    private Integer userId;

    private String place;

    private String photoDate;

    @Override
    public String toString() {
        return "Album{" +
                "photoId=" + photoId +
                ", userId=" + userId +
                ", place='" + place + '\'' +
                ", photoDate='" + photoDate + '\'' +
                ", photoDetail='" + photoDetail + '\'' +
                ", src='" + src + '\'' +
                '}';
    }

    private String photoDetail;

    private String src;

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getPhotoDate() {
        return photoDate;
    }

    public void setPhotoDate(String photoDate) {
        this.photoDate = photoDate == null ? null : photoDate.trim();
    }

    public String getPhotoDetail() {
        return photoDetail;
    }

    public void setPhotoDetail(String photoDetail) {
        this.photoDetail = photoDetail == null ? null : photoDetail.trim();
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }
}