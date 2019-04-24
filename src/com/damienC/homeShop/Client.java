package com.damienC.homeShop;

public class Client {
   private String fullname;
   private String adress;

    public Client(String fullname, String adress) {
        this.fullname = fullname;
        this.adress = adress;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAdress() {
        return adress;
    }
}
