package src.main.java.com.avaliacao;
public class main {
    public static void main(String[] args) {
        
        GlobalSettings settings = GlobalSettings.getInstance();

        // Modificando as configurações globais
        settings.setDeviceName("SmartSensor-X100");
        settings.setConnectionProtocol("Bluetooth");
        settings.setTimeout(60);

        // Exibindo as configurações
        settings.displaySettings();

        // Tentando obter outra instância do Singleton
        GlobalSettings anotherInstance = GlobalSettings.getInstance();
        System.out.println("Same instance? " + (settings == anotherInstance)); // true
    }
}
