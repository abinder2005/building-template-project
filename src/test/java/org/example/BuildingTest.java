package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class BuildingTest
{
    @Test
    public void createSimpleBuilding() {
        Building building = new Building(1, "Alex");
        assertNotNull(building);
    }

    @Test
    public void getIdOfBuilding() {
        Building building = new Building(1, "Alex");
        assertEquals(1, building.getId());
    }

    @Test
    public void getResidentOfBuilding() {
        Building building = new Building(1, "Alex");
        assertEquals("Alex", building.getResident());
    }

    @Test
    public void getBothResidentsOfBuilding() {
        String[] residents = new String[]{"Alex", "Peter"};
        Building building = new Building(1, residents);
        assertEquals(residents, building.getResidents());
    }

    @Test
    public void checkIfResidentAlreadyExists() {
        String[] residents = new String[]{"Alex", "Peter", "Alex"};
        Building building = new Building(1, residents);
        assertNotEquals(residents, building.getResidents());
    }

    @Test
    public void checkAddResident() {
        Building building = new Building(1, new String[]{"Alex", "Peter"});
        building.addResident("Franz");
        assertEquals(3, building.getResidents().length);
    }

    @Test
    public void addAlreadyExistingResident() {
        Building building = new Building(1, new String[]{"Alex", "Peter"});
        building.addResident("Alex");
        assertEquals(2, building.getResidents().length);
    }

    @Test
    public void removeResident() {
        Building building = new Building(1, new String[]{"Alex", "Peter"});
        building.removeResident("Alex");
        assertEquals(1, building.getResidents().length);
    }

    @Test
    public void removeNotExistingResident() {
        Building building = new Building(1, new String[]{"Alex", "Peter"});
        building.removeResident("Franz");
        assertEquals(2, building.getResidents().length);
    }

    @Test
    public void getNumberOfResidents() {
        Building building = new Building(1, new String[]{"Alex", "Peter", "Franz"});
        assertEquals(3, building.numberOfResidents());
    }
}
