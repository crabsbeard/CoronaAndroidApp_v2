package com.cbs.corona;


public class Menu {

    private String title;
    private int icon;
    private String color;
    private int detail;
    
    public void setDetail(int icon){
    	this.detail = icon;
    }
    
    public int getDetail(){
    	return detail;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
