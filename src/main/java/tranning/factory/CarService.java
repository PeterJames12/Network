package tranning.factory;

/**
 * @author Igor Hnes on 11/16/17.
 */
public class CarService {

    public static void main(String[] args) {

        final Car car = FactoryCar.getImplCar(CarType.MAZDA);
        car.drive();
    }
}
