package com.example.android.miwok;

public class Word {
    private String miwok;
    private String eng;
    private int img;

    public Word(String eng,String miwok,int img){
        this.eng=eng;
        this.miwok=miwok;
        this.img=img;
    }

    public int getImg() {
        return img;
    }

    public String getEng() {
        return eng;
    }


    public String getMiwok() {
        return miwok;
    }


}
