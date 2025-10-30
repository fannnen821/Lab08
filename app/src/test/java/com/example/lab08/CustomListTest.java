package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    void testHasCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);

        assertTrue(list.hasCity(city));

        City cgy = new City("Calgary", "Alberta");
        assertFalse(list.hasCity(cgy));
    }

    @Test
    void testDeleteCity() {
        CustomList list = new CustomList();

        City cgy = new City("Calgary", "Alberta");
        City van = new City("Vancouver", "British Columbia");

        list.addCity(cgy);
        list.addCity(van);
        assertTrue(list.hasCity(cgy));
        assertTrue(list.hasCity(van));
        list.deleteCity(cgy);
        assertFalse(list.hasCity(cgy));
        assertTrue(list.hasCity(van));
    }

    @Test
    void testCountCities() {
        CustomList list = new CustomList();
        City yeg = new City("Edmonton", "Alberta");
        City cgy = new City("Calgary", "Alberta");
        list.addCity(yeg);
        list.addCity(cgy);
        assertEquals(2, list.countCities());
    }
}
