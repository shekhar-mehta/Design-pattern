package solid.live_refactored.isp;
public class Sensor {
    public void register(SensorClient sensorClient)
    {
        sensorClient.proximityCallback();
    }
}
