package com.gmrit.dscgmrit.modals;

public class FAQdata {

    String Title, Content, Date;
    int userphoto;

    public FAQdata() {
    }

    public FAQdata(String title, String content, String date, int userphoto) {
        Title = title;
        Content = content;
        Date = date;
        this.userphoto = userphoto;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setUserphoto(int userphoto) {
        this.userphoto = userphoto;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }

    public String getDate() {
        return Date;
    }

    public int getUserphoto() {
        return userphoto;
    }
}
