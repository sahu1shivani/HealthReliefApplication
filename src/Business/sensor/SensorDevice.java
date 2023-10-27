/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.sensor;

import java.util.ArrayList;

/**
 *
 * @author shivanisahu
 */
public class SensorDevice {
    private String sensorName;
    private String sensorId;
    private Measurements measurements;
    private ArrayList<Measurements> measurementList;
    public SensorDevice()
    {
        this.measurements = new Measurements();
        measurementList= new ArrayList<>();
    }
    public String getSensorName() {
        return sensorName;
    }
    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }
    public String getSensorId() {
        return sensorId;
    }
    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }
    public Measurements getmeasurements() {
        return measurements;
    }
    @Override
    public String toString() {
        return this.sensorName;
    }

    
}
