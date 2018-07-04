/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Data;

import java.util.Date;

/**
 *
 * @author rishabhjain
 */
public class Data {
    
    private int DataId;
    private Date date;
    private float windspeed;
    private float temperature;
    private float humidity;
    
    private static int count = 1;
    
    public Data() {
        DataId = count;
        count++;
    }

    public int getDataId() {
        return DataId;
    }

    public void setDataId(int DataId) {
        this.DataId = DataId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
    
    
    
}
