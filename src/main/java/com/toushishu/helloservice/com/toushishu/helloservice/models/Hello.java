package com.toushishu.helloservice.com.toushishu.helloservice.models;

import java.util.Date;

/**
 * Hello Model
 */
public class Hello {
    /** name */
    private String name;

    /** genre */
    private String genre;

    /** number of time it says hello */
    private int numberOfTimes;

    /** moment it says hello */
    private Date date;

    /**
     * Instantiates a new Hello.
     *
     * @param name          the name
     * @param genre         the genre
     * @param numberOfTimes the number of times
     * @param date          the date
     */
    public Hello(String name, String genre, int numberOfTimes, Date date) {
        this.name = name;
        this.genre = genre;
        this.numberOfTimes = numberOfTimes;
        this.date = date;
    }

    /**
     * Instantiates a new Hello.
     */
    public Hello() {
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets genre.
     *
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets genre.
     *
     * @param genre the genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets number of times.
     *
     * @return the number of times
     */
    public int getNumberOfTimes() {
        return numberOfTimes;
    }

    /**
     * Sets number of times.
     *
     * @param numberOfTimes the number of times
     */
    public void setNumberOfTimes(int numberOfTimes) {
        this.numberOfTimes = numberOfTimes;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
