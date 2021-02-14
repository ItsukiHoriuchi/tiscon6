package com.tiscon.domain;

import java.io.Serializable;

public class PackageBox implements Serializable {

    private int packageId;

    private String packageName;

    private int box;

    private int theday;

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public int getTheday() {
        return theday;
    }

    public void setTheday(int theday) {
        this.theday = theday;
    }
}
