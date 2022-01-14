package org.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
}
