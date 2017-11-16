package tranning.factory;

/**
 * @author Igor Hnes on 11/16/17.
 */
public class FactoryCar {

    public static Car getImplCar(CarType carType) {
        switch (carType) {
            case MAZDA:
                return new Mazda();
            case HONDA:
                return new Honda();
            default:
                return null;
        }
    }
}
