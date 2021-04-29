package com.example.dbtest;

//회원 정보 저장

public class MemberInfo {

    private String name;
    private String phoneNumber;
    private String Date;
    private String adress;
    private String photoUrl;

    public MemberInfo(String name, String phoneNumber, String adress, String Date,String photoUrl)
    {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.Date=Date;
        this.adress=adress;
        this.photoUrl = photoUrl;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getDate(){
        return this.Date;
    }
    public void setDate(String Date){
        this.Date=Date;
    }

    public String getAdress(){
        return this.adress;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }

    public String getPhotoUrl(){
        return this.photoUrl;
    }
    public void setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl;
    }




}
