package com.example.nirog.data.model;

public class HospitalDetails {

    private Boolean isApproved;
    private String _id;
    private String name;
    private String phone;
    private String address;
    private String password;
    private String createdAt;
    private String updatedAt;
    private Integer _v;
    private String  description;
    private String image;

    public HospitalDetails(Boolean isApproved, String _id, String name, String phone, String address, String password, String createdAt, String updatedAt, Integer _v, String description, String image) {
        this.isApproved = isApproved;
        this._id = _id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this._v = _v;
        this.description = description;
        this.image = image;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer get_v() {
        return _v;
    }

    public void set_v(Integer _v) {
        this._v = _v;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
