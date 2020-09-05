package carcompany;

public class AudiA4CarFactory implements carFactory {

    @Override
    public Combi createCombi() {
        return new AudiA4Combi();
    }

    @Override
    public Sedan createSedan() {
        return new AudiA4Sedan();
    }
}
