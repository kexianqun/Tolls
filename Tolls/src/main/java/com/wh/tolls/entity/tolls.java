package com.wh.tolls.entity;

public class tolls {
	
	public static final String  ENTITY_DISPLAY_NAME = "收费站";
	
    private Integer tollsId;

    private String tollsname;

    private Integer direction;

    private Integer deleted;

    public Integer getTollsId() {
        return tollsId;
    }

    public void setTollsId(Integer tollsId) {
        this.tollsId = tollsId;
    }

    public String getTollsname() {
        return tollsname;
    }

    public void setTollsname(String tollsname) {
        this.tollsname = tollsname == null ? null : tollsname.trim();
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "tolls{" +
                "tollsId=" + tollsId +
                ", tollsname='" + tollsname + '\'' +
                ", direction=" + direction +
                ", deleted=" + deleted +
                '}';
    }
}