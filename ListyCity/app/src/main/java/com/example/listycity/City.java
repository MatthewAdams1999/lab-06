package com.example.listycity;

/**
 * This is a class that defines a City with a name and province <br>
 * Implements Comparable to allow sorting by city name.
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * Constructor for City with the given name and province
     * @param city
     *      The name of the city
     * @param province
     *      The name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city
     * @return
     *      return the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Returns the province name of the city
     * @return
     *      return province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares the city with another city alphabetically by city name
     * @param o
     *      The other city object to compare
     * @return
     *      Returns a negative integer, zero, or a positive integer as this city's name
     *      is less than, equal to, or greater than the compared city's name.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}