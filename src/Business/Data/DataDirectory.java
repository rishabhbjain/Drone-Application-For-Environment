/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Data;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rishabhjain
 */
public class DataDirectory {
        private ArrayList<Data> dataList;

    public DataDirectory() {
        dataList = new ArrayList<>();
    }

    public ArrayList<Data> getDataList() {
        return dataList;
    }

    public void setDataList(ArrayList<Data> dataList) {
        this.dataList = dataList;
    }

    
    
    public Data createData(Date date, float windspeed, float temp, float humidity){
        Data data = new Data();
        data.setDate(date);
        data.setWindspeed(windspeed);
        data.setTemperature(temp);
        data.setHumidity(humidity);
        dataList.add(data);
        return data;
    }
    
    public void deleteData(Data data){
        dataList.remove(data);
    }   
}
