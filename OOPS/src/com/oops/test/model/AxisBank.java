package com.oops.test.model;

public class AxisBank extends Bank {
    //bankName,branch,codeIFSC

    private  String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
   public void getBankUpdates() {
        System.out.println("Axis bank Info or new updates .......");
    }

    @Override
    public void bankROI() {
        System.out.println("ROI is  9.5%");
    }



}
