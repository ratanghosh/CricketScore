package com.example.android.apextourguide;

public class attractions {
    /* Beach Name */
    private String mName;

    /* Beach open close hour and day-off*/
    private String mSchedule;

    /* beach address*/
    private String mAddress;

    /* Image resource ID*/
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    // constant value that represent no image provided
    private static final int NO_IMAGE_PROVIDED = -1;


    public attractions(String name, String schedule, String address) {
        mName = name;
        mSchedule = schedule;
        mAddress = address;

    }


    public attractions(String name, String schedule, String address, int imageResourceID) {
        mName = name;
        mSchedule = schedule;
        mAddress = address;
        mImageResourceID = imageResourceID;
    }

    public String getName() {
        return mName;
    }


    public String getSchedule() {
        return mSchedule;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    /*
     *Retun has Image or not
     */

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
