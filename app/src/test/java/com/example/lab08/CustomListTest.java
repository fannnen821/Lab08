package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    void testHasCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);

        assertTrue(list.hasCity(city));

        City nonExisting = new City("Toronto", "Ontario");
        assertFalse(list.hasCity(nonExisting));
    }
}
