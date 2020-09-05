import carcompany.Combi;
import carcompany.Sedan;
import carcompany.carFactory;

public class CarTransport {
    private carFactory CarFactory;

    public CarTransport(carFactory carFactory) {
        this.CarFactory = carFactory;
    }

    public void transport() {
        Sedan sedan = CarFactory.createSedan();
        System.out.println("transporting sedan" + sedan.getName());
        Combi combi = CarFactory.createCombi();
        System.out.println("transporting combi" + combi.getName());
    }
}
