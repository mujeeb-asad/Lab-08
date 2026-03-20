package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary" , "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));

    }

    @Test
    public void testRemoveCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary" , "AB");
        City lahore = new City("Lahore" , "Punjab");
        list.addCity(calgary);
        list.addCity(lahore);
        list.removeCity(calgary);
        assertFalse(list.hasCity(calgary));
        assertTrue(list.hasCity(lahore));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0 , list.countCities());
        City calgary = new City("Calgary" , "AB");
        list.addCity(calgary);
        assertEquals(1 , list.countCities());
    }

}
