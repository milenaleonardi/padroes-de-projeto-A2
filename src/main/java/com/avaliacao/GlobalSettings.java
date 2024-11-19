package src.main.java.com.avaliacao;
public class GlobalSettings {

    private static volatile GlobalSettings instance;

    private String deviceName;
    private String connectionProtocol;
    private int timeout;

    private GlobalSettings() {
        this.deviceName = "DefaultDevice";
        this.connectionProtocol = "Wi-Fi";
        this.timeout = 30; 
    }

    public static GlobalSettings getInstance() {
        if (instance == null) { 
            synchronized (GlobalSettings.class) {
                if (instance == null) { 
                    instance = new GlobalSettings();
                }
            }
        }
        return instance;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getConnectionProtocol() {
        return connectionProtocol;
    }

    public void setConnectionProtocol(String connectionProtocol) {
        this.connectionProtocol = connectionProtocol;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public void displaySettings() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("Connection Protocol: " + connectionProtocol);
        System.out.println("Timeout: " + timeout + " seconds");
    }
}
