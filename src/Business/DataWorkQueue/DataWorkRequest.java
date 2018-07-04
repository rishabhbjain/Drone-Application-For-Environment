/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DataWorkQueue;

import java.util.Date;

/**
 *
 * @author rishabhjain
 */
public class DataWorkRequest {
    private int id;
    private static int count = 1;
    private String Country;
    private String State;
    private String City;
    private String Location;
    private String Zipcode;
    private Date dateofData;
    private float windspeed;
    private float temperature;
    private float humidity;
    private String Environment;
    private Date From;
    private Date To;
    public DataWorkRequest(){
    id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public Date getDateofData() {
        return dateofData;
    }

    public void setDateofData(Date dateofData) {
        this.dateofData = dateofData;
    }

    public float getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(float windspeed) {
        this.windspeed = windspeed;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public String getEnvironment() {
        return Environment;
    }

    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public Date getFrom() {
        return From;
    }

    public void setFrom(Date From) {
        this.From = From;
    }

    public Date getTo() {
        return To;
    }

    public void setTo(Date To) {
        this.To = To;
    }

   
}
