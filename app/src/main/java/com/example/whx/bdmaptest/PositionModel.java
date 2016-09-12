package com.example.whx.bdmaptest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by whx on 2016/9/12.
 */
public class PositionModel implements Parcelable{

    private String name;
    private String address;

    public PositionModel(){

    }
    public PositionModel(String name, String address){
        this.name = name;
        this.address = address;
    }
    public PositionModel(Parcel in){
        name = in.readString();
        address = in.readString();
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(name);
        dest.writeString(address);
    }

    public static final Creator<PositionModel> CREATOR = new Creator<PositionModel>() {
        @Override
        public PositionModel createFromParcel(Parcel source) {
            return new PositionModel(source);
        }

        @Override
        public PositionModel[] newArray(int size) {
            return new PositionModel[size];
        }
    };

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
