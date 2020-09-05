package carcompany;

public class BMWFactory implements carFactory {
    @Override
    public Combi createCombi() {
        return new BMWCombi();
    }

    @Override
    public Sedan createSedan() {
        return new BMWSedan();
    }
}
