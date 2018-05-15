package com.wh.tolls.entity;

public class user {
	
	public static final String  ENTITY_DISPLAY_NAME = "用户";
	
    private Integer userId;

    private String username;

    private String password;

    private String gender;

    private String birthday;

    private String address;

    private String tel;

    private String idnumber;

    private String dlnumber;

    private int credit;

    private Integer deleted;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getDlnumber() {
        return dlnumber;
    }

    public void setDlnumber(String dlnumber) {
        this.dlnumber = dlnumber == null ? null : dlnumber.trim();
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "user{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", dlnumber='" + dlnumber + '\'' +
                ", credit='" + credit + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}