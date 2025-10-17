package com.example.listycity;

/**
 *  This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Constructs a new City object.
     * @param city The name of the city.
     * @param province The name of the province the city belongs to.
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city's name.
     * @return The name of the city.
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Gets the province's name.
     * @return The name of the province.
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares two City objects alphabetically by city name.
     * @param o The other City object to compare with.
     * @return A negative integer, zero, or a positive integer as this city's name
     *         is less than, equal to, or greater than the specified city's name.
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    /**
     * Determines whether two City objects are equal based on city and province names.
     * @param o The object to compare.
     * @return true if both have the same city and province names, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City cityObj = (City) o;
        return this.city.equals(cityObj.city) && this.province.equals(cityObj.province);
    }

    /**
     * Generates a hash code for the city based on city and province names.
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return (city + province).hashCode();
    }
}