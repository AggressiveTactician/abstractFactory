import carcompany.AudiA4CarFactory;
import carcompany.BMWFactory;
import carcompany.carFactory;

public class Main {

    public static void main(String[] args) {
        carFactory audiA4 = new AudiA4CarFactory();
        CarTransport carTransport = new CarTransport(audiA4);
        carTransport.transport();

        carFactory bmw = new BMWFactory();
        CarTransport carTransport1 = new CarTransport(bmw);
        carTransport1.transport();

    }
}
