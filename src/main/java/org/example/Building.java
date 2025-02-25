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
    private List<String> mResidents;

    public Building(int id, String resident) {
        mId = id;
        mResidents = new ArrayList<>();
        mResidents.add(resident);
    }

    public Building(int id, String[] residents) {
        mId = id;
        mResidents = new ArrayList<>();
        for (String resident : residents) {
            this.addResident(resident);
        }
    }

    public int getId() {
        return mId;
    }

    public String[] getResidents() {
        return mResidents.toArray(new String[0]);
    }

    public void addResident(String name) {
        if (!mResidents.contains(name)) {
            mResidents.add(name);
        }
    }

    public void removeResident(String name) {
        mResidents.remove(name);
    }

    public int numberOfResidents() {
        return mResidents.size();
    }
}
