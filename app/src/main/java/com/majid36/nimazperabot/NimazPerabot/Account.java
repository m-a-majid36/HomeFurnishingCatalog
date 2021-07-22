package com.majid36.nimazperabot.NimazPerabot;

import android.os.Parcel;
import android.os.Parcelable;

public class Account implements Parcelable {

    private String nama;
    private String harga;
    private Integer img;
    private String deskripsi;

    public Account(){
    }

    public String getUsername() {
        return nama;
    }

    public void setUsername(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return harga;
    }

    public void setId(String harga) {
        this.harga = harga;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getLocation() {
        return deskripsi;
    }

    public void setLocation(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    protected Account(Parcel in) {
        nama = in.readString();
        harga = in.readString();
        img = in.readInt();
        deskripsi = in.readString();
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(harga);
        dest.writeInt(img);
        dest.writeString(deskripsi);
    }
    @Override
    public int describeContents() {
        return 0;
    }
    public static final Creator<Account> CREATOR = new Creator<Account>() {
        @Override
        public Account createFromParcel(Parcel in) {
            return new Account(in);
        }
        @Override
        public Account[] newArray(int size) {
            return new Account[size];
        }
    };
}
