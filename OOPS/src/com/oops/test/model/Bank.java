package com.oops.test.model;

public class Bank {//AxisBank,HDFCBank,ICICBank

    private String bankName;

    private String branch;

    private String codeIFSC;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCodeIFSC() {
        return codeIFSC;
    }

    public void setCodeIFSC(String codeIFSC) {
        this.codeIFSC = codeIFSC;
    }

    void getBankUpdates(){

    }

    void bankROI(){

    }




    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", branch='" + branch + '\'' +
                ", codeIFSC='" + codeIFSC + '\'' +
                '}';
    }
}
