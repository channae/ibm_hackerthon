package com.android.squardb.ibmhackathon.data;

public class User {
    private String userId;
    private String pinNumber;

    public User(String userId, String pinNumber) {
        this.userId = userId;
        this.pinNumber = pinNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }
}
