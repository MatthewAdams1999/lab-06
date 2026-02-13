package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This is class manages a list of City objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     * @throws IllegalArgumentException
     *      Throws the exception if the city is already in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Checks if a city already exists in the list
     * @param city
     *      The City object to check
     * @return
     *      true if the city exists, false otherwise
     */
    public boolean hasCity(City city) {
        for (City c : cities) {
            if (c.getCityName().equals(city.getCityName()) &&
            c.getProvinceName().equals(city.getProvinceName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * This deletes the passed city from the list. Throws NoSuchElementException if
     * the city passed is not in the list
     * @param city
     *      The City object to delete
     * @throws NoSuchElementException
     *      throws the exception if the city is not in the list
     */
    public void delete(City city) {
        if (!cities.remove(city)) {
            throw new NoSuchElementException("City was not found: " + city.getCityName());
        }
    }

    /**
     * Returns the number of cities in the list
     * @return
     *      Returns the number
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}