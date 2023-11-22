package ExemploFactory;

public class SemContratosFactory extends  Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new UnoCar(100, "cheio", "Preto");
        }else {
            return  null;
        }
    }
}
