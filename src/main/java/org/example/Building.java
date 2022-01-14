package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Building
{
    private int mId;
    private String mResident;
    private List<String> mResidents;

    public Building(int id, String resident) {
        mId = id;
        mResident = resident;
    }

    public Building(int id, String[] residents) {
        mId = id;
        mResidents = new ArrayList<>();
        for (String resident : residents) {
            if (!mResidents.contains(resident)) {
                mResidents.add(resident);
            }
        }
    }

    public int getId() {
        return mId;
    }

    public String getResident() {
        return mResident;
    }

    public String[] getResidents() {
        String[] output = new String[mResidents.size()];
        for (int i = 0; i < mResidents.size(); i++) {
            output[i] = mResidents.get(i);
        }
        return output;
    }

    public void addResident(String name) {
        if (!mResidents.contains(name)) {
            mResidents.add(name);
        }
    }

    public void removeResident(String name) {
        mResidents.remove(name);
    }
}
