package com.soccermanager.model;

public class Follow {
    private String stt, name;
    private int imageLogo;

    public Follow() {
    }

    public Follow(String stt, String name, int imageLogo) {
        this.stt = stt;
        this.name = name;
        this.imageLogo = imageLogo;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageLogo() {
        return imageLogo;
    }

    public void setImageLogo(int imageLogo) {
        this.imageLogo = imageLogo;
    }
}
