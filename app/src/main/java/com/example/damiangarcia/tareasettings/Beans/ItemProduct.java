package com.example.damiangarcia.tareasettings.Beans;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemProduct implements Parcelable {
    private int image;
    private String title, store, location, phone, description;

    public ItemProduct() {
        image = 0;
        title = "";
    }

    protected ItemProduct(Parcel in) {
        image = in.readInt();
        title = in.readString();
        store = in.readString();
        location = in.readString();
        phone = in.readString();
        description = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(title);
        dest.writeString(store);
        dest.writeString(location);
        dest.writeString(phone);
        dest.writeString(description);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ItemProduct> CREATOR = new Creator<ItemProduct>() {
        @Override
        public ItemProduct createFromParcel(Parcel in) {
            return new ItemProduct(in);
        }

        @Override
        public ItemProduct[] newArray(int size) {
            return new ItemProduct[size];
        }
    };

    @Override
    public String toString() {
        return "item product{image=" + image + ",title=" + title + ",store=" + store + ",location=" + location + ",phone=" + phone
                + ",description=" + description + "}";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getStore() {
        return store;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
