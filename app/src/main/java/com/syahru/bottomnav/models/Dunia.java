package com.syahru.bottomnav.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Dunia implements Parcelable {


    private String name, tempat, photo, description;



    public Dunia (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    protected Dunia(Parcel in) {
        name = in.readString();
        tempat = in.readString();
        photo = in.readString();
        description = in.readString();
    }

    public static final Creator<Dunia> CREATOR = new Creator<Dunia>() {
        @Override
        public Dunia createFromParcel(Parcel in) {
            return new Dunia(in);
        }

        @Override
        public Dunia[] newArray(int size) {
            return new Dunia[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(tempat);
        dest.writeString(photo);
        dest.writeString(description);
    }
}
