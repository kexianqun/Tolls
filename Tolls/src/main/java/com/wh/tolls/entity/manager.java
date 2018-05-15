package com.wh.tolls.entity;

public class manager {
	
	public static final String  ENTITY_DISPLAY_NAME = "管理员";
	
    private Integer managerId;

    private String mngname;

    private String password;

    private String gender;

    private String birthday;

    private String address;

    private String tel;

    private String idnumber;

    private Integer deleted;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getMngname() {
        return mngname;
    }

    public void setMngname(String mngname) {
        this.mngname = mngname == null ? null : mngname.trim();
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

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "manager{" +
                "managerId=" + managerId +
                ", mngname='" + mngname + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}