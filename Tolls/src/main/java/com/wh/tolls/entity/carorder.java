package com.wh.tolls.entity;

public class carorder {
	
	public static final String  ENTITY_DISPLAY_NAME = "预约订单";
	
    private Integer orderId;

    private Integer userId;

    private String username;

    private String lpnumber;

    private String tel;

    private String enTolls;

    private String exTolls;

    private String ordertime;

    private String passtime;

    private String description;

    private String addpicture;

    private String checkState;

    private String orderState;

    private Integer deleted;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getLpnumber() {
        return lpnumber;
    }

    public void setLpnumber(String lpnumber) {
        this.lpnumber = lpnumber == null ? null : lpnumber.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEnTolls() {
        return enTolls;
    }

    public void setEnTolls(String enTolls) {
        this.enTolls = enTolls == null ? null : enTolls.trim();
    }

    public String getExTolls() {
        return exTolls;
    }

    public void setExTolls(String exTolls) {
        this.exTolls = exTolls == null ? null : exTolls.trim();
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    public String getPasstime() {
        return passtime;
    }

    public void setPasstime(String passtime) {
        this.passtime = passtime == null ? null : passtime.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAddpicture() {
        return addpicture;
    }

    public void setAddpicture(String addpicture) {
        this.addpicture = addpicture == null ? null : addpicture.trim();
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "carorder{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", lpnumber='" + lpnumber + '\'' +
                ", tel='" + tel + '\'' +
                ", enTolls='" + enTolls + '\'' +
                ", exTolls='" + exTolls + '\'' +
                ", ordertime='" + ordertime + '\'' +
                ", passtime='" + passtime + '\'' +
                ", description='" + description + '\'' +
                ", addpicture='" + addpicture + '\'' +
                ", checkState='" + checkState + '\'' +
                ", orderState='" + orderState + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}