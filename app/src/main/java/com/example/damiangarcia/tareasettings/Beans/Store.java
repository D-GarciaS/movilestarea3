package com.example.damiangarcia.tareasettings.Beans;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Store implements Parcelable {

    private String title;
    private ArrayList<ItemProduct> products;

    protected Store(Parcel in) {
        title = in.readString();
        products = in.createTypedArrayList(ItemProduct.CREATOR);
    }

    public static final Creator<Store> CREATOR = new Creator<Store>() {
        @Override
        public Store createFromParcel(Parcel in) {
            return new Store(in);
        }

        @Override
        public Store[] newArray(int size) {
            return new Store[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeTypedList(products);
    }

}
