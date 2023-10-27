/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.sensor;

/**
 *
 * @author shreya baliga
 */
public class VitalSign {
    private float oxygenRate;
    private int heartRate;
    private int systolicBloodpressure;
    private float weight;
    private String timeStamp;
    public float getOxygenRate() {
        return oxygenRate;
    }
    public void setOxygenRate(float oxygenRate) {
        this.oxygenRate = oxygenRate;
    }
    public int getHeartRate() {
        return heartRate;
    }
    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
    public int getSystolicBloodpressure() {
        return systolicBloodpressure;
    }
    public void setSystolicBloodpressure(int systolicBloodpressure) {
        this.systolicBloodpressure = systolicBloodpressure;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    @Override
    public String toString() {
        return timeStamp;
    }

    
}
