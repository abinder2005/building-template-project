package org.example;

/**
 * Hello world!
 *
 */
public class Building
{
    private int mId;
    private String mResident;

    public Building(int id, String resident) {
        mId = id;
        mResident = resident;
    }

    public int getId() {
        return mId;
    }

    public String getResident() {
        return mResident;
    }
}
