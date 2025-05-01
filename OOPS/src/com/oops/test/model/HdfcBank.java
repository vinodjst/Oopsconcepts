package com.oops.test.model;

public class HdfcBank extends Bank{
    //bankName,branch,codeIFSC


    @Override
   public void getBankUpdates() {
        System.out.println("HDFC banking services info updates...");
    }

    @Override
    public void bankROI() {
        System.out.println("ROI is 10.25");
    }
}
