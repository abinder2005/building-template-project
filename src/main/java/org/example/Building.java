package org.example;

/**
 * Hello world!
 *
 */
public class Building
{
    private int mId;
    private String mResident;
    private String[] mResidents;

    public Building(int id, String resident) {
        mId = id;
        mResident = resident;
    }

    public Building(int id, String[] residents) {
        mId = id;
        mResidents = residents;
    }

    public int getId() {
        return mId;
    }

    public String getResident() {
        return mResident;
    }

    public String[] getResidents() {
        return mResidents;
    }
}
