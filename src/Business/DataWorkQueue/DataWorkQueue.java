/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DataWorkQueue;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rishabhjain
 */
public class DataWorkQueue {
    private ArrayList<DataWorkRequest> dataworkRequestList;

    public DataWorkQueue() {
        dataworkRequestList = new ArrayList<>();
    }

    public ArrayList<DataWorkRequest> getDataworkRequestList() {
        return dataworkRequestList;
    }

    public void setDataworkRequestList(ArrayList<DataWorkRequest> dataworkRequestList) {
        this.dataworkRequestList = dataworkRequestList;
    }

   public DataWorkRequest addDataWorkRequest(Date dateOfdata, float windspeed, float temperature, float humidity,Date from, Date To) {
  
       
       DataWorkRequest datarequest = new DataWorkRequest();
       datarequest.setDateofData(dateOfdata);
       datarequest.setTemperature(temperature);
       datarequest.setWindspeed(windspeed);
       datarequest.setHumidity(humidity);
       datarequest.setFrom(from);
       datarequest.setTo(To);
       dataworkRequestList.add(datarequest);
       return datarequest;
   } 
    
    public void deleteWorkREquest(DataWorkRequest a)
    {
        dataworkRequestList.remove(a);
    }
}
