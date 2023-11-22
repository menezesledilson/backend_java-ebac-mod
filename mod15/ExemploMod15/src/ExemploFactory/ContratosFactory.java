package ExemploFactory;

public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CorollaCar(100, "cheio", "azul");
        }else {
            return  null;
        }
    }
}
